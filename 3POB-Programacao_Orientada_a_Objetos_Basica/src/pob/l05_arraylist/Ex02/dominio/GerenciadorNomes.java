package pob.l05_arraylist.Ex02.dominio;

import java.util.ArrayList;

public class GerenciadorNomes {
    private ArrayList<String> nomes = new ArrayList<>();

    public void adicionarNome(String nome) {
        nomes.add(nome);
    }

    public boolean removerNome(String nomeParaRemover) {
        return nomes.remove(nomeParaRemover);
    }

    public ArrayList<String> getNomes() {
        return nomes;
    }
}
