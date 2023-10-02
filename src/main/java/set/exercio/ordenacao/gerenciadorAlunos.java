package main.java.set.exercio.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class gerenciadorAlunos {

    private Set<alunos> alunosSet;

    public gerenciadorAlunos() {
        this.alunosSet= new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        alunos alunosParaRemover = null;
        for(alunos a: alunosSet){
            if (a.getMatricula() == matricula){
                alunosParaRemover = a;
                break;
            }
        }
        alunosSet.remove(alunosParaRemover);
    }

    public Set<alunos> exibirAlunosPorNome(){
        Set<alunos> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<alunos> exibirAlunosPorNota(){
        Set<alunos> alunosPorMedia = new TreeSet<>(new compararPorMedia());
        alunosPorMedia.addAll(alunosSet);
        return alunosPorMedia;
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        gerenciadorAlunos alunos = new gerenciadorAlunos();

        alunos.adicionarAluno("Laercio", 123334312L,7.8);
        alunos.adicionarAluno("Marcos", 312312312L,7d);
        alunos.adicionarAluno("Julia", 234235523L,8.9);
        alunos.adicionarAluno("Rita", 123213123L,7.4);
        alunos.adicionarAluno("Cleber", 908731231L,5.8);

        alunos.exibirAlunos();

        System.out.println(alunos.exibirAlunosPorNome());

        System.out.println(alunos.exibirAlunosPorNota());

        alunos.removerAluno(123334312L);
        alunos.removerAluno(123213123L);

        System.out.println(alunos.exibirAlunosPorNome());



    }


}
