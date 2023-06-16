package FormativaBancoChat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Criar conta");
            System.out.println("2. Buscar conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    criarConta(contas, scanner);
                    break;
                case 2:
                    buscarConta(contas, scanner);
                    break;
                case 0:
                    System.out.println("Encerrando a aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void criarConta(List<Conta> contas, Scanner scanner) {
        System.out.println("===== Tipo de Conta =====");
        System.out.println("1. Pessoa Física");
        System.out.println("2. Pessoa Jurídica");
        System.out.print("Escolha o tipo de conta: ");
        int tipoConta = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        Conta novaConta;
        if (tipoConta == 1) {
            novaConta = new ContaPessoaFisica(numeroConta, nomeTitular);
        } else if (tipoConta == 2) {
            novaConta = new ContaPessoaJuridica(numeroConta, nomeTitular);
        } else {
            System.out.println("Tipo de conta inválido. Voltando ao menu principal.");
            return;
        }

        contas.add(novaConta);
        System.out.println("Conta criada com sucesso!");
    }

    public static void buscarConta(List<Conta> contas, Scanner scanner) {
        System.out.println("===== Tipo de Busca =====");
        System.out.println("1. Por número de conta");
        System.out.println("2. Por nome do titular");
        System.out.print("Escolha o tipo de busca: ");
        int tipoBusca = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        if (tipoBusca == 1) {
            System.out.print("Digite o número da conta: ");
            String numeroConta = scanner.nextLine();
            buscarContaPorNumero(contas, numeroConta);
        } else if (tipoBusca == 2) {
            System.out.print("Digite o nome do titular da conta: ");
            String nomeTitular = scanner.nextLine();
            buscarContaPorNome(contas, nomeTitular);
        } else {
            System.out.println("Tipo de busca inválido. Voltando ao menu principal.");
        }
    }

    public static void buscarContaPorNumero(List<Conta> contas, String numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numeroConta)) {
                System.out.println("Conta encontrada:");
                System.out.println(conta);
                return;
            }

}
    }
    }

