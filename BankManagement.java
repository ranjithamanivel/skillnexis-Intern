import java.util.*;
class BankManagement{
    //  Menu-driven program: Deposit, Withdraw, Check Balance
    //  Use Scanner, Loops, and Conditional Statements

   static double total=0;

    public static void deposit(Scanner sc){
        System.out.println("Enter the deposit amt:");
        double amt=sc.nextDouble();
        System.out.println("Deposit: "+amt);
        total+=amt;
    }


    public static void withdraw(Scanner sc) {
         System.out.println("Enter the withdraw amt:");
         double withdraw=sc.nextDouble();
         if(total>withdraw){
              total-=withdraw;
         }else{
             System.out.println("Withdraw amount more than Balance.");
         }
    }
    public static void checkBalance(){
        System.out.println("Balance: "+total);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        deposit(sc);
        withdraw(sc);
        checkBalance();  

        sc.close();
    }
}