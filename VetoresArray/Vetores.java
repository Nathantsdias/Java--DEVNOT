package VetoresArray;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // criar meu vetor
        double[] valores = new double[] { 10.5, 15.8, 7.5, -17.6 };
        System.out.println("O 1º Elemento do Vetor - valores[0] é "+valores[0]);
        System.out.println("O 2º Elemento do Vetor - valores[1] é "+valores[1]);
        System.out.println("O 3º Elemento do Vetor - valores[2] é "+valores[2]);
        System.out.println("O 4º Elemento do Vetor - valores[3] é "+valores[3]);
        System.out.println("Digite um novo valor para a 4º posição/índice 3");
        valores[4]=sc.nextDouble();
        System.out.println("O Novo Valor da 4ªPosição/Índice[3] é "+valores[3]);
    }
    public void exemplo2() {
        //criar um vetor (vazio)
        int valoresInt[]= new int[5];
        System.out.println("Digite 5 valores Inteiros");
        valoresInt[0]=sc.nextInt();
        valoresInt[1]=sc.nextInt();
        valoresInt[2]=sc.nextInt();
        valoresInt[3]=sc.nextInt();
        valoresInt[4]=sc.nextInt();
        System.out.println("O 1º Elemento do Vetor - índice[0] é "+valoresInt[0]);
        System.out.println("O 2º Elemento do Vetor - índice[1] é "+valoresInt[1]);
        System.out.println("O 3º Elemento do Vetor - índice[2] é "+valoresInt[2]);
        System.out.println("O 4º Elemento do Vetor - índice[3] é "+valoresInt[3]);
        System.out.println("O 5º Elemento do Vetor - índice[4] é "+valoresInt[4]);
    }

    public void exemplo3() {
        //gerar o meu vetor
        double nReais[]= new double[10];
        System.out.println("Digite 10 nº reais");
        nReais[0]=sc.nextDouble();
        nReais[1]=sc.nextDouble();
        nReais[2]=sc.nextDouble();
        nReais[3]=sc.nextDouble();
        nReais[4]=sc.nextDouble();
        nReais[5]=sc.nextDouble();
        nReais[6]=sc.nextDouble();
        nReais[7]=sc.nextDouble();
        nReais[8]=sc.nextDouble();
        nReais[9]=sc.nextDouble();
        System.out.println("nº reais Indice 9 - "+nReais[9]);
        System.out.println("nº reais Indice 8 - "+nReais[8]);
        System.out.println("nº reais Indice 7 - "+nReais[7]);
        System.out.println("nº reais Indice 6 - "+nReais[6]);
        System.out.println("nº reais Indice 5 - "+nReais[5]);
        System.out.println("nº reais Indice 4 - "+nReais[4]);
        System.out.println("nº reais Indice 3 - "+nReais[3]);
        System.out.println("nº reais Indice 2 - "+nReais[2]);
        System.out.println("nº reais Indice 1 - "+nReais[1]);
        System.out.println("nº reais Indice 0 - "+nReais[0]);
    }

    public void exemplo4() {
        //criar vetor das notas
        int notasAluno[]= new int[4];
        System.out.println("Digite as 4 notas do Aluno");
        notasAluno[0]=sc.nextInt();
        notasAluno[1]=sc.nextInt();
        notasAluno[2]=sc.nextInt();
        notasAluno[3]=sc.nextInt();
        double media = (notasAluno[0]+notasAluno[1]+notasAluno[2]+notasAluno[3])/4;
        System.out.println("A 1º nota é "+notasAluno[0]);
        System.out.println("A 2º nota é "+notasAluno[1]);
        System.out.println("A 3º nota é "+notasAluno[2]);
        System.out.println("A 4º nota é "+notasAluno[3]);
        System.out.println("A média é "+media);
    }
}