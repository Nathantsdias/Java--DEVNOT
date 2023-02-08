package CalculadoraCustoViagem;

import javax.security.auth.x500.X500Principal;

/**
 * CustoViagem
 */
public class CustoViagem {

    public static void main(String[] args) {
        int distanciaPercorrida = 148; // em KM.
        double consumoTransporte = 10;  // em km/l.
        double preçoCombustivel = 5.00; 
        double quantidadeLitrosCombustivel = distanciaPercorrida/consumoTransporte;
        double custoTotal = quantidadeLitrosCombustivel*preçoCombustivel;
        System.out.println("o Custo Total da Viagem foi de:");
        System.out.println("R$"+custoTotal);

    }
}