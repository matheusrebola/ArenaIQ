import os
import subprocess

# Lista de diretórios dos microserviços
services = [
    "consulta",
    "dados-historicos",
    "encaminhador/detalhe-evento",
    "encaminhador/evento",
    "encaminhador/formacao",
    "encaminhador/linha",
    "encaminhador/movimentacao",
    "partida",
    "recebidor/detalhe-evento",
    "recebidor/evento",
    "recebidor/formacao",
    "recebidor/linha",
    "recebidor/movimentacao",
    "treino",
    "persistencia/detalhe-evento",
    "persistencia/evento",
    "persistencia/formacao",
    "persistencia/linha",
    "persistencia/movimentacao"
]

def build_service(service_path):
    """Executa mvn clean package no diretório do serviço."""
    print(f"📦 Buildando {service_path} ...")
    try:
        subprocess.run(["mvn", "clean", "package", "-DskipTests"], cwd=service_path, check=True)
        print(f"✅ {service_path} buildado com sucesso!")
    except subprocess.CalledProcessError:
        print(f"❌ Erro ao buildar {service_path}")

def restart_docker():
    """Reinicia o docker-compose."""
    print("🛑 Parando docker-compose...")
    subprocess.run(["docker-compose", "down"], check=True)
    print("🚀 Subindo docker-compose...")
    subprocess.run(["docker-compose", "up", "-d", "--build"], check=True)
    print("✅ Docker-compose reiniciado!")

def main():
    restart_docker()
    print("🎉 Todos os serviços foram buildados e o docker-compose foi reiniciado!")
    """Executa o build de todos os serviços e reinicia o docker-compose."""
    for service in services:
        build_service(service)
    

if __name__ == "__main__":
    main()
