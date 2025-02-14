package logica_de_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenciaDeFibonacci {
    public static List<Integer> gerarFibonacci(int n) {
        List<Integer> sequencia = new ArrayList<>();
        if (n <= 0) {
        return sequencia;
        }
        sequencia.add(0);
        if(n == 1) {
        return sequencia;
        }
        sequencia.add(1);
        for(int i = 2; i < n; i++){
            sequencia.add(sequencia.get(i - 1) + sequencia.get(i - 2));
        }
        return sequencia;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = entrada.nextInt();

        List<Integer> fibonacci = gerarFibonacci(n);
        System.out.println("Fibonacci: " + fibonacci);

        entrada.close();
    }
    }

