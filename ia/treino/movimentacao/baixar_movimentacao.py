import csv
import os
import requests

os.makedirs("videos", exist_ok=True)

with open("../eventos.csv", "r", encoding="utf-8") as f_in, \
     open("eventos_local.csv", "w", encoding="utf-8", newline="") as f_out:

    reader = csv.DictReader(f_in, delimiter=";")
    fieldnames = ["evento", "motivo", "qualidade", "ator", "receptor"]
    writer = csv.DictWriter(f_out, fieldnames=fieldnames, delimiter=";")
    writer.writeheader()

    for i, row in enumerate(reader, start=1):
        url = row["url"]
        if not url:
            continue

        filename = f"videos/video_{i:04}.mp4"
        try:
            response = requests.get(url, timeout=10)
            response.raise_for_status()
            with open(filename, "wb") as video_file:
                video_file.write(response.content)
            print(f"✔️ Baixada: {filename}")

            writer.writerow({
                "evento": row["evento"],
                "motivo": row["motivo"],
                "qualidade": row["qualidade"],
                "ator": row["ator"],
                "receptor": row["receptor"],
                "video": filename
            })

        except Exception as e:
            print(f"⚠️ Erro ao baixar {url}: {e}")
