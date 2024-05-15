/*
 Eu como usuario gostaria de ter o nome e a idade de participantes de
 um torneio de natação e que o sistema imprimisse da sequinte forma
 Menor que 10 anos: <nome> participara da categoria infantil
 Entre 11 e 15 anos : <nome> participara da categoria Juvenil
 Entre 16 e 19 anos : <nome> participara da categoria Juvenil
 Acima de 20 anos : <nome> participara da categoria Juvenil

 */
public class TorneioDeNatacao {

    public static void main(String[] args) {
        
        String nome= "joao" ;
        int idade = 10;
        
        if (idade <= 10){
            System.out.println(nome + " Participara da categoria Infantil");
            
        } else if (idade > 10 && idade <= 15) {
            System.out.println(nome + " Participara da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
        System.out.println(nome + " Participara da categoria Pré-adulto");

        }else  {
            System.out.println( nome + " Participara da categoria Adulto");
        }
    }
}
