package model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lojista extends Produtos {
    private String nomeFantasia;
    private String senha;

    private Cliente cliente;

    private List<Produtos> produtos = new ArrayList<>();

    public Lojista() {
    }

    public Lojista(String nomeFantasia, String senha) {
        this.nomeFantasia = nomeFantasia;
        this.senha = senha;
    }

    public Lojista(String nomeFantasia, String senha, Cliente cliente, List<Produtos> produtos) {
        this.nomeFantasia = nomeFantasia;
        this.senha = senha;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public boolean valLoginLojista() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu login e senha para abrir sua lanchonete: ");
        String nomeL = sc.nextLine();
        String senhaL = sc.nextLine();
        if (getNomeFantasia().equals(nomeL) && getSenha().equals(senhaL)) {
            System.out.println("Login correto!!");
            return true;
        } else {
            System.out.println("Login ou senha incorreto!!");
            System.out.println("Tente de novo: ");
            valLoginLojista();
        }
        return false;
    }

    public List<Produtos> addProdutosInEstoque() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos produtos deseja adicionar: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Produtos> produtosLanchonete = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "ª produto: ");
            String nomeP = sc.nextLine();
            System.out.print("Digite o valor do " + (i + 1) + "ª produto: ");
            double valorP = sc.nextDouble();
            System.out.print("Digite a quantidade do " + (i + 1) + "ª produto: ");
            int quantidadeP = sc.nextInt();
            sc.nextLine();
            produtosLanchonete.add(new Produtos(nomeP, valorP, quantidadeP));
        }
        return produtosLanchonete;
    }

    public void mostraPedido(Lojista lojista) {

        System.out.println("Cliente: " + getCliente().getNome());
        for (Produtos p : getProdutos()){
            System.out.println("Pedido: "+p.getNomeP()+" , "+p.getValorP());
        }
    }


}