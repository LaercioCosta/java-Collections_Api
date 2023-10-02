package main.java.set.exercio.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class listaTarefas {
    private Set<tarefas> tarefasSet;

    public listaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new tarefas(descricao, false));
    }

    public void removerTarefa(String descricao) {
        tarefas tarefasParaRemover = null;
        for (tarefas t: tarefasSet){
            if (t.getDescricao() == descricao) {
                tarefasParaRemover = t;
                break;
            }
        }
        tarefasSet.remove(tarefasParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }

    public void contarTarefas() {
        System.out.println(tarefasSet.size());
    }

    private Set<tarefas> obterTarefasConcluidas() {
        Set<tarefas> tarefasConcluidas = new HashSet<>();
        for (tarefas t : tarefasSet) {
            if (t.getCheckTarefa()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    private Set<tarefas> obterTarefasPendentes() {
        Set<tarefas> tarefasPendentes = new HashSet<>();
        for (tarefas t : tarefasSet) {
            if (!t.getCheckTarefa()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    private tarefas marcarTarefaConcluida(String descricao) {
        tarefas tarefaConcluida = null;
        for (tarefas t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setCheckTarefa(true);
                tarefaConcluida = t;
                break;
            }
        }
        return tarefaConcluida;
    }

    private tarefas marcarTarefaPendentes(String descricao) {
        tarefas tarefaPendente = null;
        for (tarefas t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setCheckTarefa(false);
                tarefaPendente = t;
                break;
            }
        }
        return tarefaPendente;
    }

    private void limparListaTarefas(){
        tarefasSet.removeAll(tarefasSet);
    }


    public static void main(String[] args) {
        listaTarefas lista__Tarefas = new listaTarefas();

        lista__Tarefas.adicionarTarefa("tarefa 1");
        lista__Tarefas.adicionarTarefa("tarefa 2");
        lista__Tarefas.adicionarTarefa("tarefa 3");
        lista__Tarefas.adicionarTarefa("tarefa 4");
        lista__Tarefas.adicionarTarefa("tarefa 5");

        lista__Tarefas.exibirTarefas();

        lista__Tarefas.removerTarefa("tarefa 2");
        lista__Tarefas.exibirTarefas();

        lista__Tarefas.contarTarefas();

        System.out.println(lista__Tarefas.obterTarefasPendentes());

        lista__Tarefas.marcarTarefaConcluida("tarefa 1");
        lista__Tarefas.marcarTarefaConcluida("tarefa 3");

        System.out.println(lista__Tarefas.obterTarefasConcluidas());

        lista__Tarefas.marcarTarefaPendentes("tarefa 3");
        lista__Tarefas.exibirTarefas();

        lista__Tarefas.limparListaTarefas();
        lista__Tarefas.exibirTarefas();



    }
}
