package logica_de_programacao;

import java.util.Scanner;

public class MaiorSubstringPalindromica {

        public static String expandirAteFim(String texto, int esquerda, int direita){
           while (esquerda >= 0 && direita < texto.length() && texto.charAt(esquerda) == texto.charAt(direita)) {
               esquerda--;
               direita++;
           }
           return texto.substring(esquerda + 1, direita);
        }

        public static String encontrarMaiorPalindromo(String texto){
            if (texto == null || texto.length() < 1){
                return "";
            }
            String maiorPalindromo = "";

            for (int i = 0; i < texto.length(); i++){
                String palindromoImpar = expandirAteFim(texto, i, i);
                String palindromoPar = expandirAteFim(texto, i, i + 1);
                if (palindromoImpar.length() > maiorPalindromo.length()){
                    maiorPalindromo = palindromoImpar;
                }
                if (palindromoPar.length() > maiorPalindromo.length()){
                    maiorPalindromo = palindromoPar;
                }
        }
        return maiorPalindromo;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a string para encontrar a maior substring palindromica: ");
        String texto = entrada.nextLine();

        String resultado = encontrarMaiorPalindromo(texto);
        System.out.println("Maior substring palindromica encontrada: " + resultado);
    }
}
