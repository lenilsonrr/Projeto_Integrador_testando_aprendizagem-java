package model.entities;


public class Produtos  {
    private String nomeP;
    private Double valorP;
    private Integer quantidadeP;

    public Produtos() {
    }

    public Produtos(String nomeP, Double valorP) {
        this.nomeP = nomeP;
        this.valorP = valorP;
    }

    public Produtos(String nomeP, Integer quantidadeP) {
        this.nomeP = nomeP;
        this.quantidadeP = quantidadeP;
    }

    public Produtos(String nome, Double valor, Integer quantidade) {
        this.nomeP = nome;
        this.valorP = valor;
        this.quantidadeP = quantidade;
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nome) {
        this.nomeP = nome;
    }

    public Double getValorP() {
        return valorP;
    }

    public void setValorP(Double valor) {
        this.valorP = valor;
    }

    public Integer getQuantidadeP() {
        return quantidadeP;
    }

    public void setQuantidadeP(Integer quantidadeP) {
        this.quantidadeP = quantidadeP;
    }

    public double ValTotalProdudo() {
        return getQuantidadeP() * getValorP();
    }
}