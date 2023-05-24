package AtividadeFormativaMatriz;

import java.util.Random;
import java.util.Scanner;

public class AtividadeFormativa {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void Exercicio1() {
        System.out.println("Insira o numero de Linhas: ");
        int linha = sc.nextInt();
        System.out.println("Insira o numero de Colunas: ");
        int coluna = sc.nextInt();
        int matriz[][] = new int[linha][coluna];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = rd.nextInt(10);
            }
        }

        System.out.println("Primeira Matriz ");
        imprimirMatriz(matriz);

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }

        System.out.println("Matriz Substituida: ");
        imprimirMatriz(matriz);
    }

    private void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // int vetor[10], indice;
    // for (indice=0; indice<10; indice++)
    // {
    // printf("\nVetor[%d]: ",indice);
    // scanf("%d",vetor[indice]);
    // }
    // }
    // }
    public void Exercicio2() {
        // Sortear um numero de 0 a 1000
        int nDigitado = 0;
        int tentativas = 1;
        int nSorteado = (rd.nextInt(1000));
        boolean acertou = false;
        while (acertou == false) {
            System.out.println("Digite o numero: ");
            nDigitado = sc.nextInt();
            if (nSorteado == nDigitado) {
                System.out.println("Parabéns! Você acertou o número sorteado em " + tentativas + " tentativa.");
                acertou = true;
            }

            tentativas++;
        }
    }
    public void CorreçãoExercicio1() {
        
    }
}
