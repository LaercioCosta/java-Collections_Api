package main.java.set.exercio.pesquisa;

public class tarefas {

    private String descricao;
    private Boolean checkTarefa;

    public tarefas(String descricao, Boolean checkTarefa) {
        this.descricao = descricao;
        this.checkTarefa = checkTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getCheckTarefa() {
        return checkTarefa;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCheckTarefa(Boolean checkTarefa) {
        this.checkTarefa = checkTarefa;
    }

    @Override
    public String toString() {
        return "listaTarefas{" +
                "Descrição='" + descricao + '\'' +
                ", checkTarefa=" + checkTarefa +
                '}';
    }
}
