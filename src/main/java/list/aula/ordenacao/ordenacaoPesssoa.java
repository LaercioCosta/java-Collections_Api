package main.java.list.aula.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordenacaoPesssoa {
    private List<Pessoa> pessoaList;

    public ordenacaoPesssoa (){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public  List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new comparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        ordenacaoPesssoa ordenacao__Pesssoa = new ordenacaoPesssoa();

        ordenacao__Pesssoa.adicionarPessoa("Nome 1", 30, 1.73);
        ordenacao__Pesssoa.adicionarPessoa("Nome 2", 23, 1.70);
        ordenacao__Pesssoa.adicionarPessoa("Nome 3", 21, 1.87);
        ordenacao__Pesssoa.adicionarPessoa("Nome 4", 10, 1.65);

        System.out.println("Ordena por Idade"+ ordenacao__Pesssoa.ordenarPorIdade());
        System.out.println("Ordena por Altura"+ ordenacao__Pesssoa.ordenarPorAltura());
    }


}
