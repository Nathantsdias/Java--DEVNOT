package EstruturaSwitchCase;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void Letras() {
        System.out.println("Digite uma Letra");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":
                System.out.println(letra + " É vogal");
                break;
            case "e":
                System.out.println(letra + " É vogal");
                break;
            case "i":
                System.out.println(letra + " É vogal");
                break;
            case "o":
                System.out.println(letra + " É vogal");
                break;
            case "u":
                System.out.println(letra + " É vogal");
            default:
                System.out.println(letra + " É consoante");
                break;

        }
    }

public void mes(){
    System.out.println("Digite o mês");
        String mes= sc.nextLine();
        switch (mes) {
            case "1": System.out.println(mes + " Mês correspondente a Janeiro");
            break;
            case "2": System.out.println(mes+ " Mês correspondente a Fevereiro");
            break;
            case "3": System.out.println(mes + " Mês correspondente a Março");
            break;
            case "4": System.out.println(mes+ " Mês correspondente a Abril");
            break;
            case "5": System.out.println(mes + " Mês correspondente a Maio");
            break;
            case "6": System.out.println(mes+ " Mês correspondente a Junho");
            break;
            case "7": System.out.println(mes + " Mês correspondente a Julho");
            break;
            case "8": System.out.println(mes+ " Mês correspondente a Agosto");
            break;
            case "9": System.out.println(mes + " Mês correspondente a Setembro");
            break;
            case "10": System.out.println(mes+ " Mês correspondente a Outubro");
            break;
            case "11": System.out.println(mes + " Mês correspondente a Novembro");
            break;
            case "12": System.out.println(mes+ " Mês correspondente a Dezembro");
            default:System.out.println(mes + " Mês Inexixtente");
            break;

}
}
}
