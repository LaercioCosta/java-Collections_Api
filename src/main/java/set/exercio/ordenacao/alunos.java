package main.java.set.exercio.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class alunos implements Comparable<alunos>{
    private String nome;
    private Long matricula;
    private double media;

    public alunos(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public int compareTo(alunos a) {
        return nome.compareToIgnoreCase(a.nome);
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "alunos{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof alunos alunos)) return false;
        return Objects.equals(getMatricula(), alunos.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }
}

class compararPorMedia implements Comparator<alunos>{

    @Override
    public int compare(alunos a1, alunos a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}
