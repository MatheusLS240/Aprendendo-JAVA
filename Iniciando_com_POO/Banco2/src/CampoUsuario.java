import java.util.*;

// -- Tipos de informações que um cliente pode e deve inserir --
public enum CampoUsuario {
    NOME,
    GENERO,
    CPF,
    EMAIL,
    TELEFONE,
    SENHA,
    TODOS;


    public static CampoUsuario converterCampo(String opcao) {
        if (opcao != null) {
            try {
                return CampoUsuario.valueOf(opcao.trim().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Opção inválida: " + opcao);
            }
        }
        System.out.println("Campo vazio ou caracteres ilegais");
        return null;
    }

    public static String verificarGenero(Scanner sc) {
        int i = 0;
        String genero = null;
        do {
            if (i > 0) {
                System.err.print("Gênero inválido! Tente novamente: ");
            }

            genero = sc.nextLine().toLowerCase();
            i++;
        } while (!genero.equals("masculino") && !genero.equals("feminino"));

        return genero;
    }
}

