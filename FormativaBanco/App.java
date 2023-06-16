package FormativaBanco;

import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) {
        ContaPJ[] clientePJ = new ContaPJ[10];
        ContaPF[] clientePF = new ContaPF[10];
        boolean aberto = true;
        int contPJ = 0;
        int contPF = 0;

        while (aberto) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                        +"\n 1 - Abrir Conta PJ"
                        +"\n 2 - Abrir Conta PF"
                        +"\n 3 - Acessar Conta PJ"
                        +"\n 4 - Acessar Conta PF"
                        +"\n 5 - Sair"));

            if (acao == 1) {
                clientePJ[contPJ] = new ContaPJ();
                clientePJ[contPJ].setNome(JOptionPane.showInputDialog("Informe o Nome da Empresa:"));
                clientePJ[contPJ].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ da Empresa:"));
                clientePJ[contPJ].setnConta(2000 + contPJ);
                clientePJ[contPJ].setSaldo(0);
                JOptionPane.showMessageDialog(null, "Conta PJ Criada com Sucesso");
                contPJ++;
            } else if (acao == 2) {
                clientePF[contPF] = new ContaPF();
                clientePF[contPF].setNome(JOptionPane.showInputDialog("Informe o Nome do Cliente:"));
                clientePF[contPF].setnCpf(JOptionPane.showInputDialog("Informe o CPF do Cliente:"));
                clientePF[contPF].setnConta(1000 + contPF);
                clientePF[contPF].setSaldo(0);
                JOptionPane.showMessageDialog(null, "Conta PF Criada com Sucesso");
                contPF++;
            } else if (acao == 3) {
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da Conta PJ:"));
                boolean contaEncontrada = false;
                for (int i = 0; i < contPJ; i++) {
                    if (nContaBuscada == clientePJ[i].getnConta()) {
                        JOptionPane.showMessageDialog(null, "Conta PJ Encontrada");
                        contaEncontrada = true;
                        realizarOperacoes(clientePJ[i]);
                        break;
                    }
                }
                if (!contaEncontrada) {
                    JOptionPane.showMessageDialog(null, "Conta PJ não encontrada.");
                }
            } else if (acao == 4) {
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da Conta PF:"));
                boolean contaEncontrada = false;
                for (int i = 0; i < contPF; i++) {
                    if (nContaBuscada == clientePF[i].getnConta()) {
                        JOptionPane.showMessageDialog(null, "Conta PF Encontrada");
                        contaEncontrada = true;
                        realizarOperacoes(clientePF[i]);
                        break;
                    }
                }
                if (!contaEncontrada) {
                    JOptionPane.showMessageDialog(null, "Conta PF não encontrada.");
                }
            } else if (acao == 5) {
                aberto = false;
            } else {
                JOptionPane.showMessageDialog(null, "Ação inválida. Tente novamente.");
            }
        }
    }

    public static void realizarOperacoes(Conta conta) {
        boolean acesso = true;
        while (acesso) {
            int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação desejada:"
                        +"\n 1 - Consultar o Saldo"
                        +"\n 2 - Realizar um Saque"
                        +"\n 3 - ..."));

            if (acao2 == 1) {
                JOptionPane.showMessageDialog(null, "Saldo: R$" + conta.getSaldo());
            } else if (acao2 == 2) {
                double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque:"));
                if (conta.saque(valorSaque)) {
                    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar o saque");
                }
            } else if (acao2 == 3) {
                // ...
            } else {
                JOptionPane.showMessageDialog(null, "Ação inválida. Tente novamente.");
            }
        }
    }
}
