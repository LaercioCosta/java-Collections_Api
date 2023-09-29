package main.java.list.aula.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class listaTarefa {
    private List<tarefas> tarefaList;

    public listaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String desrcicao){
        tarefaList.add(new tarefas(desrcicao));
    }

    public void  removerTarefa(String descricao){
        List<tarefas> tarefasRemove = new ArrayList<>();
        for(tarefas t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemove.add(t);
            }
        }
        tarefaList.removeAll(tarefasRemove);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        listaTarefa lista_Tarefa = new listaTarefa();

        System.out.println(lista_Tarefa.obterNumeroTotalTarefas());

        lista_Tarefa.adicionarTarefa("Tarefa 1");
        lista_Tarefa.adicionarTarefa("Tarefa 1");
        lista_Tarefa.adicionarTarefa("Tarefa 2");
        System.out.println(lista_Tarefa.obterNumeroTotalTarefas());

        lista_Tarefa.removerTarefa("Tarefa 2");
        System.out.println(lista_Tarefa.obterNumeroTotalTarefas());

        lista_Tarefa.obterDescricoesTarefas();

    }
}
