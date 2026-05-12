# Games API

Projeto desenvolvido com Java 17 e Spring Boot 3.x.

A aplicação simula um sistema de jogadores com cálculo de bônus de XP utilizando os padrões de projeto Strategy e Singleton.

---

# Tecnologias

* Java 17
* Spring Boot 3
* Maven
* Spring Data JPA
* H2 Database

---

# Funcionalidades

* Criar jogadores
* Listar jogadores
* Calcular bônus de XP
* Contador global de jogadores

---

# Padrões Utilizados

## Strategy

Usado para calcular bônus de XP de acordo com o tipo do personagem.

* Warrior → level * 100
* Mage → level * 150

## Singleton

Usado na classe `SystemConfig` para manter uma única configuração global do sistema.

---

# Executar Projeto

```bash
mvn spring-boot:run
```

---

# URL da Aplicação

```text
http://localhost:8080
```

---

# H2 Console

```text
http://localhost:8080/h2-console
```

## Dados

```text
JDBC URL: jdbc:h2:mem:gamesdb
User: sa
Password:
```

---

# Endpoints

## Criar Player

```http
POST /players
```

### JSON

```json
{
  "name": "Arthur",
  "characterType": "WARRIOR",
  "level": 10,
  "xp": 500
}
```

---

## Listar Players

```http
GET /players
```

---

## Calcular Bonus

```http
GET /players/1/bonus
```

---
Projeto criado para estudos com Spring Boot e padrões de projeto em Java.

