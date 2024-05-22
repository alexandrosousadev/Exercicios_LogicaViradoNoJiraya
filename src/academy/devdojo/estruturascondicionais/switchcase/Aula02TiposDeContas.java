/*
como gerente eu que gostaria que meus usuários pudesses
digitar o tipo da conta e o sistema imprima qual a porcentagem de juros
que aquela conta irá oferecer. Com o intuito de agilizar o acesso as informações
Os tipos das contas são
CONTA_POUPANÇA 0.05%
CONTA_CORRENTE 0.02%
CONTA_INVESTIMENTO 0.1%
 */
package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Aula02TiposDeContas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tipo de conta: ");
        String conta = input.next();

        switch  (conta){
            case "Poupança":
                System.out.println(" CONTA_POUPANÇA 0.05% de Juros");
                break;
                case "Corrente":
                System.out.println("CONTA_CORRENTE 0.02% de Juros");
                break;
                case "Investimento":
                System.out.println(" CONTA_INVESTIMENTO 0.1% de Juros");
                break;
            default:
                System.out.println("Conta Inexistente");

        }
    }
}
