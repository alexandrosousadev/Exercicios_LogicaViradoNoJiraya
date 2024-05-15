/*
Dado um determinado salário
se o saário for maior  que 4500 imprima 30% do valor
senão imprima 15% do valor
 */
public class CalculadoraImpostoUsandoIfElse {
    public static void main(String[] args) {
        float salario = 4700;

        if (salario > 4500    ) {
            System.out.println("30% do salario é " + salario * 0.3F);
        } else {

            System.out.println("15% do salario é " + salario * 0.15F);
        }

    }
}
