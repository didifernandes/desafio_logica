package logica_de_programacao;

import java.util.Scanner;

public class BuscaBinaria {
    public static int BuscaBinaria(int lista[], int alvo) {
        int inicio = 0;
        int fim = lista.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (lista[meio] == alvo) {
                return meio;
            } else if (lista[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os números da lista ordenada separados por virgula: ");
        String [] entradaDados = entrada.nextLine().split(",");
        int [] lista = new int[entradaDados.length];

        for (int i = 0; i < entradaDados.length; i++) {
            lista[i] = Integer.parseInt(entradaDados[i].trim());
        }

        System.out.println("Digite o número que deseja encontrar: ");
        int alvo = entrada.nextInt();

        int indice = BuscaBinaria(lista, alvo);

        if(indice != -1){
            System.out.println("O número " + alvo + " foi encontrado no índice " + indice + ".");
        } else {
            System.out.println("O número " + alvo + " não foi encontrado.");
        }

        entrada.close();
    }
}
