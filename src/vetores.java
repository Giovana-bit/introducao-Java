import java.util.Arrays;

public class vetores {
    public static void main(String[] args) {
        int [] numeros = new int [5]; //5 posições que vão ser preenchidos

        // [0] [1] [2] [3] [4]
        //Atribuição para cada array
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0 ; i < numeros.length ; i++) { //length indica o tamanho do array
            System.out.println(numeros[i]);
        }

        //Atribuindo letras
        String [] letras = new String[5];

        letras [0] = "A";
        letras [1] = "B";
        letras [2] = "C";
        letras [3] = "D";
        letras [4] = "E";

        for (int i = 0 ; i < letras.length ; i++) {
            System.out.println(letras[i]);
        }

        //Outra maneira de sintaxe
        String [] letras2 = {"A", "B", "C", "D", "E"};

        for (int i = 0 ; i < letras2.length ; i++) {
            System.out.println(letras2[i]);
        }

        // Outra maneira de exbição [A, B, C, D, E]
        System.out.println(Arrays.toString(letras));

        int [] numeros2 =  {9, 10, 12, 25, 2};

        //definir quais serão maior, menor e media
        int maior = numeros2[0];
        int menor = numeros2[0];
        int media = 0;

        //for de comparação para calcular
        for (int i = 0 ; i < numeros2.length ; i++) {
            if (numeros2[i] > maior) {
                maior = numeros2[i];
            }

            if (numeros2[i] < menor) {
                menor = numeros2[i];
            }

            media += numeros2[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media/numeros2.length);
    }
}
