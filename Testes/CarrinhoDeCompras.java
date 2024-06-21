package Testes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {


    private List<Item> ItemList;

    public CarrinhoDeCompras() {
        this.ItemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        ItemList.add(new Item(nome, preco, quantidade));
    }

    public double valorTotal() {
        if (ItemList.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        }
        return ItemList.stream().mapToDouble(Item -> Item.getPreco() * Item.getQuantidade()).sum();
        // Calcula o valor total do carrinho somando o preço multiplicado pela quantidade de cada item
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Nescau", 7.00, 2);
        carrinho.adicionarItem("Leite", 5.50, 3);
        carrinho.adicionarItem("Pão", 3.00, 6);
        carrinho.adicionarItem("Queijo", 20.00, 1);
        carrinho.adicionarItem("Presunto", 15.00, 2);
        carrinho.adicionarItem("Manteiga", 8.00, 1);

        double total = carrinho.valorTotal();
        System.out.println("O valor total do carrinho de compras é: " + total);
    }
}
