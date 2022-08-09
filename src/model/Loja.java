package model;

import model.entities.Lojista;

public class Loja extends Lojista {
    private String produto;
    private Double valor;

    public Loja(){
        super();
    }

    public Loja(String produto, Double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public Loja(String CNPJ, String nomeFantasia, String senha, String produto, Double valor) {
        super(CNPJ, nomeFantasia, senha);
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
