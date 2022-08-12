package model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Cliente extends Produtos {

    private String nome;
    private String senha;
    private String email;
    private String cel;

    private Integer id;

    public Cliente() {
        super();
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Cliente(String nome, String senha, String email, String cel, Integer id) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.cel = cel;
        this.id = id;
    }

    public Cliente(String nome, Double valor, Integer quantidade, String nome1, String senha, String email, String cel) {
        super(nome, valor, quantidade);
        this.nome = nome1;
        this.senha = senha;
        this.email = email;
        this.cel = cel;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public Integer getId() {
        return id;
    }

    public Integer gerandoId() {
        int novoId = 0;
        Random random = new Random();
        novoId = random.nextInt(100);
        return novoId;
    }

    public String valLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu login e senha para fazer suas compras: ");
        String nome = sc.nextLine();
        String senha = sc.nextLine();
        if (getNome().equals(nome) && getSenha().equals(senha)) {
            System.out.println("Login efetuado! ");
            Produtos p = new Produtos(getNomeP(), getValorP(), getQuantidadeP());
            System.out.println("Pedido: "+gerandoId()+", "+getNome() + ", " + getNomeP() + ", " + getQuantidadeP());
        } else {
            System.out.println("Login ou senha incorreto!!");
            System.out.println("Tente de novo: ");
            valLogin();
        }
        return null;
    }

//    public void pedidoCliente() {
//        Random random = new Random();
//        Scanner sc = new Scanner(System.in);
//        Cliente c = new Cliente();
//        int id = random.nextInt(100);
//        //if (c.valLogin() != null ) {
//            if (id > 0) {
//                System.out.print(c.getNome()+" pedido Nº: " + id );
//            //}
//        }


    @Override
    public String toString() {
        Cliente c = new Cliente();
        return getNome();
    }
}
