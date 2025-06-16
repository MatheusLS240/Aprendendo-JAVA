public enum TipoContas {
    CORRENTE,
    POUPANCA;

    public static TipoContas converterOpcao (String opcao) {
        if(opcao != null) {
            return TipoContas.valueOf(opcao.trim().toUpperCase());
        }
        System.out.println("Campo vazio ou caracteres ilegais");
        return null;
    }
}
