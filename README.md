# 🕹️ GAMES DINIZ

> Um sistema de **E-commerce em Java** desenvolvido para gerenciamento de produtos do universo gamer, aplicando os principais conceitos da **Programação Orientada a Objetos (POO)**.

------

## 📖 Sobre o Projeto

O **GAMES DINIZ** foi desenvolvido como **Projeto Final (Performance Goal Check - Bloco 01)** do **Bootcamp Java Full Stack da Generation Brasil**.

A aplicação simula um sistema de comércio eletrônico em ambiente **Console**, permitindo realizar o gerenciamento completo de produtos através das operações de **CRUD (Create, Read, Update e Delete)**.

Mais do que entregar um sistema funcional, este projeto teve como objetivo colocar em prática conceitos fundamentais da programação orientada a objetos, organização de código e boas práticas de desenvolvimento.

------

## 🚀 Funcionalidades

- ✅ Cadastrar produtos.
- 📋 Listar todos os produtos.
- 🔎 Buscar produto pelo ID.
- ✏️ Atualizar produtos cadastrados.
- 🗑️ Excluir produtos.
- ✔️ Confirmação antes da exclusão.
- 💻 Interface interativa via Console.

------

## 🧠 Conceitos Aplicados

Durante o desenvolvimento foram utilizados diversos conceitos estudados no Bootcamp:

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Herança
- Polimorfismo
- Classes Abstratas
- Interfaces
- Collections (`ArrayList`)
- Tratamento de Exceções
- Sobrescrita de Métodos (`@Override`)
- Organização em Camadas
- CRUD completo
- Git e GitHub

------

## 📂 Estrutura do Projeto

```text
src
│
├── controller
│   └── ProdutoController.java
│
├── model
│   ├── Produto.java
│   ├── Console.java
│   └── Periferico.java
│
├── repository
│   └── ProdutoRepository.java
│
├── menu
│   └── Menu.java
```

------

## 🏗️ Arquitetura

O projeto foi organizado seguindo a separação de responsabilidades.

| Camada         | Responsabilidade                               |
| -------------- | ---------------------------------------------- |
| **Model**      | Representação dos objetos do sistema           |
| **Repository** | Contrato das operações CRUD                    |
| **Controller** | Regras de negócio e gerenciamento dos produtos |
| **Menu**       | Interação com o usuário                        |

------

## 🛠️ Tecnologias Utilizadas

- Java
- Eclipse IDE / Spring Tools Suite (STS)
- Git
- GitHub

------

## 📌 Modelo de Herança

![](https://ik.imagekit.io/JohnnieDiniz/Captura%20de%20Tela%202026-07-01%20a%CC%80s%2019.00.42.png)

------

## ▶️ Executando o Projeto

1. Clone este repositório

```bash
git clone https://github.com/JohnnieDiniz/projeto_final_bloco_01.git
```

1. Abra o projeto no Eclipse ou STS.
2. Execute a classe **Menu.java**.

------

## 🌱 Próximas Melhorias

- Persistência em Banco de Dados
- Integração com Spring Boot
- API REST
- Interface Web com React
- Sistema de autenticação
- Controle de estoque
- Pesquisa por nome
- Ordenação por preço
- Filtros por categoria

------

## 📸 Demonstração

> Em breve serão adicionadas imagens e GIFs demonstrando o funcionamento da aplicação.

------

## 👨‍💻 Desenvolvedor

### João Vitor Diniz Alves

🎓 Estudante de Ciência da Computação

☕ Bootcamp Java Full Stack - Generation Brasil

💼 Em constante evolução, buscando desenvolver soluções organizadas, escaláveis e alinhadas às boas práticas de desenvolvimento de software.

------

## ⭐ Considerações

Este projeto representa minha evolução durante o primeiro bloco do Bootcamp Java Full Stack, consolidando conhecimentos em Java e Programação Orientada a Objetos.

Cada classe, método e funcionalidade desenvolvida contribuíram para fortalecer minha lógica de programação, organização de código e entendimento da arquitetura de aplicações orientadas a objetos.

Sempre aberto a sugestões, feedbacks e oportunidades para continuar evoluindo como desenvolvedor.