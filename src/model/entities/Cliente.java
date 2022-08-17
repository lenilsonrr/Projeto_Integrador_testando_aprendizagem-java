package model.entities;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    private String nome;
    private String senha;

    private List<Produtos> produtos = new ArrayList<>();

    public Cliente(){
    }

    public Cliente(String nome, String senha, List<Produtos> produtos) {
        this.nome = nome;
        this.senha = senha;
        this.produtos = produtos;
    }

    public Cliente(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;

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

    public void valLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu login e senha para fazer suas compras: ");
        String nome = sc.nextLine();
        String senha = sc.nextLine();
        if (getNome().equals(nome) && getSenha().equals(senha)) {
            System.out.println("Login efetuado! ");
        } else {
            System.out.println("Login ou senha incorreto!!");
            System.out.println("Tente de novo: ");
            valLogin();
        }
    }
}