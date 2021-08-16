package revision.oops;
class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name);
        System.out.println("");
    }
}
public class R_8_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee prajwal= new Employee();
        prajwal.id=11;
        prajwal.name="Prajwal";

        prajwal.printDetails();
    }
}
