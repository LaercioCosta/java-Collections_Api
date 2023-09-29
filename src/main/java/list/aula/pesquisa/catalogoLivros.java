package main.java.list.aula.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class catalogoLivros {

    private List<Livro> livroList;

    public catalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void  adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }

        return livrosPorIntervaloAno;
    }

    public Livro pesquiasrPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        catalogoLivros catalogo__Livros = new catalogoLivros();

        catalogo__Livros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogo__Livros.adicionarLivro("Livro 2", "Autor 2", 2023);
        catalogo__Livros.adicionarLivro("Livro 3", "Autor 3", 2022);
        catalogo__Livros.adicionarLivro("Livro 4", "Autor 4", 2021);
        catalogo__Livros.adicionarLivro("Livro 2", "Autor 5", 2020);
        catalogo__Livros.adicionarLivro("Livro 1", "Autor 2", 2077);

        System.out.println(catalogo__Livros.pesquisarPorAutor("autor 1"));
        System.out.println(catalogo__Livros.pesquisarPorIntervaloAno(2020, 2022));
        System.out.println(catalogo__Livros.pesquiasrPorTitulo("livro 2"));
    }
}
