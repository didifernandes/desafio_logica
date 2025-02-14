package logica_de_programacao;

import java.util.Scanner;

public class NumerosPerfeitos {
    public static boolean NumeroPerfeito(int num){
        int soma = 0;

        for(int i = 1; i <= num / 2; i++ ){
            if(num % i == 0){
                soma += i;
            }
        }
        return soma == num;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        boolean resultado = NumeroPerfeito(num);

        System.out.println(resultado);
    }
}
