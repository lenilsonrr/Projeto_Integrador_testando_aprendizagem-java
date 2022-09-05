package model.entities;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    private String nome;
    private String senha;

    private List<Pedidos> pedidos = new ArrayList<>();

    public Cliente() {
        ;
    }

    public Cliente(String nome, String senha) {
        super();
        this.nome = nome;
        this.senha = senha;
    }

    public Cliente(String nome, String senha, List<Pedidos> pedidos) {
        this.nome = nome;
        this.senha = senha;
        this.pedidos = pedidos;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void addPedido(Pedidos pedido) {
        getPedidos().add(pedido);
    }

    public void removerPedido(Pedidos pedido) {
        getPedidos().remove(pedido);
    }


    public void fazendocadastroCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("*** Bem vindo ao Agility sistema de compras e retiradas rapidas ***");
        System.out.println("____ Para fazer compras basta cadastrar login e senha ______");
        System.out.println();
        System.out.print("Qual o nome do usuario: ");
        setNome(sc.nextLine());
        System.out.print("Qual a sua senha: ");
        setSenha(sc.nextLine());
        new Cliente(getNome(), getSenha());
    }

    public void valLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*************** Para validar seus dados digite login e senha corretos ***************");
        System.out.print("Digite seu login: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();
        System.out.println();
        if (getNome().equals(nome) && getSenha().equals(senha)) {
            System.out.println("Login efetuado com sucesso! ");
            System.out.println();
        } else {
            System.out.println("Login ou senha incorreto!!");
            System.out.println("Tente de novo: ");
            System.out.println();
            valLogin();
        }
    }

    public void mostraEstoque(Lojista lojista) {
        System.out.println();
        System.out.println("****** Produtos disponiveis *******");
        for (Produtos p : lojista.getProdutosLojista()) {
            System.out.println(p.getNomeP() + ", R$: " + String.format("%.2f", p.getValorP()) + ", " + p.getQuantidadeP() + " UND, R$: " + String.format("%.2f", p.ValTotalProdudo()));
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return nome  ;
    }
}
