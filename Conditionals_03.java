import java.util.Scanner;

public class Conditionals_03 {
    public static void main(String[] args) {
        // Switch case
        Scanner sc = new Scanner(System.in);


        // 1. Calculator
        System.out.print("Enter number 1 : ");
        double a = sc.nextDouble();
        System.out.print("Enter number 2 : ");
        double b = sc.nextDouble();
        System.out.print("Enter operator : ");
        String operator = sc.next();
        switch (operator) {
            case ("+") :
                System.out.println(a+b);
                break;
            case("-") :
                System.out.println(a-b);
                break;
            case("*") :
                System.out.println(a*b);
                break;
            case("/") :
                if ( b==0 ){
                    System.out.println("Not Define");
                }else if (a==0) {
                    System.out.println("0");
                } else {
                    System.out.println(a / b);
                } break;
            case ("%") :
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operator");
        }


        // 2. Days of week
        System.out.println("\nTo know day from day number");
        System.out.print("Enter day number : ");
        int c = sc.nextInt();
        System.out.print("The day is : ");
        switch (c){
            case 1 :
                System.out.println("MONDAY");
                break;
            case 2 :
                System.out.println("TUESDAY");
                break;
            case 3 :
                System.out.println("WEDNESDAY");
                break;
            case 4 :
                System.out.println("THURSDAY");
                break;
            case 5 :
                System.out.println("FRIDAY");
                break;
            case 6 :
                System.out.println("SATURDAY");
                break;
            case 7 :
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Invalid day number");
        }


        // 3. Month--> season
        System.out.println("\nTo know season ");
        System.out.print("Enter month name/number : ");
        String month = sc.next();
        System.out.print("The season is : ");
        switch (month){
            case ("january"): case ("1") :  case ("february"): case ("2") :  case ("december") : case("12"): case ("november"): case("11"):
                System.out.println("WINTER");
                break;
            case ("march"): case("3"): case ("april"): case("4"): case ("may"): case("5"):
                System.out.println("SUMMER");
                break;
            case ("june"): case("6"): case ("july"): case("7"): case ("august"): case("8"): case ("september"): case("9"): case ("october"): case("10"):
                System.out.println("MONSOON");
                break;
        }


        // 4. ATM simulator
        System.out.println("\nXYZ BANK WELCOMES YOU 🙏");
        System.out.println("MENU : \n1. Check Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Exit");
        System.out.print("Enter your  choice : ");
        int choice = sc.nextInt();
        int balance = 2000;
        int pin = 6732;
        switch (choice){
            case 1 :
                System.out.print("Enter your pin : ");
                int pin1 = sc.nextInt();
                if (pin==pin1) {
                    System.out.println(balance);
                } else{
                    System.out.println("Incorrect pin");
                }
                break;

            case 2 :
                System.out.print("Enter amount to Withdraw : ");
                int amount = sc.nextInt();
                System.out.print("Enter your pin : ");
                int pin2 = sc.nextInt();
                if (pin==pin2) {
                    if (amount<=balance){
                        System.out.println("Withdraw successfully");
                        System.out.println("Balance : "+(balance-= amount));
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                } else{
                    System.out.println("Incorrect pin");
                }
                break;

            case 3 :
                System.out.print("Enter amount to deposit : ");
                int deposit = sc.nextInt();
                System.out.print("Enter your pin : ");
                int pin3 = sc.nextInt();
                if (pin==pin3) {
                        System.out.println("Deposit successfully");
                    System.out.println("Balance : "+(balance+=deposit));
                } else{
                    System.out.println("Incorrect pin");
                }
                break;

            case 4 :
                System.out.println("Thank you ");
                break;

            default:
                System.out.println("Invalid option");
        }


       // 5. Student Pass/Fail & Distinction
        System.out.print("\nEnter your name: ");
        String name = sc.next();
        System.out.print("Enter  roll number : ");
        int roll1 = sc.nextInt();
        System.out.print("Enter marks of subject 1 : ");
        int marks1 = sc.nextInt();
        System.out.print("Enter marks of subject 2 : ");
        int marks2 = sc.nextInt();
        System.out.print("Enter marks of subject 3 : ");
        int marks3 = sc.nextInt();
        System.out.print("Enter marks of subject 4 : ");
        int marks4 = sc.nextInt();
        System.out.print("Enter marks of subject 5 : ");
        int marks5 = sc.nextInt();
        double total1 = marks1+marks2+marks3+marks4+marks5;
        double percentage1 = (total1/500)*100;
        System.out.println("Total Marks : "+total1);
        System.out.println("Percentage : "+percentage1+"%");
        if (percentage1>=90){
            System.out.println("Pass with distinction\nGrade : A+");
        } else if (percentage1>=75) {
            System.out.println("Pass\nGrade : B ");
        } else if (percentage1>=50) {
            System.out.println("Pass\nGrade : C");
        }  else if (percentage1>=40) {
            System.out.println("Pass\nGrade : D");
        } else if (percentage1<35) {
            System.out.println("Fail");
        }





    }
}

