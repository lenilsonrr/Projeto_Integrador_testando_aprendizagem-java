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

        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Celular: ");
        String cel = sc.nextLine();

        Client cliente = new Client(nome,senha,email,cel);


        List<Client> clients = new ArrayList<>();
        System.out.print(cliente);

        sc.close();
    }
}
