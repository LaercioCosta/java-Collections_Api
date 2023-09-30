package main.java.list.exercios.Ordenacao;

public class numeros implements Comparable<numeros> {

    private int numeros;

    public numeros(int numeros) {
        this.numeros = numeros;
    }

    @Override
    public int compareTo(numeros n){
        return Integer.compare(numeros, n.getNumeros());
    }

    public int getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return "numeros{" +
                "numeros=" + numeros +
                '}';
    }
}
