package main.java.set.aula.operacaoBasica;

import java.util.HashSet;
import java.util.Set;

public class conjutoConvidados {
    private Set<convidado> convidadoSet;

    public conjutoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void addConvidado(String nome, int codigoConvite){
        convidadoSet.add(new convidado(nome, codigoConvite));
    }

    public void removeConvidado(int codigoConvite){
        convidado convidadoRemovido = null;
        for(convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoRemovido = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemovido);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {

        conjutoConvidados conjuto__Convidados = new conjutoConvidados();

        System.out.println("Existem: "+ conjuto__Convidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuto__Convidados.addConvidado("Laercio", 1111);
        conjuto__Convidados.addConvidado("Maria", 1112);
        conjuto__Convidados.addConvidado("Milena", 1113);
        conjuto__Convidados.addConvidado("Joao", 1114);
        conjuto__Convidados.addConvidado("Carlos", 1115);
        conjuto__Convidados.addConvidado("Julia", 1111);

        System.out.println("Existem: "+ conjuto__Convidados.contarConvidados() + " convidados dentro do Set de convidados");
        conjuto__Convidados.exibirConvidados();

        conjuto__Convidados.removeConvidado(1114);
        System.out.println(conjuto__Convidados.contarConvidados());


    }
}
