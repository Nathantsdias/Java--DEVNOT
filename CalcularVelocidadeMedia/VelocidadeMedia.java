package CalcularVelocidadeMedia;

public class VelocidadeMedia {
    public static void main(String[] args) {
        System.out.println("=== Vamos calcular a Velocidade Média ===");
        double distanciaPercorrida = 150;
        System.out.println("A distância foi de "+distanciaPercorrida+"KM");
        double tempoGasto = 2;
        System.out.println("O tempo de viagem foi de "+tempoGasto+"horas");
        double velocidadeMedia = distanciaPercorrida/tempoGasto;
        System.out.println("Logo, a velocidade média foi de "+velocidadeMedia+"Km/H");
    }
}

