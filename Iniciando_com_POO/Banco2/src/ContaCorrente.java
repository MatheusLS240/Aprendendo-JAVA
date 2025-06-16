public class ContaCorrente extends Conta {
    private double taxaManutencaoMensal = 10.0;
    private double limteChequeEspecial = 500;
    private double taxaSaque = 1.50;
    private boolean permiteChequeEspecial = true;

    // Ótimo! Vamos listar os **atributos específicos** de cada tipo de conta para te ajudar a estruturar bem a sua modelagem orientada a objetos.
    //
    //---
    //
    //## 🏦 Classe Abstrata: `Conta` (comum às duas)
    //
    //Esses são os atributos que **toda conta** (corrente ou poupança) deve ter:
    //
    //* `int numConta`
    //* `Cliente cliente` (associação com o dono da conta)
    //* `double saldo`
    //* (opcional) `String agencia`
    //* (opcional) `String tipoConta` (se quiser sem herança)
    //
    //---
    //
    //## 💳 `ContaCorrente` – atributos específicos
    //
    //São os que só fazem sentido para uma conta do tipo **corrente**:
    //
    //| Atributo                        | Descrição                                                              |
    //| ------------------------------- | ---------------------------------------------------------------------- |
    //| `double taxaManutencao`         | Valor mensal fixo cobrado da conta                                     |
    //| `double limiteChequeEspecial`   | Valor que o cliente pode usar além do saldo (saldo negativo permitido) |
    //| `double taxaSaque`              | Valor cobrado por cada saque (se houver)                               |
    //| `boolean permiteChequeEspecial` | Habilita ou desabilita o uso do limite                                 |
    //
    //---
    //
    //## 💰 `ContaPoupanca` – atributos específicos
    //
    //Para contas de **poupança**, o foco é em rendimento e segurança:
    //
    //| Atributo                       | Descrição                                       |
    //| ------------------------------ | ----------------------------------------------- |
    //| `double taxaRendimento`        | Percentual mensal de juros (ex: 0.5%)           |
    //| `LocalDate dataAniversario`    | Dia do mês em que o rendimento é aplicado       |
    //| `boolean rendimentoAutomatico` | Se os juros são aplicados automaticamente       |
    //| `int carenciaDias`             | Número de dias mínimos entre depósitos e saques |
    //
    //---
    //
    //## 🧠 Dica:
    //
    //Se você **usar herança**, `ContaCorrente` e `ContaPoupanca` vão **herdar os atributos da classe `Conta`**, e você só precisa adicionar o que é diferente em cada uma.
    //
    //---
    //
    //Se quiser, posso te ajudar a montar a estrutura de classes completa (sem código, ou com, se quiser depois). Quer montar junto?


    //Boa! O **cheque especial** é um recurso financeiro comum em contas correntes, e você pode simular ele facilmente no seu sistema.
    //
    //---
    //
    //## 💳 O que é cheque especial (na prática)?
    //
    //É um **empréstimo automático** que o banco oferece quando o saldo da conta vai para abaixo de zero.
    //Ou seja: o cliente pode **sacar ou transferir mais do que tem**, até um limite definido.
    //
    //---
    //
    //## 🧠 Exemplo real:
    //
    //* Saldo atual: R\$ 100,00
    //* Limite de cheque especial: R\$ 500,00
    //* Se o cliente tentar sacar R\$ 400, **o sistema permite**
    //* O novo saldo será: **-R\$ 300,00**, ainda dentro do limite
    //
    //---
    //
    //## 🔧 Como simular no sistema (em lógica):
    //
    //1. A conta corrente tem um atributo:
    //
    //   * `limiteChequeEspecial = 500.00`
    //
    //2. Na hora de sacar ou transferir:
    //
    //   * Em vez de validar só `saldo >= valor`
    //   * Valida: `saldo + limiteChequeEspecial >= valor`
    //
    //3. Se o saldo for negativo:
    //
    //   * Você pode cobrar **juros** depois ou mostrar que está “usando o cheque especial”
    //
    //---
    //
    //## 📦 Atributos sugeridos para `ContaCorrente`
    //
    //| Atributo                       | Tipo                                              | Descrição |
    //| ------------------------------ | ------------------------------------------------- | --------- |
    //| `double limiteChequeEspecial`  | Limite que o cliente pode usar além do saldo      |           |
    //| `double jurosChequeEspecial`   | Percentual de juros aplicado sobre saldo negativo |           |
    //| `boolean usandoChequeEspecial` | (opcional) Se a conta está negativada             |           |
    //
    //---
    //
    //## 💡 Coisas que você pode implementar depois
    //
    //* Metodo para **calcular os juros** sobre o valor usado do cheque especial
    //* Limitação: cliente só pode usar se estiver habilitado (`permiteChequeEspecial == true`)
    //* Mostrar no extrato quando o saldo está negativo
    //
    //---
    //
    //Se quiser, posso te ajudar a estruturar a lógica do saque já incluindo esse comportamento do cheque especial. Quer fazer isso?

    //Perfeito, vamos focar só na **ideia e arquitetura do projeto bancário**, sem código.
    //
    //---
    //
    //## 💡 **Projeto: Sistema Bancário Simples**
    //
    //Um sistema para simular as operações básicas de um banco, voltado para prática de orientação a objetos e modelagem de dados. Ideal para aprofundar conceitos como encapsulamento, herança, polimorfismo e estrutura de dados.
    //
    //---
    //
    //### 🎯 **Objetivos do Projeto**
    //
    //* Simular a criação e gestão de contas bancárias
    //* Realizar operações como saque, depósito e transferência
    //* Aprender a estruturar dados e classes de forma limpa e reutilizável
    //* Trabalhar com coleções para armazenar múltiplas contas
    //* Evoluir para arquivos, interface gráfica ou até APIs REST
    //
    //---
    //
    //## 📐 **Arquitetura Conceitual**
    //
    //### 📁 Entidades:
    //
    //* **Cliente**
    //
    //  * Nome
    //  * CPF
    //  * (Possivelmente e-mail ou telefone)
    //
    //* **Conta (abstrata)**
    //
    //  * Número único da conta
    //  * Cliente associado
    //  * Saldo
    //  * Métodos: depositar, sacar, transferir
    //  * Tipo de conta (corrente ou poupança)
    //
    //* **Conta Corrente**
    //
    //  * Permite saque, depósito e transferências
    //  * Pode incluir taxas
    //
    //* **Conta Poupança**
    //
    //  * Pode render juros
    //  * Restrições de saque ou dias específicos
    //
    //* **Banco**
    //
    //  * Armazena uma lista de contas
    //  * Permite criar e consultar contas
    //  * Faz a ponte entre o "usuário" e os dados
    //
    //---
    //
    //## 🔄 **Fluxo de Operações**
    //
    //1. **Criar cliente e conta**
    //
    //   * Solicita nome e CPF
    //   * Escolhe tipo de conta
    //
    //2. **Consultar saldo ou dados da conta**
    //
    //   * Mostra informações da conta
    //
    //3. **Depositar**
    //
    //   * Soma valor ao saldo da conta
    //
    //4. **Sacar**
    //
    //   * Verifica se há saldo suficiente
    //   * Subtrai do saldo
    //
    //5. **Transferir**
    //
    //   * Solicita número da conta destino
    //   * Verifica saldo e transfere valores entre contas
    //
    //6. **Listar contas**
    //
    //   * Mostra todas as contas criadas com seus dados
    //
    //---
    //
    //## 🧠 **Conceitos de Programação Aplicados**
    //
    //* **Encapsulamento:** proteger dados com métodos de acesso
    //* **Herança:** contas herdando de uma classe abstrata
    //* **Polimorfismo:** tratar diferentes tipos de conta de forma unificada
    //* **Coleções:** usar listas para armazenar várias contas
    //* **Separação de responsabilidades:** banco cuida da lógica, conta dos dados
    //
    //---
    //
    //## 🚀 **Evoluções possíveis**
    //
    //* **Persistência de dados:**
    //
    //  * Salvar em arquivo `.txt`, `.csv` ou banco de dados
    //
    //* **Interface Gráfica:**
    //
    //  * Criar um menu visual com Swing ou JavaFX
    //
    //* **API REST:**
    //
    //  * Criar uma API com Spring Boot para gerenciar as contas via JSON
    //
    //* **Sistema de autenticação:**
    //
    //  * Cada conta tem login e senha
    //
    //* **Histórico de transações:**
    //
    //  * Lista de depósitos, saques e transferências
    //
    //---
    //
    //Se quiser, posso montar um plano de desenvolvimento passo a passo, tipo "o que fazer em cada etapa". Quer isso?
}
