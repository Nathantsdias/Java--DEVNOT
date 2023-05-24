package PooInterface;

public class App {
    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(6);
        Retangulo figura2 = new Retangulo(4, 6);
        System.out.println("Nome: "+figura1.getNomeFigura()+"\nArea: "+figura1.getArea()+"\nPerimento: "+figura1.getPerimetro());
        System.out.println("Nome: "+figura2.getNomeFigura()+"\nArea: "+figura2.getArea()+"\nPerimento: "+figura2.getPerimetro());
    }
}
