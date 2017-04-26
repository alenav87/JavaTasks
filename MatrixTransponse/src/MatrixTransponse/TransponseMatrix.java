package MatrixTransponse;
import java.util.Random;

public class TransponseMatrix {

    public static void main(String[] args) {

        int[][] array = new int[4][5];
        int trans[][] = new int[5][4];
        int j, i;

        Random rand = new Random();

        for (i = 0; i < 4; i++) {

            for (j = 0; j < 5; j++) {

                array[i][j] = rand.nextInt(100);

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();


        for (i = 0; i < 4; i++){

            for (j = 0; j < 5; j++)

                trans[j][i] = array[i][j];
        }

        for (i = 0; i < 5; i++){

            for (j = 0; j < 4; j ++)

                System.out.print(trans[i][j] + " ");

            System.out.println();
        }

    }

}

