package revision;

public class R_5_Array {
    public static void main(String[] args) {
        System.out.println("Problem 1");
        float[] values = {43.53f, 23.65f, 87.21f, 87.65f};
        float sum = 0;
        for (float elements : values) {
            sum = sum + elements;
        }
        System.out.println("The value of sum: " + sum);
        System.out.println();
        System.out.println();
        System.out.println("Problem 2");
        float[] values2 = {43.53f, 23.65f, 87.21f, 87.65f};
        float num = 43.53f;
        boolean isInArray = false;
        for (float elements : values) {
            if (num == elements) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println(num + " is present in this Array");
        } else {
            System.out.println(num + " is not present in this array");
        }
        System.out.println();
        System.out.println();
        System.out.println("Problem 3");

        float[] values3 = {43.53f, 23.65f, 87.21f, 87.65f};
        float sum3 = 0;

        for (float elements : values) {
            sum3 = sum3 + elements;
        }
        System.out.println(sum3 + " is the average of the array");

        System.out.println();
        System.out.println();
        System.out.println("Problem 3");

        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{2, 4, 6}, {1, 3, 5}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) {         //rows loop
            for (int j = 0; j < mat1[i].length; j++) {  //column loop
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println();
        System.out.println("Problem 4");

        int[] array4={5,3,2,1};
        float sum4=0.0f;
        for (int i=0;i<array4.length;i++){
        sum4=sum4+array4[i];
        }
        System.out.println("Average of Array is "+ sum4/ array4.length);
    }
}
