package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class carrinhoDeCompras {
    private List<item> carrinho;

    public  carrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public  void adicionarItem(String nome, Double preco, Integer quantidade){
        carrinho.add(new item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<item> removerCompra = new ArrayList<>();
        for (item t: carrinho){
            if(t.getNome().equalsIgnoreCase(nome)){
                removerCompra.add(t);
            }
        }
        carrinho.removeAll(removerCompra);
    }

    public void calcularValorTotal(){
        Double calc = 0d;
        for (item t: carrinho){
            Double preco = t.getPreco();
            Integer quantidade =  t.getQuantidade();
            calc += preco * quantidade;
        }
            System.out.println("O Total dos items foi de R$:"+ calc);
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        carrinhoDeCompras carrinho_De_Compras = new carrinhoDeCompras();

        carrinho_De_Compras.adicionarItem("PS5", 4000.00, 1);
        carrinho_De_Compras.adicionarItem("XBOX S", 1500.00, 3);
        carrinho_De_Compras.adicionarItem("Capa Iphone", 150.0, 5);
        carrinho_De_Compras.adicionarItem("Iphone", 7500.00, 1);
        carrinho_De_Compras.calcularValorTotal();
        carrinho_De_Compras.exibirItens();

        carrinho_De_Compras.removerItem("Iphone");
        carrinho_De_Compras.removerItem("Capa Iphone");

        carrinho_De_Compras.exibirItens();
        carrinho_De_Compras.calcularValorTotal();
    }
}


