package IteraçãoWhile;

import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        int iteracao = 0;
        while (iteracao < 10000) {
            iteracao += 1;
            System.out.println("essa é a iteracao de nº " + iteracao);
        }
    }

    public void exemplo2() { // Jogo de adivinhação
        Random rd = new Random(); // Função para escolher um número aleatório
        int numeroAleatorio = rd.nextInt(10);
        boolean tenteNovamente = true;
        System.out.println("Aperte CTRL+C, a qualquer momento,para parar.");
        while (tenteNovamente) {
            System.out.print("Tente adivinhar o número: ");
            int numero = sc.nextInt();
            if (numero == numeroAleatorio) {
                System.out.println("Acertou Miseravi!!");
                tenteNovamente = false;
            } else {
                System.out.println("Errou Miseravi!!! Tenta Denovo");
            }
        }
    }

    public void exemplo3() {
        // ler 5 numeros inteiros e printar na ordem
        // criar um valor com while
        int vetor[] = new int[5];
        int i = 0;
        while (i<5) {
        System.out.println("Digite o valor par ao vetor["+i+"]");
            vetor[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i<5) {
            System.out.println(vetor[i]);
            i++;
        }
    }
}
