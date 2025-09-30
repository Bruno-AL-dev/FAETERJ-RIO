package pob.l05_arraylist.Ex04.dominio;

import java.util.ArrayList;

public class ContadorOcorrencias {
    private ArrayList<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int contar(int numeroParaBuscar) {
        int contador = 0;
        for (int i = 0; i < this.numeros.size(); i++) {
            int numeroNaLista = this.numeros.get(i);

            if (numeroNaLista == numeroParaBuscar) {
                contador++;
            }
        }
        return contador;
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }
}