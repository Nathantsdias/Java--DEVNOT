package ExerciciosVetores;

public class ExercicioVetores {
    public void exercicio1() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25 };
        int vetorB[] = new int[5];
        vetorB[0] = vetorA[0];
        vetorB[1] = vetorA[1];
        vetorB[2] = vetorA[2];
        vetorB[3] = vetorA[3];
        vetorB[4] = vetorA[4];
        System.out.println("o vetorB é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
    }
    public void exercicio2() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25,30,35,40 };
        int vetorB[] = new int[8];
        vetorB[0] = vetorA[0]*2;
        vetorB[1] = vetorA[1]*2;
        vetorB[2] = vetorA[2]*2;
        vetorB[3] = vetorA[3]*2;
        vetorB[4] = vetorA[4]*2;
        vetorB[5] = vetorA[5]*2;
        vetorB[6] = vetorA[6]*2;
        vetorB[7] = vetorA[7]*2;
        System.out.println("o vetorB * vetorA é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
    }
}