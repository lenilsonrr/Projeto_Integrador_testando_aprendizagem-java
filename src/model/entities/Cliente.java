package model.entities;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Lojista {

    private String nome;
    private String senha;

    private List<Pedidos> pedidos = new ArrayList<>();

    public Cliente() {
        super();
    }

    public Cliente(String nome, String senha) {
        super();
        this.nome = nome;
        this.senha = senha;
    }

    public Cliente(String nome, String senha, List<Pedidos> pedidos) {
        super();
        this.nome = nome;
        this.senha = senha;
        this.pedidos = pedidos;
    }

    public Cliente(String nomeLoja, String senhaLoja, Cliente cliente, List<Produtos> produtos, List<Pedidos> pedidos) {
        super(nomeLoja, senhaLoja, cliente, produtos);
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

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente fazendocadastroCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("*** Bem vindo ao Agility sistema de compras e retiradas rapidas ***");
        System.out.println("____ Para fazer compras basta cadastrar login e senha ______");
        System.out.println();
        System.out.print("Qual o nome do usuario: ");
        setNome(sc.nextLine());
        System.out.print("Qual a sua senha: ");
        setSenha(sc.nextLine());
        return new Cliente(getNome(),getSenha());
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
            System.out.println("Login efetuado! ");
            System.out.println();
        } else {
            System.out.println("Login ou senha incorreto!!");
            System.out.println("Tente de novo: ");
            System.out.println();
            valLogin();
        }
    }

    @Override
    public void mostraEstoque(Lojista lojista) {
        System.out.println();
        System.out.println("****** Produtos disponiveis *******");
        for (Produtos p : getProdutosLojista()) {
            System.out.println(p.getNomeP() + ", R$: " + String.format("%.2f", p.getValorP()) + ", " + p.getQuantidadeP() + " UND, R$: "+String.format("%.2f",p.ValTotalProdudo(p.getValorP(), p.getQuantidadeP())));
        }
        System.out.println();
    }

    public List<Pedidos> fazerPedido(Lojista lojista) {
        Scanner sc = new Scanner(System.in);

        List<Pedidos> pedidoCliente = new ArrayList<>();

        for (int i = 0; i < lojista.getProdutosLojista().size(); i++) {
            System.out.print("Digite o nome do " + (i + 1) + "ª produto desejado: ");
            String nomeCP = sc.nextLine();
            System.out.print("Digite a quantidade: ");
            int quantidadeCP = sc.nextInt();
            sc.nextLine();
            //  char resp = 0;
            //System.out.println("Deseja finalizar seu pedido: s-(sim) n-(nao)");
            // resp = sc.next().charAt(0);
            //if(resp=='n'){

            // }
            pedidoCliente.add(new Pedidos(nomeCP, quantidadeCP));
            }
            return pedidoCliente;
    }

    public void pedidoCliente(Lojista lojista,Cliente cliente ){
        for (Pedidos p : cliente.getPedidos()) {
            for (Produtos p1 : lojista.getProdutosLojista()) {
                System.out.println(getNome() + ", " + p.getNomePedido() + ", " + p.getQuantidadePedido() + ", R$: " + String.format("%.2f", p.getQuantidadePedido() * p1.getValorP()));

            }     }
    }
}