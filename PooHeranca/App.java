package PooHeranca;

import PooHeranca.Pessoas.Alunos;
import PooHeranca.Pessoas.Funcionários;
import PooHeranca.Pessoas.Professores;

public class App {
    public static void main(String[] args) {
        //objetos
        Alunos aluno01 = new Alunos();
        //Pessoas pessoa01 = new Pessoas();
        Funcionários func01 = new Funcionários();
        Professores prof01 = new Professores();

        //set
        aluno01.setNome("Alberto Silva");
        func01.setSetor("Manutenção");
        prof01.setDiciplina("Matemática");
        
    }
}
