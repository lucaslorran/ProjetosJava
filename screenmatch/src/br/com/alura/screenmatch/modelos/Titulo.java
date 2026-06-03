package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes ;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //////////////////  Getters
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public String getNome(){
        return nome;
    }

    public double getMedia(){
        return (somaDasAvaliacoes / totalDeAvaliacoes);
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    ////////////////// Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    ///////////////////////////////////////////////////////////////////////

    public void exibeFichaTecnica(){
        System.out.println("\nNome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes += 1;
    }

}
