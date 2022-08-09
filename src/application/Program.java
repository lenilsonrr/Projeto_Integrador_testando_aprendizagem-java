package application;

import model.entities.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Client> clients = new ArrayList<>();

        String nome = "Lenilson";
        String senha = "1234";
        String email = "lenilson@gmail.com";
        String cel = "27-996293991";

        Client cliente = new Client(nome, senha, email, cel);
        clients.add(cliente);
        String nome1 = "Lenilson";
        String senha1 = "1235";

        cliente.valLogin(nome1,senha1);



        sc.close();
    }
}
