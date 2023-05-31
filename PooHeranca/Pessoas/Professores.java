package PooHeranca.Pessoas;

public class Professores extends Funcionários{
    //atributo especifico
    private String diciplina;
    //metodos
    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }
    
}