package ExercicioIfElse;

import java.util.Scanner;

public class Exercicios {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.print("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }

        sc.close();
    }

    public void exercicio2() {
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int idade = 2023 - anoNascimento;

        if (idade >= 16) {
            System.out.println("Parabéns, você poderá votar este ano! Individuo de Maior.");
        } else {
            System.out.println("Você não poderá votar este ano! Individuo de Menor.");
        }

        sc.close();
    }

    public void exercicio3() {
        // Define a senha válida
        int senhaValida = 116005;

        try (// Lê a senha fornecida pelo usuário
                Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a senha: ");
            int senha = sc.nextInt();

            // Verifica se a senha fornecida é válida
            if (senha == senhaValida) {
                System.out.println("SENHA CORRETA! ACESSO PERMITIDO");
            } else {
                System.out.println("TENTE NOVAMENTE! ACESSO NEGADO");
            }
        }
    }

    public void exercicio4() {
        // Define o preço unitário das maçãs
        double precoMenosDeDoze = 0.30;
        double precoDozeOuMais = 0.25;

        try (// Lê o número de maçãs compradas
                Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o número de maçãs compradas: ");
            int quantidade = sc.nextInt();

            // Calcula o valor total da compra
            double precoUnitario = (quantidade < 12) ? precoMenosDeDoze : precoDozeOuMais;
            double valorTotal = quantidade * precoUnitario;

            // Imprime o resultado
            System.out.printf("O valor total da compra é R$ %.2f", valorTotal);
        }
    }

    public void exercicio5() {
        try (// Lê os três valores inteiros
                Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();
            System.out.print("Digite o terceiro número: ");
            int num3 = sc.nextInt();

            // Ordena os números em ordem crescente
            int menor, meio, maior;
            if (num1 < num2 && num1 < num3) {
                menor = num1;
                if (num2 < num3) {
                    meio = num2;
                    maior = num3;
                } else {
                    meio = num3;
                    maior = num2;
                }
            } else if (num2 < num1 && num2 < num3) {
                menor = num2;
                if (num1 < num3) {
                    meio = num1;
                    maior = num3;
                } else {
                    meio = num3;
                    maior = num1;
                }
            } else {
                menor = num3;
                if (num1 < num2) {
                    meio = num1;
                    maior = num2;
                } else {
                    meio = num2;
                    maior = num1;
                }
            }
            // Imprime os números em ordem crescente
            System.out.printf("%d, %d, %d", menor, meio, maior);
        }
    }

    public void exercicio6() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a altura (em metros): ");
            double altura = sc.nextDouble();
            System.out.print("Digite o sexo (1 para feminino, 2 para masculino): ");
            int sexo = sc.nextInt();

            double pesoIdeal;
            if (sexo == 1) {
                pesoIdeal = 62.1 * altura - 44.7;
            } else if (sexo == 2) {
                pesoIdeal = 72.7 * altura - 58;
            } else {
                System.out.println("Opção inválida para o sexo.");
                return;
            }

            System.out.printf("O peso ideal para uma pessoa de %.2f metros de altura e sexo %d é %.2f kg.", altura,
                    sexo, pesoIdeal);
        }
    }

    public void exercicio7() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe a Nota 1 do aluno");
            int nota1 = sc.nextInt();
            System.out.println("Informe a Nota 2 do aluno");
            int nota2 = sc.nextInt();
            double mediaAluno = nota1;
            mediaAluno += nota2;
            mediaAluno /= 2;
            System.out.println("a média do aluno é " + mediaAluno);

            boolean mediaAprovado = mediaAluno >= 50;
            System.out.println("o aluno está aprovado por nota? " + mediaAprovado);

            System.out.println("informe a frequencia do aluno:");
            int frequenciaAluno = sc.nextInt();
            boolean frequenciaAprovado = frequenciaAluno >= 75;
            System.out.println("o aluno esta aprovado por frequencia? " + frequenciaAprovado);

            boolean aprovacaoFinal = (mediaAprovado == true) && (frequenciaAprovado == true);
            if (aprovacaoFinal == true) {
                System.out.println("o aluno está aprovado no curso");
            } else {
                if (mediaAprovado == false) {
                    System.out.println("o aluno foi reprovado por nota");
                } else if (frequenciaAprovado == false) {
                    System.out.println("o aluno foi reprovado por frequência");
                }
                System.out.println("o aluno está reprovado no curso");
            }
        }
    }
}