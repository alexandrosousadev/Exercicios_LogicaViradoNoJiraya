/*
Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros
para que eu possa agilizar o processo de cadastramento:
sexo, sendo válido apenas M ou F e idade.
Se o sexo por M e a idade for maior ou igual a 18 o sistema deve imprimir alistamento obrigatório
se o sexo foir M e a idade for menor que 18 o sistema deve imprimir, alistament não permitido
se o sexo for F e a idade for maior igual a 18 o sistema deve perguntar se a pessoa deseja se alistar
se o sexo for F e a idade for menor que 18 o sistema deve imprimir alistamento não permitido
 */
import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu sexo: ");
        String  sexo = input.next();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        if (sexo.equalsIgnoreCase("M")  && idade >= 18) {
            System.out.println("Alistamento obrigatorio! ");
        }if (sexo.equalsIgnoreCase("M") && idade < 18){
            System.out.println("Alistamento não permitido! ");

        }if (sexo.equalsIgnoreCase("F") && idade >= 18){
            System.out.println("Você deseja se alistar?");

        }if (sexo.equalsIgnoreCase("F") && idade < 18){
            System.out.println("Alistamento não permitido! ");
        }
    }
}
