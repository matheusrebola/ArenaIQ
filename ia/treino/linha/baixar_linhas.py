import csv
import os
import requests

# Cria diretório de imagens, se não existir
os.makedirs("imagens", exist_ok=True)

with open("../linhas.csv", "r", encoding="utf-8") as f_in, \
     open("linhas_local.csv", "w", encoding="utf-8", newline="") as f_out:

    reader = csv.DictReader(f_in, delimiter=";")
    fieldnames = ["linha", "altura", "largura", "imagem"]
    writer = csv.DictWriter(f_out, fieldnames=fieldnames, delimiter=";")
    writer.writeheader()

    for i, row in enumerate(reader, start=1):
        url = row["url"]
        if not url:
            continue

        filename = f"imagens/img_{i:04}.jpeg"
        try:
            response = requests.get(url, timeout=10)
            response.raise_for_status()
            with open(filename, "wb") as img_file:
                img_file.write(response.content)
            print(f"✔️ Baixada: {filename}")

            writer.writerow({
                "linha": row["linha"],
                "altura": row["altura"],
                "largura": row["largura"],
                "imagem": filename
            })

        except Exception as e:
            print(f"⚠️ Erro ao baixar {url}: {e}")
