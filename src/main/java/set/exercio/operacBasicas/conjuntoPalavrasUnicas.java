package main.java.set.exercio.operacBasicas;

import java.util.HashSet;
import java.util.Set;

public class conjuntoPalavrasUnicas {

    private Set<String> palavrasSet;

    public conjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
            if(palavrasSet.contains(palavra)){
                palavrasSet.remove(palavra);
        }
    }

    public boolean  verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavras(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        conjuntoPalavrasUnicas palavrasUnicas = new conjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Pano");
        palavrasUnicas.adicionarPalavra("Gato");
        palavrasUnicas.adicionarPalavra("Cao");
        palavrasUnicas.adicionarPalavra("Sapato");
        palavrasUnicas.adicionarPalavra("Prato");

        palavrasUnicas.exibirPalavras();

        System.out.println(palavrasUnicas.verificarPalavra("Gato"));

        palavrasUnicas.removerPalavra("Gato");

        System.out.println(palavrasUnicas.verificarPalavra("Gato"));

        palavrasUnicas.exibirPalavras();



    }

}
