// -- Tipos de informações que um cliente pode e deve inserir --
public enum CampoUsuario {
    NOME,
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
}

