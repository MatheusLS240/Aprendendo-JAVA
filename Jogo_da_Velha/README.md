# 🎮 Jogo da Velha (Java CLI)

Este é um jogo da velha (tic-tac-toe) simples e funcional feito em **Java**, com interface em linha de comando (CLI), usando `Scanner` para entrada de dados do usuário e `Random` para definir quem começa.

---

## 📋 Descrição

- O tabuleiro é uma matriz 3x3 representada por `String[][]`
- Os jogadores se alternam entre **"O"** e **"X"**
- A posição no tabuleiro é escolhida pelo usuário com entrada numérica (linha e coluna de 1 a 3)
- A ordem de quem começa é **sorteada aleatoriamente**
- Validações de jogada inválida ou repetida estão implementadas
- Tratamento de exceção impede travamento se for digitado algo que não seja número

---

## 📦 Recursos usados

- `Scanner` – para entrada de dados via teclado
- `Random` – para sorteio do jogador inicial
- `try-catch` – para evitar crash com entradas inválidas
- Impressão estilizada do tabuleiro com numeração de linha e coluna
- Mensagens claras de erro e feedback visual a cada jogada

---

## 🕹️ Como jogar

1. Compile e execute o programa:

        javac App.java

2. O jogo irá sortear automaticamente quem começa (X ou O)

3. Na sua vez, digite o número da linha e da coluna desejada:

        Digite a linha desejada: 2
        Digite a coluna: 1

4. O programa exibirá o tabuleiro atualizado a cada jogada

5. Caso a jogada seja inválida (fora do intervalo ou posição ocupada), o programa solicitará uma nova tentativa

---

## 🧑‍💻 Autor

Desenvolvido por Matheus como parte do curso de Desenvolvimento de Sistemas.

---

## 📝 Licença

Este projeto é de uso educacional. Pode ser modificado e distribuído livremente.
