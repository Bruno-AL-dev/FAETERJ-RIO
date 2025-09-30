package pob.l05_arraylist.Ex01.dominio;

import java.util.ArrayList;

public class ArmazenadorNumeros {
    private ArrayList<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public ArrayList<Integer> getNumeros() {
        return this.numeros;
    }
}