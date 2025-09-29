import java.util.Scanner;
import java.util.Random;
public class HealthKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String serviceDesk = "";
        String studentID = "";
        double metricValue = 0;
        int metricInt = 0;
        int healthMetric = 0;

        System.out.println("===Welcome to the Ashesi  Health Kiosk===");

        System.out.print("Enter a service code (P/L/T/C):");
        char code = scanner.next().toUpperCase().charAt(0);
        ;

        switch (code) {

            case 'P':
                System.out.println("Go to the pharmacy Kiosk");
                break;
            case 'L':
                System.out.println("Go to the lab Desk");
                break;
            case 'T':
                System.out.println("Go to: Triage Desk");
                break;
            case 'C':
                System.out.println("Go to: Counseling Desk");
                break;
            default:
                System.out.println("Invalid service code");
        }

        System.out.print("Enter the health metric 1=BMI , 2=Dosage round-up, 3=Simple trig helper");
        int choice = scanner.nextInt();

//BMI CALCULATION
        if (choice == 1) {
            System.out.print("Enter your weight in kilograms:");
            double weight = scanner.nextDouble();
            System.out.print("Enter your height in meters:");
            double height = scanner.nextDouble();
            double bmi = weight / (height * height);
            double roundedBMI = Math.round(bmi * 10) / 10.0;

            System.out.print("BMI: " + roundedBMI + "  Category: ");
            if (roundedBMI < 18.5) {
                System.out.println("Underweight");
            } else if (roundedBMI <= 24.9) {
                System.out.println("Normal");
            } else if (roundedBMI <= 29.9) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }

            //round up the dosage
        } else if (choice == 2) {
            System.out.print("Enter the required dosage in milligrams:");
            double dosage = scanner.nextDouble();
            int tablets = (int) Math.ceil(dosage / 250.0);
            System.out.println("Number of tablets: " + tablets);

        } else if (choice == 3) {
            System.out.println("Enter the angle in degrees:");
            double angle = scanner.nextDouble();
            double radians = Math.toRadians(angle);

            double s = Math.round(Math.sin(radians) * 1000) / 1000.0;
            double c = Math.round(Math.cos(radians) * 1000) / 1000.0;
            System.out.println("sin = " + s + " cos = " + c);


        }
        // ID Check

        char randomChar = (char) ('A' + random.nextInt(26));//Generate a random uppercase letter (A-Z)
        int n1 = random.nextInt(7) + 3;
        int n2 = random.nextInt(7) + 3;
        int n3 = random.nextInt(7) + 3;
        int n4 = random.nextInt(7) + 3;

        String id = "" + randomChar + n1 + n2 + n3 + n4; //Concatenate  Into the ID string

        if (id.length() != 5) {
            System.out.println("Invalid ID length");
            return;
        } else if (!Character.isLetter(id.charAt(0))) { //Make  sure the first character is a letter
            System.out.println("Invalid: first char must be a letter");
            return;

        }
        // Validation: last 4 must be digits
        else if (!(Character.isDigit(id.charAt(1)) &&
                Character.isDigit(id.charAt(2)) &&
                Character.isDigit(id.charAt(3)) &&
                Character.isDigit(id.charAt(4)))) {
            System.out.println("Invalid: last 4 must be digits");
            return;
        } else {


            System.out.println("Generated ID: " + id +
                    "ID OK");
        }


        //To securely display our code

        System.out.print("Enter your first name:");
        String firstName = scanner.next();//used next instead of nextline because i dont only need one word


        char base = Character.toUpperCase(firstName.charAt(0));


        char shifted = (char) ('A' + (base - 'A' + 2) % 26); // Shift forward by 2 positions in alphabet and wrap after Z

        String lastTwo = id.substring(3);  // Get last 2 characters of ID

        String displayCode = shifted + lastTwo + "-" + metricInt;

        System.out.println("Display Code: " + displayCode);


        // Task 5: Service Summary
        if (serviceDesk.equals("TRIAGE")) {
            System.out.println("Summary: " + serviceDesk + " | ID=" + studentID +
                    " | BMI=" + healthMetric + " | Code=" + displayCode);
        } else {            System.out.println("Summary: " + serviceDesk + " | ID=" + studentID +
                    " | Code=" + displayCode);


        }

    }
}




 //Methods used




//--- String methods ---
//toUpperCase() = changes a string to uppercase letters
//charAt(i)     = gets the character at position i (e.g., charAt(0) = first character)
//substring(i)  = returns part of the string starting at position i

//--- Character methods ---
//isLetter(ch)  = true if the character is a letter (A–Z or a–z)
//isDigit(ch)   = true if the character is a digit (0–9)

//--- Math methods ---
//round(x)      = rounds a number to the nearest integer
//ceil(x)       = rounds a number UP to the next whole number
//toRadians(x)  =converts degrees to radians
//sin(x)        = sine of angle (x in radians)
//cos(x)        =cosine of angle (x in radians)

//--- Random methods ---
//nextInt(n)    = gives a random integer between 0 and (n-1)



