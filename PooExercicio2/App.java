package PooExercicio2;

import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Random rd = new Random();
        //criar um array de objetos
        Agenda contatos[] = new Agenda[10];
        //criar e preencher os objetos
        for (int i = 0; i < contatos.length; i++) {
            contatos[i] = new Agenda();
            //preencher os atributos do objjeto
            contatos[i].setNome(JOptionPane.showInputDialog("Nome:"));
            contatos[i].setIdade(i+18);
            contatos[i].setAltura(rd.nextDouble(1.5,2));
        }
        //busca de um objetos da Agenda(nome)
        String nomeBuscado = JOptionPane.showInputDialog("Informe o Nome Buscado");
        boolean procurar = true;
        int cont =0;
        while(procurar){
            if(nomeBuscado.equals(contatos[cont].getNome())){

            }
            }
        }
    }
