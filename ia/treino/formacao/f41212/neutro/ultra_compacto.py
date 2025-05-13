from pymongo import MongoClient

# === CONFIGURAÇÃO DOS ENUMS PARA FILTRO ===
EFORMACAO = "F41212"
EMODOJOGO = "NEUTRO"
ECOMPACTACAO = "ULTRA_COMPACTO"

# === CONEXÃO COM O BANCO ===
uri = "mongodb://treino:treino@localhost:61000/treino-db"
client = MongoClient(uri)
db = client["treino-db"]
formacoes_collection = db["formacoes"]

# === FILTRO DA CONSULTA ===
filtro = {
    "formacao": EFORMACAO,
    "modo": EMODOJOGO,
    "compacatacao": ECOMPACTACAO
}

# === CONSULTA E EXTRAÇÃO DAS URLs ===
documentos_filtrados = list(formacoes_collection.find(filtro, {"url": 1, "_id": 0}))
urls = [doc["url"] for doc in documentos_filtrados if "url" in doc]

# === EXIBIR URLs NO CONSOLE ===
print(f"Total de URLs encontradas: {len(urls)}\n")
for url in urls:
    print(url)
    
nome_arquivo = f"formacoes_{EFORMACAO.lower()}_{EMODOJOGO.lower()}_{ECOMPACTACAO.lower()}.txt"
with open(nome_arquivo, "w", encoding="utf-8") as f:
    for url in urls:
        f.write(url + "\n")

print(f"\nURLs salvas em '{nome_arquivo}'")