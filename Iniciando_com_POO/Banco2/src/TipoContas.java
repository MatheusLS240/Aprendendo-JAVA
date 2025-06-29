// Enum para tipos de contas bancárias
public enum TipoContas {
    CORRENTE,
    POUPANCA;

    // Converte string para tipo de conta
    public static TipoContas converterContas(String opcao) {
        if (opcao != null) {
            try {
                return TipoContas.valueOf(opcao.trim().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Opção inválida: " + opcao);
            }
        }
        System.out.println("Campo vazio ou caracteres ilegais");
        return null;
    }
}

