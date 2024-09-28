package atividades.richard_henrique;
import java.util.Scanner;

public class Desconto {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        double preco, desconto, precoDesconto;

        System.out.print("Digite o valor do produto: R$");
        preco =sc.nextDouble();

        desconto = 0.1;
        precoDesconto = preco - preco * desconto;

        System.out.printf("Agora o produto custa R$%.2f, após o desconto aplicado!", precoDesconto);
    }
}
