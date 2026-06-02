package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes ;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //Getters
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public String getNome(){
        return nome;
    }

    public double getMedia(){
        return (somaDasAvaliacoes / totalDeAvaliacoes);
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    ///////////////////////////////////////////////////////////////////////

    public void exibeFichaTecnica(){
        System.out.println("\nNome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes += 1;
    }


}
