# Ashesi Health Kiosk

This is a simple Java console program built for Ashesi University's Object-Oriented Programming course (Lab Exercise 2).  
It simulates a health kiosk where a user can select a service, check basic health metrics, and generate a secure display code.

## What it does
- Lets you choose a service desk: **Pharmacy, Lab, Triage, or Counseling**
- If you choose Triage, you can:
  - Calculate your **BMI** (Body Mass Index) and see the category
  - Round up medicine dosages to the nearest 250 mg tablet
  - Get a quick trig helper (sine and cosine of an angle)
- Generates a random **student ID** and checks if it’s valid
- Creates a **secure display code** from your name, ID, and health metric
- Prints a simple **summary** at the end

## How to run it
1. Clone this repository:
   ```bash
   git clone https://github.com/itsbisid/Ashesi-Health-Kiosk.git

   
   2.Open the project in IntelliJ or any Java IDE.

3.Compile and run the program:
javac src/HealthKiosk.java
java src.HealthKiosk



===EXAMPLE RUN===


=== Welcome to the Ashesi Health Kiosk ===
Enter service code (P/L/T/C): T
Go to: Triage Desk
Enter health metric (1=BMI, 2=Dosage round-up, 3=Trig helper): 1
Enter your weight in kilograms: 70
Enter your height in meters: 1.75
BMI: 22.9  Category: Normal
Generated ID: H5678 → ID OK
Enter your first name: Adjoa
Display Code: C78-23
Summary: TRIAGE | ID=H5678 | BMI=22.9 | Code=C78-23







