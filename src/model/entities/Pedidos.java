package model.entities;

import java.util.List;

public class Pedidos {

    private String nomePedido;
    private Integer quantidadePedido;

    private Double valorTotal;


    public Pedidos() {
    }


    public Pedidos(String nomePedido, Integer quantidadePedido, Double valorTotal) {
        this.nomePedido = nomePedido;
        this.quantidadePedido = quantidadePedido;
        this.valorTotal = valorTotal;

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

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double valTotal(Produtos produtos) {
        return getQuantidadePedido() * produtos.getValorP();
    }

    @Override
    public String toString() {
        return nomePedido + ", " + quantidadePedido + ", " + String.format("%.2f",valorTotal);
    }
}
