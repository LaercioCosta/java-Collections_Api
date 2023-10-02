package main.java.set.aula.pesquisa;

import java.util.Objects;

public class contato {
    private String nome;
    private int numero;

    public contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "\ncontato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }


}
