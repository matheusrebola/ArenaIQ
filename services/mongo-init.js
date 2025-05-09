// Criar os bancos de dados manualmente e adicionar usuários
const databases = [
  { name: "partida-db", user: "partida", password: "partida" },
  { name: "treino-db", user: "treino", password: "treino" },
  { name: "encaminhador-db", user: "encaminhador", password: "encaminhador" },
  { name: "usuarios-db", user: "usuario", password: "usuario" },
  { name: "datalake", user: "datalake", password: "datalake" }
];

databases.forEach(({ name, user, password }) => {
  db = db.getSiblingDB(name);
  db.createCollection("initCollection"); // Garante a criação do banco
  print(`Banco ${name} criado com sucesso.`);

  db.createUser({
    user: user,
    pwd: password,
    roles: [{ role: "readWrite", db: name }]
  });
  print(`Usuário ${user} criado com sucesso no banco ${name}.`);
});

print("Todos os bancos e usuários foram criados com sucesso!");
