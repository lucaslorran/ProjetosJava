package modelos;

import java.util.Locale;
import java.util.Scanner;

public class Conta {
    private double saldo;
    private double chequeEspecial;
    private boolean usaChequeEspecial = true;

    public Conta(double saldo){
        this.saldo = saldo;

        if(saldo <= 500){
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = (saldo * 50) / 100;
        }

    }

    public void exibeSaldo(){
        System.out.printf(Locale.of("pt","BR"),"Saldo: R$%.2f ", this.saldo);

    }

    public void exibeChequeEspecial(){
        System.out.println("Cheque Especial: " + this.chequeEspecial);
    }

    public void depositar(Scanner scanner){
        double valor;

        System.out.print("""
                         Informe o valor que deseja depositar: 
                         """);

        valor = scanner.nextDouble();
        scanner.nextLine();

        this.saldo += valor;

    }
    
    public void sacar(Scanner scanner){
        double valor;

        System.out.print("""
                         Informe o valor que deseja sacar: 
                         """);

        valor = scanner.nextDouble();
        scanner.nextLine();

        if(this.saldo >= valor){

            this.saldo -= valor;

        }else if(this.usaChequeEspecial && this.chequeEspecial >= valor){



        }else{
            System.out.println("Saldo insuficiente.");
        }

    }

}