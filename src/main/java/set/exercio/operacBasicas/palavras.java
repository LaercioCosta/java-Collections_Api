package main.java.set.exercio.operacBasicas;

public class palavras {
    private String palavras;

    public palavras(String palavras) {
        this.palavras = palavras;
    }

    public String getPalavras() {
        return palavras;
    }

    @Override
    public String toString() {
        return "palavras{" +
                "palavras='" + palavras + '\'' +
                '}';
    }
}
