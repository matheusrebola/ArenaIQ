import csv
from pymongo import MongoClient

# URI de conexão
uri = "mongodb://treino:treino@localhost:61000/treino-db"

# Conectar ao MongoDB
client = MongoClient(uri)
db = client["treino-db"]

# === Função genérica para exportar documentos em CSV (excluindo _id) ===
def salvar_em_csv(nome_arquivo, documentos):
    if not documentos:
        print(f"[AVISO] Nenhum dado para salvar em '{nome_arquivo}'")
        return

    # Remover campo '_id' de cada documento
    for doc in documentos:
        doc.pop("_id", None)

    campos = documentos[0].keys()

    with open(nome_arquivo, "w", encoding="utf-8", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=campos, delimiter=";")
        writer.writeheader()
        for doc in documentos:
            writer.writerow(doc)

    print(f"[OK] Arquivo salvo: {nome_arquivo} ({len(documentos)} registros)")

# === Funções para carregar coleções ===
def carregar_eventos():
    return list(db["eventos"].find())

def carregar_formacoes():
    return list(db["formacoes"].find())

def carregar_linhas():
    return list(db["linhas"].find())

def carregar_movimentacoes():
    return list(db["movimentacoes"].find())

# === Processamento e exportação ===
eventos = carregar_eventos()
formacoes = carregar_formacoes()
linhas = carregar_linhas()
movimentacoes = carregar_movimentacoes()

salvar_em_csv("eventos.csv", eventos)
salvar_em_csv("formacoes.csv", formacoes)
salvar_em_csv("linhas.csv", linhas)
salvar_em_csv("movimentacoes.csv", movimentacoes)