public class VectoresMatrices {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Vector:");

        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int[][] matriz = {
            {1, 2},
            {3, 4}
        };

        System.out.println("Matriz:");

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}
