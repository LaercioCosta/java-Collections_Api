package main.java.list.exercios.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordenacaoNumeros {

    private List<numeros> numerosList = new ArrayList<>();

    public void adicionarNumero(int numero){
        numerosList.add(new numeros(numero));
    }

    public List<numeros> ordenarAscendente(){
        List<numeros> menorParaMaior =  new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()){
            menorParaMaior.sort(Collections.reverseOrder());
        }
        return menorParaMaior;
    }

    public List<numeros> ordenarDescendente(){
        List<numeros> maiorParaMenor = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()){
            Collections.sort(maiorParaMenor);
        }

        return maiorParaMenor;
    }

    public static void main(String[] args) {
        ordenacaoNumeros ordenacao__Numeros = new ordenacaoNumeros();

        ordenacao__Numeros.adicionarNumero(2);
        ordenacao__Numeros.adicionarNumero(24);
        ordenacao__Numeros.adicionarNumero(3);
        ordenacao__Numeros.adicionarNumero(5);
        ordenacao__Numeros.adicionarNumero(10);
        ordenacao__Numeros.adicionarNumero(1);

        System.out.println(ordenacao__Numeros.ordenarAscendente());
        System.out.println(ordenacao__Numeros.ordenarDescendente());
    }


}
