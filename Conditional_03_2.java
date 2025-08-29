import java.util.Scanner;

public class Conditional_03_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 6. BMI CATEGORY
        System.out.println("\nTo calculate BMI Ratio enter the following details ");
        System.out.print("Enter weight (kg) : ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (cm) : ");
        double height = sc.nextDouble();
        double height2 = height/100;
        double bmi = weight/(height2*height2);
       System.out.printf("Your BMI is: %.2f kg/m²\n", bmi);
        if (bmi<18.5){
            System.out.println("Underweight");
        } else if (bmi>=18.5) {
            System.out.println("Normal");
        } else if (bmi >=25.0) {
            System.out.println("Overweight");
        } else if (bmi>=30.0) {
            System.out.println("Obese");
        }


        //7. Quadratic Equation
        System.out.println("\nTo determine Nature Of Roots ");
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = sc.nextInt();
        System.out.println("Quadratic equation is "+num1+"x² + "+num2+"x + "+num3);
        double determinant = (num2*num2)-(4*num1*num3);
        System.out.println("Determinant = "+determinant);
        if (determinant>0){
            System.out.println("Roots are : Real,Distinct");
        } else if (determinant==0) {
            System.out.println("Roots are : Real,Equal");
        } else if (determinant<0) {
            System.out.println("Roots are : Complex(Imaginary)");
        }


        // 8. Grade with +/-(A,B)
        System.out.print("\nEnter marks (out of 100) : ");
        int marks = sc.nextInt();
        if (marks>=97 && marks<=100){
            System.out.println("A+");
        } else if (marks>=93) {
            System.out.println("A");
        }else if (marks>=90) {
            System.out.println("-A");
        }else if (marks>=87) {
            System.out.println("B+");
        }else if (marks>=83) {
            System.out.println("B");
        }else if (marks>=80) {
            System.out.println("B-");
        }else if (marks>=70) {
            System.out.println("C");
        }else if (marks>=60) {
            System.out.println("D");
        }else if (marks<60) {
            System.out.println("F");
        }


        // 9. Triangle Validity and Type
        System.out.println("\nTo check Triangle inequality and to identify it's Type ");
        System.out.println("Enter sides of triangle : ");
        System.out.print("Side 1 = ");
        int side1 = sc.nextInt();
        System.out.print("Side 2 = ");
        int side2 = sc.nextInt();
        System.out.print("Side 3 = ");
        int side3 = sc.nextInt();
        if (side1+side2>side3 && side1+side3>side2 && side2+side3>side1){
            System.out.println("Valid triangle ");
            if (side1==side2 && side1==side3 && side2==side3){
                System.out.print("As all sides are equal\nTherefore, the triangle is --> ");
                System.out.println("Equilateral Triangle ");
            } else if (side1 == side2  || side1==side3 || side2== side3 ) {
                System.out.print("As two sides are equal\nTherefore, the triangle is --> ");
                System.out.println("Isosceles Triangle ");
            }else {
                System.out.print("As all sides are unequal\nTherefore, the triangle is --> ");
                System.out.println("Scalene Triangle");
            }
        }else {
            System.out.println("Invalid triangle ");
        }


        // 10.Temperature Advice
        System.out.println("\nTo determine the climate according to temperature ");
        System.out.print("Enter the temperature in °C : ");
        int temperature = sc.nextInt();
        if (temperature<0){
            System.out.println("ICY/FREEZING");
        } else if (temperature<=10) {
            System.out.println("COLD");
        }  else if (temperature<=15) {
            System.out.println("COMFORTABLE TO COOL");
        } else if (temperature<=20) {
            System.out.println("PLEASANT/WARM");
        } else if (temperature<=26) {
            System.out.println("WARM/HOT");
        } else if (temperature<=30) {
            System.out.println("HOT/BURNING UP");
        } else {
            System.out.println("VERY HOT");
        }

    }
}


