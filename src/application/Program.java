package application;

import model.entities.Lojista;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Lojista lanchonete = new Lojista();
        lanchonete.fazendoCadastro();
        lanchonete.valLoginLojista();
        lanchonete.lojaAberta();
        lanchonete.mostraEstoque();
    }
}