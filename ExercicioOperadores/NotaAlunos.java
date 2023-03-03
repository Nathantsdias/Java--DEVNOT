package ExercicioOperadores;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);
    public void notaFrequencia() {
        System.out.println("Informe a Nota 1 do aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do aluno");
        int nota2 = sc.nextInt();
        double mediaAluno = nota1;
        mediaAluno += nota2;
        mediaAluno /= 2;
    System.out.println("a média do aluno é "+mediaAluno);
    boolean mediaAprovado = mediaAluno >=50;
    System.out.println("o aluno está aprovado por nota?"+mediaAprovado);
    System.out.println("informe a frequencia do aluno:");
    int frequenciaAluno = sc.nextInt();
    boolean frequenciaAprovado = frequenciaAluno >=75;
    System.out.println("o aluno esta aprovado por frequencia?"+frequenciaAluno);
    boolean aprovacaoFinal = (mediaAprovado==true)&&(frequenciaAprovado==true);
     System.out.println("o aluno está aprovado no curso?" + aprovacaoFinal);



        
    }
}