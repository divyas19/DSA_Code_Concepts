/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
___________________________________________________________________________________________________________________________________________

*/

import java.io.*;

public class Main {
    public static void main (String[]args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 10-i*2; j++)
                System.out.print (" ");

            int k =i;
            while(k>1)
                System.out.print(k-- +" ");

            for (int j = 1; j <= i; j++)
                System.out.print (j +" ");

            System.out.println();

        }

    }
}
