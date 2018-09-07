import java.util.Scanner;

public class TaxCode {

    public static void main ( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int salary, children, age;
        double tax = 0.0;

        System.out.println("Enter Salary: ");
        salary = scan.nextInt();

        System.out.println("Enter number of children: ");
        children = scan.nextInt();

        System.out.println("Enter your age: ");
        age = scan.nextInt();
        
        if (salary < 10000) {
            tax = 0;
        } else if (salary < 25000)  {
            tax = (salary - 10000) * 0.10;
        } else if (salary < 75000)  {
            tax = ((salary - 25000) * 0.20) + 1500;
        } else if (salary < 250000)  {
            tax = ((salary - 75000) * 0.30) + 1500 + 10000;
        } else if (salary >= 250000)  {
            tax = ((salary - 250000) * 0.50) + 1500 + 10000 + 52500;
        }

        if (children > 0 && children < 3)   {
            tax = tax - 1000;
        } else if (children > 0 && children >= 3)   {
            tax = tax - (1000 + (500 * (children - 2)));
        }

        if (age <= 15)  {
            tax = tax - (tax * 0.50);
        } else if (age >= 16 && age <= 21)   {
            tax = tax - (tax * 0.25);
        } else if (age >= 64 && age <= 72)   {
            tax = tax - (tax * (1/3));
        } else if (age >= 73 && age <= 80)   {
            tax = tax - (tax * (2/3));
        } else if (age >= 81)   {
            tax = 0;
        }

        if (salary < 25000 && tax < 500)  {
            tax = 500;
        } else if (salary < 75000 && salary >= 25000 && tax < 5000)  {
            tax = 5000;
        } else if (salary < 250000 && salary >= 75000 && tax < 10000)  {
            tax = 10000;
        } else if (salary >= 250000 && tax < 25000)  {
            tax = 25000;
        }

        System.out.println("Ammount owed: " + tax);

    }
}