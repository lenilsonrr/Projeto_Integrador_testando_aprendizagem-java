package model.entities;

public class Pedidos {

    private String nomePedido;
    private Integer quantidadePedido;

    public Pedidos() {
    }

    public Pedidos(String nome, Integer quantidade) {
        this.nomePedido = nome;
        this.quantidadePedido = quantidade;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public Integer getQuantidadePedido() {
        return quantidadePedido;
    }

    public void setQuantidadePedido(Integer quantidadePedido) {
        this.quantidadePedido = quantidadePedido;
    }
}
