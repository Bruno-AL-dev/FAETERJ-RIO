package pob.l05_arraylist.Ex05.dominio;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenadorLista {
    private ArrayList<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public void ordenar() {
        Collections.sort(this.numeros);
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }
}