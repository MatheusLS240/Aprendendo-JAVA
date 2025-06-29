import java.util.*;

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

    public static String verificarCampo(Scanner sc) throws Exception {
        String valor = sc.nextLine();
        int i = 1;
        while (valor.isEmpty()) {
            if(i <= 3) {
                System.err.print("Campo não pode ser vazio! Tente novamente: ");
                valor = sc.nextLine();
            } else {
                throw new Exception();
            }
            i++;
        }
        return valor;

    }

    public static String verificarGenero(Scanner sc) throws Exception {
        String genero = null;
            do {
                genero = verificarCampo(sc);
                genero = toCapitalize(sc);
            } while (!genero.equals("Masculino") && !genero.equals("Feminino"));
        return genero;
    }

    public static String toCapitalize(Scanner sc) throws Exception {
        String campo = sc.nextLine();

        campo = verificarCampo(sc);

        return campo.substring(0, 1).toUpperCase() + campo.substring(1);
    }
}

