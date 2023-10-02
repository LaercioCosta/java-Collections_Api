package main.java.set.aula.operacaoBasica;

import java.util.Objects;

public class convidado {

    //atributos
    private  String nome;
    private int codigoConvite;

    public convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "\nconvidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
