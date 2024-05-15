public class PorcentagemSalario {
    public static void main(String[] args) {

        float  salario = 5000.00F;

        float porcentagem = 30;

        float  calculoPorcentagem =
                salario * (porcentagem / 100);

        System.out.println("A porcentagem do salario é " + calculoPorcentagem + "%");
    }
}
