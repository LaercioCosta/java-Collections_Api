package main.java.set.aula.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class produtos implements Comparable<produtos> {
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public produtos(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(produtos p) {
        return nome.compareToIgnoreCase(p.nome);
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof produtos produtos)) return false;
        return getCodigo() == produtos.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return "\nprodutos{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }


}

class comparatorPorPreco implements Comparator<produtos>{

    @Override
    public int compare(produtos p1, produtos p2) {

        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
