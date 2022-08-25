package application;

import model.entities.Cliente;
import model.entities.Lojista;

import java.util.Locale;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Cliente cliente = new Cliente();
        cliente.fazendocadastroCliente();
        cliente.valLogin();

        Lojista lanchonete = new Lojista();
        lanchonete.fazendocadastro();
        lanchonete.valLoginLojista();
        lanchonete.setProdutos(lanchonete.addProdutosInEstoque());
        lanchonete.setCliente(cliente);
        lanchonete.mostraEstoque(lanchonete);
        lanchonete.getCliente().setPedidos(lanchonete.getCliente().fazerPedido(lanchonete));
        lanchonete.baixaEstoque(lanchonete.getProdutosLojista(), lanchonete.getCliente().getPedidos());
        lanchonete.mostraEstoque(lanchonete);
        lanchonete.getCliente().pedidoCliente(lanchonete,lanchonete.getCliente());
    }
}
