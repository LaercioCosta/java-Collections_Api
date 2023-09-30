package main.java.list.exercios.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class somaNumeros {

    private List<soma> somaList = new ArrayList<>();

    public void adicionarNumero(int numero){
        somaList.add(new soma(numero));
    }



    public int calcularSoma(){
        int somarValores = 0;
        if (!somaList.isEmpty()){
            for(soma s: somaList) {
                somarValores += s.getNumeros();

            }

        }
        return somarValores;
    }

    public int encontrarMaiorNumero(){
        int numero = Integer.MIN_VALUE;
        if (!somaList.isEmpty()){
            for (soma s: somaList){
                if(s.getNumeros() >= numero ){
                    numero = s.getNumeros();
                }
            }
        }
        return  numero;
    }

    public int encontrarMenorNumero(){
        int numero = Integer.MAX_VALUE;
        if (!somaList.isEmpty()){
            for (soma s: somaList){
                if (s.getNumeros() <= numero){
                    numero = s.getNumeros();
                }
            }
        }
        return  numero;
    }
    public void exibirNumeros(){
        System.out.println(somaList);
    }

    public static void main(String[] args) {
        
        somaNumeros soma_Numeros = new somaNumeros();

        soma_Numeros.adicionarNumero(1);
        soma_Numeros.adicionarNumero(2);
        soma_Numeros.adicionarNumero(3);
        soma_Numeros.adicionarNumero(9);
        soma_Numeros.adicionarNumero(5);
        soma_Numeros.adicionarNumero(4);

        System.out.println("A soma de todos os números é: "+ soma_Numeros.calcularSoma());
        System.out.println("O maior numero é: "+ soma_Numeros.encontrarMaiorNumero());
        System.out.println("O menor numero é: "+ soma_Numeros.encontrarMenorNumero());
        soma_Numeros.exibirNumeros();

    }


}
