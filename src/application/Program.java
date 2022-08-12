package application;

import model.entities.Cliente;
import model.entities.Lojista;
import model.entities.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nomeP = "pao";
        double valorP = 10.00;
        int quantP = 2;

        Produtos p = new Produtos(nomeP,valorP,quantP);
        Produtos p1 = new Produtos("refri",5.00,1);

        String nome = "Lenilson";
        String senha = "1234";
        String email = "lenilson@gmail.com";
        String cel = "27-996293991";
        Cliente c = new Cliente(p1.getNomeP(),p1.getValorP(),p1.getQuantidadeP(),nome,senha,email,cel);
        Lojista lojista = new Lojista(c.getNomeP(),c.getValorP(),c.getQuantidadeP(),c.getNome(), c.getSenha(), c.getEmail(),c.getCel(),"1234567","Lanchonete","1234");

        c.valLogin();
        lojista.valLoginLojista();


        sc.close();
    }
}
