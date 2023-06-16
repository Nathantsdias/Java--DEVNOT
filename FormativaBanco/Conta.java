package FormativaBanco;

import javax.swing.JOptionPane;

public abstract class Conta {
    //atributos comuns
    String nome;
    int nConta;
    double saldo;
    //métodos
    //construtor default(vazio)
    //sets and gets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getnConta() {
        return nConta;
    }
    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //métodos opcionais
    public void saque() {
               boolean valorValido = false;
        double saque = 0;

        while (!valorValido) {
            try {
                saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Saque"));
                if (saque < 0) {
                    JOptionPane.showMessageDialog(null, "Valor inválido. Digite um valor positivo.");
                } else if (saque > saldo) {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar o saque.");
                } else {
                    valorValido = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número válido.");
            }
        }

        saldo -= saque;
        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso. Novo saldo: R$" + saldo);
    }
    public boolean saque(double valorSaque) {
        return false;
    }
}