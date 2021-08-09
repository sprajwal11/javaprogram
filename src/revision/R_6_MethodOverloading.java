package revision;

public class R_6_MethodOverloading {
    public static void main(String[] args) {
        int [] marks={95,42,56,64,34};
        int x=45;
        change(marks);
        System.out.println(x);
        System.out.println("The value of array "+marks[0]);
        System.out.println(sum());

    }

    static void change(int[] marks) {
        marks[0]=98;
        System.out.println("I invented a new word!\n" + "plagiarism");
    }
    static int sum(int ...arr){
        int a=4;
        int b=3+a;
        return b;
    }
}
