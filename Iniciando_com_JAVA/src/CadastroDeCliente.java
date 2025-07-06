package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class CadastroDeCliente {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            String[] nome = new String[100];
            int[] idade = new int[100];
            long[] cpf = new long[100];
            int count = 0;
            String repetir = "sim";
            
            System.out.println("Seja bem-vindo!");
            
            while (repetir.equalsIgnoreCase("sim")) {
                System.out.println("\nO que deseja fazer?");
                System.out.println("1 - Cadastrar cliente");
                System.out.println("2 - Atualizar informações");
                System.out.println("3 - Mostrar informações");
                System.out.println("4 - Sair");
                
                int opcao = ler.nextInt();
                ler.nextLine();
                
                switch (opcao) {
                    case 1 -> {
                        if (count >= 100) {
                            System.out.println("Limite de cadastros atingido.");
                            break;
                        }
                        System.out.print("Insira o nome: ");
                        nome[count] = ler.nextLine();
                        
                        System.out.print("Insira Account_01 idade: ");
                        idade[count] = ler.nextInt();
                        
                        System.out.print("Insira o CPF: ");
                        cpf[count] = ler.nextLong();
                        
                        System.out.println("Cadastro concluído com sucesso.");
                        count++;
                    }
                        
                    case 2 -> {
                        System.out.print("Digite o índice do cliente que deseja atualizar (0 até " + (count - 1) + "): ");
                        int indiceAtualizar = ler.nextInt();
                        ler.nextLine();
                        
                        if (indiceAtualizar >= 0 && indiceAtualizar < count) {
                            System.out.println("Nome atual: " + nome[indiceAtualizar]);
                            System.out.println("Idade atual: " + idade[indiceAtualizar]);
                            System.out.println("CPF atual: " + cpf[indiceAtualizar]);
                            
                            System.out.println("Qual informação deseja atualizar? (nome / idade / cpf):");
                            String campo = ler.nextLine().toLowerCase();
                            
                            switch (campo) {
                                case "nome" -> {
                                    System.out.print("Novo nome: ");
                                    nome[indiceAtualizar] = ler.nextLine();
                                    System.out.println("Nome atualizado com sucesso.");
                                }
                                case "idade" -> {
                                    System.out.print("Nova idade: ");
                                    idade[indiceAtualizar] = ler.nextInt();
                                    System.out.println("Idade atualizada com sucesso.");
                                }
                                case "cpf" -> {
                                    System.out.print("Novo CPF: ");
                                    cpf[indiceAtualizar] = ler.nextLong();
                                    System.out.println("CPF atualizado com sucesso.");
                                }
                                default -> System.out.println("Campo inválido.");
                            }
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                        
                    case 3 -> {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nCliente " + i + ":");
                            System.out.println("Nome: " + nome[i]);
                            System.out.println("Idade: " + idade[i]);
                            System.out.println("CPF: " + cpf[i]);
                        }
                    }
                        
                    case 4 -> {
                        repetir = "não";
                        System.out.println("Encerrando o sistema. Até logo!");
                    }
                        
                    default -> System.out.println("Opção inválida.");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}