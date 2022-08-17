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

        Cliente cleinte = new Cliente("Flavia","1234");
        //cleinte.valLogin();

        Lojista lanchonete = new Lojista("Delicias", "1234");
       // lanchonete.valLoginLojista();

        lanchonete.setCliente(cleinte);
        lanchonete.setProdutos(lanchonete.addProdutosInEstoque());

        lanchonete.mostraPedido(lanchonete);
        
        sc.close();
    }
}