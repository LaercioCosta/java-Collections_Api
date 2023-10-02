package main.java.set.aula.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class cadastroProdutos {

    private Set<produtos> produtosSet;

    public cadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void addProdutos(long cod, String nome, double preco, int qunatidade) {
        produtosSet.add(new produtos(cod, nome, preco, qunatidade));
    }

    public Set<produtos> exibirProdutosPorNome() {
        Set<produtos> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }
    public Set<produtos> exibirProdutosPorPreco() {
        Set<produtos> produtosPorPreco = new TreeSet<>(new comparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        cadastroProdutos cadastro__Produtos = new cadastroProdutos();

        System.out.println(cadastro__Produtos.exibirProdutosPorNome());

        cadastro__Produtos.addProdutos(1,"PS5",4500.0,3);
        cadastro__Produtos.addProdutos(2,"Xbox X",3500.0,5);
        cadastro__Produtos.addProdutos(3,"Xbox S",1500.0,1);
        cadastro__Produtos.addProdutos(1,"PS4",800.0,2);

        System.out.println(cadastro__Produtos.exibirProdutosPorNome());

        System.out.println(cadastro__Produtos.exibirProdutosPorPreco());

    }

}

