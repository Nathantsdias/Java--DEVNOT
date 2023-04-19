package ExercicioFor;

import java.util.Scanner;

public class ExercicioFor {
    Scanner sc = new Scanner(System.in);

    // exercicio 1 - criar um vetor de 5 numeros e imprimir
    public void exercicio1() {
        // criar um vetor de 5 posições
        int vetor[] = new int[5];
        // preencher o vetor "FOR"
        for (int i = 0; i < vetor.length; i++) {
            // solicitar para o usuário escrever o numero
            System.out.print("Informe o valor do Vetor de posição[" + i + "]=");
            // ler o valor digitado e atribuir a posição do vetor
            vetor[i] = sc.nextInt();
        }
        // imprimir o vetor "FOR"
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
        }
    }

    // vetor decimal de 10 posições e imprimir na ordem inversa
    public void exercicio2() {
        double vetor[] = new double[10];// vetor de 10 posições
        // preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o valor do Vetor de posição[" + i + "]=");
            vetor[i] = sc.nextDouble();
        }
        // imprimir na ordem inversa //indice vai de 0 a 9
        for (int i = 9; i >= 0; i--) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
        }
    }

    public void exercicio3() {
        // ler 4 notas e calcular a média
        // criar um vetor para receber a média
        double notas[] = new double[4];// vetor de tamanho 4
        // preencher o vetor com as notas
        for (int i = 0; i < notas.length; i++) {
            // solicitar as notas para o usuário
            System.out.println("Informe a nota " + (i + 1) + " do Aluno");
            // ler a nota com o scanner
            notas[i] = sc.nextDouble();
        }
        // imprimir as notas e calcular a média
        double média = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota [" + (i + 1) + "] =" + notas[i]);
            // acumular o valor das notas na variavel média
            média += notas[i];
        }
        // dividir a média pelo nº de notas
        média /= notas.length;
        // imprimir a média
        System.out.print("A média é " + média);
    }

    public void exercicio4() {
        // char letras[] = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'
        // };
        String letras2[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        // percorrer o vetor para procurar letras vogais ou consoantes
        // contar o numero de consoantes
        int cont = 0;
        for (int i = 0; i < letras2.length; i++) {
            if (letras2[i] != "a" && letras2[i] != "e" && letras2[i] != "i" && letras2[i] != "o" && letras2[i] != "u") {
                ;
                System.out.println(letras2[i] + " é consoante");
                cont++;
            }
        }
        // mostrar o contador de consoantes
        System.out.println(" O nº de consoantes é " + cont);
    }

    public void exercicio4ex() {
        // ler as consoantes de uma palavra digitada
        // char letras[] = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'
        // };
        System.out.println("Digite uma palavra");
        String palavra = sc.next();
        palavra = palavra.toLowerCase();
        // percorrer o vetor para procurar letras vogais ou consoantes
        // contar o numero de consoantes
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.println(c + " é consoante");
                cont++;
            }
        }
        // mostrar o contador de consoantes
        System.out.println(" O nº de consoantes é " + cont);
    }
}