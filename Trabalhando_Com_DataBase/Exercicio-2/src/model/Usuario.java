package model;

import util.NullChecker;

public class Usuario {
    private int id_usuario;
    private String nome_usuario;
    private String email;

    public Usuario(int id_usuario, String nome_usuario, String email) {
        this.id_usuario = id_usuario;
        setNome_usuario(nome_usuario);
        setEmail(email);
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        if(NullChecker.isNullOrEmpty(nome_usuario)) {
            throw new IllegalArgumentException("Nome vazio!");
        }
        this.nome_usuario = nome_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (NullChecker.isNullOrEmpty(email)) {
            throw new IllegalArgumentException("Email vazio!");
        }

        if (!(email.contains("@gmail.com") || email.contains("@hotmail.com"))) {
            throw new IllegalArgumentException("Email inválido!");
        }

        this.email = email;
    }
}
