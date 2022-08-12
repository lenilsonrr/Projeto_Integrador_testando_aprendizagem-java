package model.entities;

import java.util.Scanner;

public class Lojista extends Cliente {
    private String CNPJ;
    private String nomeFantasia;
    private String senha;

    public Lojista() {
        super();
    }

    public Lojista(String CNPJ, String nomeFantasia, String senha) {
        this.CNPJ = CNPJ;
        this.nomeFantasia = nomeFantasia;
        this.senha = senha;
    }

    public Lojista(String nome, Double valor, Integer quantidade, String nome1, String senha, String email, String cel, String CNPJ, String nomeFantasia, String senha1) {
        super(nome, valor, quantidade, nome1, senha, email, cel);
        this.CNPJ = CNPJ;
        this.nomeFantasia = nomeFantasia;
        this.senha = senha1;
    }

    public Lojista(String nome, String senha, String email, String cel, Integer id, String CNPJ, String nomeFantasia, String senha1) {
        super(nome, senha, email, cel,id);
        this.CNPJ = CNPJ;
        this.nomeFantasia = nomeFantasia;
        this.senha = senha1;
    }

    public String getCNPJ() {
        return CNPJ;
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

    public void valLoginLojista() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu login e senha para abrir sua lanchonete: ");
        String nomeL = sc.nextLine();
        String senhaL = sc.nextLine();
        if (getNomeFantasia().equals(nomeL) && getSenha().equals(senhaL)) {
            System.out.println("Login correto!!");
            Cliente c1 = new Cliente(getNome());
            Produtos p = new Produtos(getNomeP(),getValorP(),getQuantidadeP());
            System.out.print("Pedido: "+c1.gerandoId()+", "+c1.getNome()+", "+ getQuantidadeP() + ", " + getNomeP());
        }
    }

    public void addProdutos() {

    }

    @Override
    public String toString() {
        Lojista l = new Lojista();
        Cliente c = new Cliente();
        return c.getNome() + ", " + l.getQuantidadeP() + ", " + l.getNomeP();
    }
}
