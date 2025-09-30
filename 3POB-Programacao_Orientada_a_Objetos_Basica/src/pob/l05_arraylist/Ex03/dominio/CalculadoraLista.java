package pob.l05_arraylist.Ex03.dominio;

import java.util.ArrayList;

public class CalculadoraLista {
    private ArrayList<Double> numeros = new ArrayList<>();

    public void adicionarNumero(double numero) {
        numeros.add(numero);
    }

    public double calcularSoma() {
        double soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        return soma;
    }

    public double calcularMedia() {
        if (numeros.isEmpty()) {
            return 0;
        }
        return calcularSoma() / numeros.size();
    }
    
    public ArrayList<Double> getNumeros() {
        return numeros;
    }
}