package main.java.set.aula.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class agendaContatos {

    private Set<contato> contatoSet;

    public agendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void addContato(String nome, int numero){
        contatoSet.add(new contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<contato> pesquisarContatos(String nome){
        Set<contato> pesquisarNome =  new HashSet<>();
        for(contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                pesquisarNome.add(c);
            }
        }
        return pesquisarNome;
    }

    public contato atualizarNumContato(String nome, int novoNumero){
        contato contatoAtualizado = null;
        for (contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        agendaContatos agenda__Contatos = new agendaContatos();

        agenda__Contatos.exibirContato();

        agenda__Contatos.addContato("Laercio", 123456);
        agenda__Contatos.addContato("Laercio Costa", 11112);
        agenda__Contatos.addContato("Laercio Bahia", 2309);
        agenda__Contatos.addContato("Laercio", 4567);
        agenda__Contatos.addContato("Laercio Monteiro", 0);

        System.out.println(agenda__Contatos.pesquisarContatos("Laercio Bahia"));

        agenda__Contatos.exibirContato();

        agenda__Contatos.atualizarNumContato("Laercio Costa", 11113);
        System.out.println(agenda__Contatos.pesquisarContatos("Laercio Costa"));
    }


}
