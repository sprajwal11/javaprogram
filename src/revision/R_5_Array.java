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
        System.out.println(sum3+" is the average of the array");
    }
}
