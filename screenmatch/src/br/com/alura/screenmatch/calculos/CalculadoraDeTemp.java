package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTemp {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Titulo t){
        tempoTotal += t.getDuracaoEmMinutos();
    }

}
