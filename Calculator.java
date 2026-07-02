import java.util.*;
class Calculator{

    // Perform addition, subtraction, multiplication, and division using user input.
    public static void addition(int a,int b){
           System.out.println("Addition: "+(a+b));
    }

    public static void subtraction(int a,int b){
           System.out.println("Subtraction: "+(a-b));
    }
    public static void multiplication(int a,int b){
           System.out.println("Multiplication: "+(a*b));
    }
    public static void division(int a,int b){
        if(b!=0){
           System.out.println("Division: "+(double)(a/b));
        }else{
            System.out.println("Cannot divide by 0.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("Enter your choice:");
        int choice=sc.nextInt();    

        switch(choice){
           case 1:
              addition(a, b);break;
            case 2:
                subtraction(a, b);break;
            case 3:
                multiplication(a, b);break;
            case 4:
                division(a, b);break;
            default: 
                 System.out.println("Invalid");
        }
        sc.close();
    }
}