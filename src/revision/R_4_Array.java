package revision;

import java.util.Arrays;

public class R_4_Array {
    public static void main(String[] args) {
       /* int[] marks = {5, 3, 2, 1, 4};
        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for each loop");
        for (int element:marks){
            System.out.println(element);
        }*/

        //2D Array
        System.out.println("2D Array");
        int[][] flats;
        flats= new int [2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        for (int i=0;i< flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
