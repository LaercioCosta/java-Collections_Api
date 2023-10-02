package main.java.map.aula.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class estoqueProduto {

    private Map<Long, produto> produtoMap;

    public estoqueProduto() {
        this.produtoMap = new HashMap<>();
    }

    public void addProduto(long cod, String nome, double preco, int quantidade){
        produtoMap.put(cod, new produto(nome, preco, quantidade));
    }

    public void exibirProduto(){
        System.out.println(produtoMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!produtoMap.isEmpty()){
            for(produto p: produtoMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public produto obterProdutoMaisCaro(){
        produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!produtoMap.isEmpty()){
            for (produto p: produtoMap.values()){
                if (p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public produto obterProdutoMaisBarato(){
        produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!produtoMap.isEmpty()){
            for (produto p: produtoMap.values()){
                if (p.getPreco() < menorPreco){
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public produto oterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        produto ProdutoMaiorQuantidadeValor = null;
        double ValorTotalNoEstoque = 0d;
        double valor = 0d;
        if(!produtoMap.isEmpty()){
            for (produto p: produtoMap.values()){
                ValorTotalNoEstoque += p.getPreco() * p.getQuantidade();
                if (ValorTotalNoEstoque >= valor){
                    valor = ValorTotalNoEstoque;
                    ValorTotalNoEstoque=0d;
                    ProdutoMaiorQuantidadeValor = p;
                }


            }
        }
        return ProdutoMaiorQuantidadeValor;
    }



    public static void main(String[] args) {
        estoqueProduto estoque__Produto = new estoqueProduto();

        estoque__Produto.addProduto(1, "PS5", 4000d, 2);
        estoque__Produto.addProduto(2, "PS4", 2000d, 4);
        estoque__Produto.addProduto(3, "PS3", 1000d, 2);

        estoque__Produto.exibirProduto();

        System.out.println(estoque__Produto.obterProdutoMaisCaro());
        System.out.println(estoque__Produto.obterProdutoMaisBarato());
        System.out.println(estoque__Produto.calcularValorTotalEstoque());
        System.out.println(estoque__Produto.oterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
