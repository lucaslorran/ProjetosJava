import java.util.Scanner;
import modelos.Conta;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        menu(scanner);


    }

    public static void menu (Scanner scanner){

        Conta contaUsuario1 = new Conta(3000);

        String opcaoInformada;

        System.out.print("""
                          Escolha o número de uma das operações disponíveis do sistema:
                            1 - Consultar saldo.
                            2 - Consultar cheque especial.
                            3 - Depositar dinheiro.
                            4 - Sacar dinheiro.
                            5 - Pagar um boleto
                            6 - Verificar se a conta está usando cheque especial.
                            0 - Encerrar.
                          :  
                          """);

        opcaoInformada = scanner.nextLine();

        switch (opcaoInformada){
            case "1":
                contaUsuario1.exibeSaldo();
                break;
            case "2":
                contaUsuario1.exibeChequeEspecial();
                break;
            case "3":
                contaUsuario1.depositar(scanner);
                break;
            case "4":
                contaUsuario1.sacar(scanner);
                break;
            /*case 5:
                break;
            case 6:
                break;
            case 0:
                break; */
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
