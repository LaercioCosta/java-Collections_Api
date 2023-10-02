package main.java.map.aula.operacaoBasica;

import java.util.HashMap;
import java.util.Map;

public class agendaContatos {
    private Map<String,Integer> agendaContatomap;

    public agendaContatos(){
        this.agendaContatomap = new HashMap<>();
    }

    public void addContato(String nome, Integer telefone){
        agendaContatomap.put(nome, telefone);
    }

    public void removeContato(String nome){
        if (!agendaContatomap.isEmpty()){
            agendaContatomap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatomap);
    }

    public  Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatomap.isEmpty()){
            numeroPorNome = agendaContatomap.get((nome));
        }
        return  numeroPorNome;
    }

    public static void main(String[] args) {

        agendaContatos agenda__Contatos = new agendaContatos();

        agenda__Contatos.addContato("Contato 1", 1234);
        agenda__Contatos.addContato("Contato 2", 1786);
        agenda__Contatos.addContato("Contato 3", 1254);
        agenda__Contatos.addContato("Contato 4", 1235);

        agenda__Contatos.exibirContatos();

        agenda__Contatos.removeContato("Contato 2");

        agenda__Contatos.exibirContatos();

        System.out.println(agenda__Contatos.pesquisarPorNome("Contato 4"));
    }
}
