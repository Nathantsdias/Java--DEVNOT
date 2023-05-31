package PooHeranca.Pessoas;

public class Funcionários {
    public class Funcionarios extends Pessoas {
        //atributos específicos
        int nif;
        String setor;
        //métodos
        public int getNif() {
            return nif;
        }
        public void setNif(int nif) {
            this.nif = nif;
        }
        public String getSetor() {
            return setor;
        }
        public void setSetor(String setor) {
            this.setor = setor;
        }
        
    }

    public void setSetor(String string) {
    }
}
