package main.java.list.aula.operacoesBasicas;

public class tarefas {
    private String descricao;

    public tarefas(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "tarefas{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
