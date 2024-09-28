package atividades.richard_henrique;
import java.util.Scanner;

public class FastFood {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int opcao;
        record guardarVar(String nome, double preco){}
        //record consegue armazenar um conjunto de variaveis

        System.out.print("""
                        Menu:
                        [1] - Hamburguer (R$10,00) 
                        [2] - Cachorro quente (R$7,00) 
                        [3] - Batata frita (R$5,00)""");
        System.out.print("Escolha seu lanche: ");
        opcao = sc.nextInt();

         guardarVar lanche = switch (opcao){
            case 1 -> new guardarVar("hamburguer", 10);
            case 2 -> new guardarVar("cachorro quente", 7);
            case 3 -> new guardarVar("batata frita", 5);
            default -> new guardarVar("opção inválida",0);
        };

        System.out.printf("%nVocê escolheu um(a) %s", lanche.nome);
        System.out.printf(" e o valor a ser pago é de: R$ %.2f", lanche.preco);

    }
}
