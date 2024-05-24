package lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Luffy";
        final String password = "1234";
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Digite seu login:");
                String loginDigitado = sc.nextLine();
            System.out.println("Digite sua senha:");
                String passDigitado = sc.nextLine();

            if (loginDigitado.equals(login) && passDigitado.equals(password)){
                System.out.println("Acesso Concedido");
                break;
            }
                System.out.println("Senha incorreta");
            }
        System.out.println("Programa finalizado");
        }
    }

