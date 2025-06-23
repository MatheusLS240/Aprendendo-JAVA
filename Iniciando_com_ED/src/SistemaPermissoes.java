import java.util.*;

public class SistemaPermissoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Set<String>> usuarios = new HashMap<>();

        int opcao;

        do {
            System.out.println("\n===== MENU DE PERMISSÕES =====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Atribuir permissão ao usuário");
            System.out.println("3 - Verificar permissão do usuário");
            System.out.println("4 - Listar usuários por permissão");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do usuário: ");
                    String nome = sc.nextLine();
                    if (usuarios.containsKey(nome)) {
                        System.out.println("Usuário já cadastrado.");
                    } else {
                        usuarios.put(nome, new HashSet<>());
                        System.out.println("Usuário " + nome + " cadastrado com sucesso.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do usuário: ");
                    String usuario = sc.nextLine();
                    if (!usuarios.containsKey(usuario)) {
                        System.out.println("Usuário não encontrado.");
                    } else {
                        System.out.print("Digite a permissão (ADMIN, USER, MOD...): ");
                        String permissao = sc.nextLine().toUpperCase();
                        usuarios.get(usuario).add(permissao);
                        System.out.println("Permissão atribuída com sucesso.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do usuário: ");
                    String user = sc.nextLine();
                    if (!usuarios.containsKey(user)) {
                        System.out.println("Usuário não encontrado.");
                    } else {
                        System.out.print("Digite a permissão que deseja verificar: ");
                        String perm = sc.nextLine().toUpperCase();
                        if (usuarios.get(user).contains(perm)) {
                            System.out.println(user + " possui a permissão " + perm);
                        } else {
                            System.out.println(user + " NÃO possui a permissão " + perm);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Digite a permissão que deseja buscar (ex: ADMIN): ");
                    String tipoPermissao = sc.nextLine().toUpperCase();
                    System.out.println("Usuários com a permissão " + tipoPermissao + ":");
                    usuarios.forEach((nomeUsuario, permissoes) -> {
                        if (permissoes.contains(tipoPermissao)) {
                            System.out.println("- " + nomeUsuario);
                        }
                    });
                    break;

                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
