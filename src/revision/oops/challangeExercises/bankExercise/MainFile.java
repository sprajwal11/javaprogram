package revision.oops.challangeExercises.bankExercise;

public class MainFile {
    public static void main(String[] args) {
        R1_BankAccount prajwalAccount = new R1_BankAccount("123456",57.0,"Prajwal","abc@gmail.com","9013269392");
//        prajwalAccount.setNumber("123456789");
//        prajwalAccount.setCustomerEmail("abc@gmail.com");
//        prajwalAccount.setCustomerPhoneNumber("9013269392");
//        prajwalAccount.setBalance(57.5);

        prajwalAccount.withdrawal(100.0);
        prajwalAccount.deposit(1000.0);
        prajwalAccount.withdrawal(1);
    }
}
