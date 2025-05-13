import csv
import os
import requests

# Cria diretório de imagens, se não existir
os.makedirs("imagens", exist_ok=True)

with open("../formacoes.csv", "r", encoding="utf-8") as f_in, \
     open("formacoes_local.csv", "w", encoding="utf-8", newline="") as f_out:

    reader = csv.DictReader(f_in, delimiter=";")
    fieldnames = ["formacao", "modo", "compacatacao", "imagem"]
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
                "formacao": row["formacao"],
                "modo": row["modo"],
                "compacatacao": row["compacatacao"],
                "imagem": filename
            })

        except Exception as e:
            print(f"⚠️ Erro ao baixar {url}: {e}")
