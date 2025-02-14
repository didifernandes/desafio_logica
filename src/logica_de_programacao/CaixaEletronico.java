package logica_de_programacao;

import java.util.Scanner;

public class CaixaEletronico {

    public static void calcularNotas(int valor){

        int [] notas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println("Saque no valor de R$ " + valor + ":");

        for(int nota: notas){
            int quantidade = valor / nota;
            if(quantidade > 0){
                System.out.println(quantidade + " notas de R$: " + nota);
                valor %= nota;
            }
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do saque: ");
        int valor = entrada.nextInt();

        if(valor > 0){
            calcularNotas(valor);
        } else {
            System.out.println("O valor precisa ser positivo.");
        }

        entrada.close();
    }

}
