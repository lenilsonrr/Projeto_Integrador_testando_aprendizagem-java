package application;

import model.entities.Cliente;
import model.entities.Lojista;
import model.entities.Pedidos;


import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente("Lenilson","1");
       // cliente.fazendocadastroCliente();
       // cliente.valLogin();

        Lojista lanchonete = new Lojista("d","1");
        //lanchonete.fazendoCadastro();
        //lanchonete.valLoginLojista();

        lanchonete.setProdutos(lanchonete.addProdutosInEstoque());
        lanchonete.setCliente(cliente);
        lanchonete.mostraEstoque(lanchonete);
        lanchonete.fazerPedido();
        lanchonete.mostraEstoque(lanchonete);
        lanchonete.mostrarPedido();

    }
}