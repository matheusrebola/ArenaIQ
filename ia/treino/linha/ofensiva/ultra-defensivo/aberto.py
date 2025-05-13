from pymongo import MongoClient

# === CONFIGURAÇÃO DOS ENUMS PARA FILTRO ===
ELINHA = "OFENSIVA"
EMODOJOGO = "ULTRA_DEFENSIVO"
ELARGURA = "ABERTO"

# === CONEXÃO COM O BANCO ===
uri = "mongodb://treino:treino@localhost:61000/treino-db"
client = MongoClient(uri)
db = client["treino-db"]
linhas_collection = db["linhas"]

# === FILTRO DA CONSULTA ===
filtro = {
    "linha": ELINHA,
    "altura": EMODOJOGO,
    "largura": ELARGURA
}

# === CONSULTA E EXTRAÇÃO DAS URLs ===
documentos_filtrados = list(linhas_collection.find(filtro, {"url": 1, "_id": 0}))
urls = [doc["url"] for doc in documentos_filtrados if "url" in doc]

# === EXIBIR URLs NO CONSOLE ===
print(f"Total de URLs encontradas: {len(urls)}\n")
for url in urls:
    print(url)