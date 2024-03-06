package com.example.dr3_tp2.model.domain;

public class Club {

    private String nome;
    private int anoCriacao;

    public Club() {}

    public Club(String n, int ac) {
        this.nome = n;
        this.anoCriacao = ac;
    }

    public void setNome(String n) {
        this.nome = n;
    }
    public String getNome() {
        return this.nome;
    }

    public void setAno(int ac) {
        this.anoCriacao = ac;
    }
    public int getAno() {
        return this.anoCriacao;
    }


}
