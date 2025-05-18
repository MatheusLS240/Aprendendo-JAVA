class POO_Aluno {
    private String nome;
    private String matricula;
    private double nota1, nota2, nota3;

    public POO_Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public boolean isAprovado() {
        return calcularMedia() > 7;
    }

    public String status() {
        return "\nAluno: " + nome +
                "\nMatrícula: " + matricula +
                "\nNotas: " + nota1 + ", " + nota2 + ", " + nota3 +
                "\nMédia: " + calcularMedia() +
                "\nStatus: " + (isAprovado() ? "Aprovado" : "Reprovado");
    }
}
