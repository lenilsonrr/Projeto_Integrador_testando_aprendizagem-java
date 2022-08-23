package model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lojista {
    private String nomeLoja;
    private String senhaLoja;

    private Cliente cliente;

    private List<Produtos> produtos = new ArrayList<>();

    public Lojista() {
    }

    public Lojista(String nomeFantasia, String senha) {
        this.nomeLoja = nomeFantasia;
        this.senhaLoja = senha;
    }

    public Lojista(String nomeLoja, String senhaLoja, Cliente cliente, List<Produtos> produtos) {
        this.nomeLoja = nomeLoja;
        this.senhaLoja = senhaLoja;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getSenhaLoja() {
        return senhaLoja;
    }

    public void setSenha(String senhaLoja) {
        this.senhaLoja = senhaLoja;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produtos> getProdutosLojista() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public Lojista fazendocadastro() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o nome da sua loja: ");
        setNomeLoja(sc.nextLine());
        System.out.print("Qual a sua senha: ");
        setSenha(sc.nextLine());
        return new Lojista(getNomeLoja(), getSenhaLoja());
    }

    public void valLoginLojista() {
        Scanner sc = new Scanner(System.in);
        System.out.println("############ Para validar seus dados digite login e senha corretos ########## ");
        System.out.println();
        System.out.print("Digite seu login: ");
        String nomeL = sc.nextLine();
        System.out.print("Digite a sua senha: ");
        String senhaL = sc.nextLine();
        System.out.println();
        if (getNomeLoja().equals(nomeL) && getSenhaLoja().equals(senhaL)) {
            System.out.println("Login correto!!");
            System.out.println();
        } else {
            System.out.println("Login ou senha incorreto!!");
            System.out.println("Tente de novo: ");
            System.out.println();
            valLoginLojista();
        }
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

    public void mostraEstoque(Lojista lojista) {
        System.out.println();
        System.out.println("****** Produtos disponiveis *******");
        for (Produtos p : getProdutosLojista()) {
            System.out.println(p.getNomeP() + ", R$: " + String.format("%.2f", p.getValorP()) + ", " + p.getQuantidadeP() + " UND, R$: " + String.format("%.2f", p.ValTotalProdudo(p.getValorP(), p.getQuantidadeP())));
        }
    }

    public Integer baixaEstoque(List<Produtos> produtos, List<Pedidos> pedidos) {
        int soma = 0;
        for (Produtos p : getProdutosLojista()) {
            for (Pedidos pe : getCliente().getPedidos()) {
                if (pe.getNomePedido().equals(p.getNomeP())) {
                    soma = p.getQuantidadeP() - pe.getQuantidadePedido();
                    p.setQuantidadeP(soma);
                }
            }
        }
        return soma;
    }

    public void mostraNovoEstoque(Lojista lojista) {
        System.out.println();
        System.out.println("****** Produtos disponiveis *******");
        for (Produtos p : getProdutosLojista()) {
            System.out.println(p.getNomeP() + ", R$: " + String.format("%.2f", p.getValorP()) + ", " + p.getQuantidadeP() + " UND, R$: " + String.format("%.2f", p.ValTotalProdudo(p.getValorP(), p.getQuantidadeP())));
        }
        System.out.println();
    }
}