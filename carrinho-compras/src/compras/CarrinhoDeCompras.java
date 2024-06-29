package compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
        System.out.println("Item adicionado.");
    }

    public void removerItem(String nome) {
        List<Item> removerItensPorNome = new ArrayList<>();
        if (!itemList.isEmpty()){
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)){
                    removerItensPorNome.add(i);
                }
            }
            itemList.removeAll(removerItensPorNome);
            System.out.println("Item(s) removido(s)");
        
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public void calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem; 
            }

        System.out.println("O valor total dos itens é de R$ " + valorTotal + ".");
        
        } else {
            System.out.println("A lista está vazia");
        }
    }
    public void exibirItens() {
        if (!itemList.isEmpty()){
        System.out.println("Lista completa: " + itemList);
        } else {
            System.out.println("A lista está vazia");
        }
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.exibirItens();

        carrinho.adicionarItem("couve", 10, 1);
        carrinho.adicionarItem("maionese", 9, 1);
        carrinho.adicionarItem("cebola", 5, 10);
        carrinho.adicionarItem("chocolate", 10, 3);

        carrinho.exibirItens();

        carrinho.calcularValorTotal();

        carrinho.removerItem("maionese");

        carrinho.calcularValorTotal();
    }
} 

 
