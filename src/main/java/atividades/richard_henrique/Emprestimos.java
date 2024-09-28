package atividades.richard_henrique;
import java.util.Scanner;

public class Emprestimos {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        double salario;
        int pendencias;

        System.out.print("Digite o seu salario: ");
        salario = sc.nextDouble();

        System.out.print("Digite a quantidade de pendencias: ");
        pendencias = sc.nextInt();

        if(salario>=2500 && pendencias<=2){
            System.out.println("Empréstimo aprovado!");
        }else{
            System.out.println("Empréstimo negado!");
        }

    }
}
