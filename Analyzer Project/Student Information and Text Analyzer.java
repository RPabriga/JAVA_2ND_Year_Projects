
package myPACKAGE;

import java.util.*;
import java.util.regex.*;

public class PABRIGA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {

        System.out.println("❤️❤️❤️--------------------------------❤️❤️❤️");
        System.out.println("      JAVA REGEX ACTIVITY");
        System.out.println("❤️❤️❤️--------------------------------❤️❤️❤️");
        System.out.println("1. Validate Student Information");
        System.out.println("2. Check Password Strength");
        System.out.println("3. Analyze Text");
        System.out.println("4. Exit");
        System.out.println("❤️❤️❤️--------------------------------❤️❤️❤️");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) { // an option where you validate student information, about validating student information

            // Regex for student information in the data, finding bot the regex info of email,name, phone, nd studentID
            String nameRegex = "^[A-Za-z ]+$";
            String emailRegex = "^[A-Za-z0-9._%+-]+@gmail\\.com$";
            String phoneRegex = "^09[0-9]{9}$";
            String studentIdRegex = "^2026-[0-9]{5}$";

            System.out.print("Enter Full Name: ");
            String fullName = sc.nextLine();

            System.out.print("Enter Email: ");
            String emailAddress = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phoneNumber = sc.nextLine();

            System.out.print("Enter Student ID: ");
            String studentId = sc.nextLine();

            System.out.println(" ");
            System.out.println("😍😍--------- VALIDATION RESULT ----------😍😍");
            System.out.println(" ");

            if (fullName.matches(nameRegex)) {
                System.out.println("Valid Full Name");
            } else {
                System.out.println("Invalid Full Name");
            }

            if (emailAddress.matches(emailRegex)) {
                System.out.println("Valid Email");
            } else {
                System.out.println("Invalid Email");
            }

            if (phoneNumber.matches(phoneRegex)) {
                System.out.println("Valid Phone");
            } else {
                System.out.println("Invalid Phone");
            }

            if (studentId.matches(studentIdRegex)) {
                System.out.println("Valid Student ID");
            } else {
                System.out.println("Invalid Student ID");
            }

        } else if (choice == 2) { // An option of which it is where you check your password, and determines the strength and weakness of the password

            	// Checks the password that the user inputted
            	System.out.print("Enter Password: ");
            	String password = sc.nextLine();

            	// finding the rejection of the given password
            	String uppercaseRegex = ".*[A-Z].*";
            	String lowercaseRegex = ".*[a-z].*";
            	String numberRegex = ".*[0-9].*";
            	String specialRegex = ".*[^A-Za-z0-9].*";

            	// finding the length of the analyzed text
            	boolean minimumLength = password.length() >= 8; // checks if the password length is atleast 8 characters, therefore True
            	boolean hasUppercase = password.matches(uppercaseRegex); //checks if the password is uppercase, there True
            	boolean hasLowercase = password.matches(lowercaseRegex); // checks if the password is lowercase, therefore True
            	boolean hasNumber = password.matches(numberRegex); // checks if the password has a number, therefore True
            	boolean hasSpecial = password.matches(specialRegex); // checks if the password, has a special symbol, therefore True

           
            	int passed = 0; // the counter on how much has passed

            	if (minimumLength) {
                passed++;
            	}
            	if (hasUppercase) {
                passed++;
            	}
            	if (hasLowercase) {
                passed++;
            	}
            	if (hasNumber) {
                passed++;
            	}
            	if (hasSpecial) {
                passed++;
            	}

            	System.out.println(" ");
            	System.out.println("😎😎--------- PASSWORD RESULT -----------😎😎");
            	System.out.println(" ");

            	if (minimumLength) { // if minimum length, then it has reached the amount of 8 characters
                System.out.println("Minimum 8 characters : PASSED");
            	} else {
                System.out.println("Minimum 8 characters : FAILED");
            	}

            	if (hasUppercase) { // if it has uppercase, therefore it is passed
                System.out.println("Uppercase letter     : PASSED");
            	} else {
                System.out.println("Uppercase letter     : FAILED");
            	}

            	if (hasLowercase) { // if it has lowercase, therefore it is passed
                System.out.println("Lowercase letter     : PASSED");
            	} else {
                System.out.println("Lowercase letter     : FAILED");
            	}

            	if (hasNumber) { // if it has number, therefore it is passed
                System.out.println("Number               : PASSED");
            	} else {
            	System.out.println("Number               : FAILED");
            	}

            	if (hasSpecial) { // if it has a special symbol, therefore it is passed
                System.out.println("Special character    : PASSED");
            	} else {
                System.out.println("Special character    : FAILED");
            	}

            
            	System.out.println(" ");

            	if (passed == 5) { // it determines that the password qualifications has passed all 5 to be considered strong
                System.out.println("Password Strength: STRONG");
            	} else if (passed >= 3) { // if the passwrod is determined to be passed greater than 3, it shows that the password is medium
                System.out.println("Password Strength: MEDIUM");
            	} else { // If the password is determined to be weaker or less than 3, it shows that the password is weak
                System.out.println("Password Strength: WEAK");
            	}
            	
                  } else if (choice == 3) { // choice 3 is choosing to analyze the text

            // Text that is shown on option 3 for analyzing the text
                  String text = "Welcome to Java Programming!\n"
                        + "Contact us at java@gmail.com or support@school.edu.\n"
                        + "For assistance, call 09171234567.\n"
                        + "Our website is https://www.example.com.\n"
                        + "The system contains 25 students and 5 instructors.";

            
                  String emailRegex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
                  String phoneRegex = "09[0-9]{9}";
                  String numberRegex = "\\b[0-9]+\\b";
                  String websiteRegex = "https?://[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

            //It is the Pattern and Matcher for emails
                  Pattern emailPattern = Pattern.compile(emailRegex);
                  Matcher emailMatcher = emailPattern.matcher(text);

            //It is the Pattern and Matcher for phone numbers
                  Pattern phonePattern = Pattern.compile(phoneRegex);
                  Matcher phoneMatcher = phonePattern.matcher(text);

            //It is the Pattern and Matcher for numbers
                  Pattern numberPattern = Pattern.compile(numberRegex);
                  Matcher numberMatcher = numberPattern.matcher(text);

            //It is the Pattern and Matcher for websites
                  Pattern websitePattern = Pattern.compile(websiteRegex);
            Matcher websiteMatcher = websitePattern.matcher(text);

            System.out.println();
            System.out.println("💕💕========== TEXT ANALYZER ==========💕💕");
            System.out.println();

            System.out.println("Email Addresses:");
            int count = 1;

            while (emailMatcher.find()) {
                System.out.println(count + ". " + emailMatcher.group());
                count++;
            }

            System.out.println();
            System.out.println("Phone Numbers:");
            count = 1;
            while (phoneMatcher.find()) {
                System.out.println(count + ". " + phoneMatcher.group());
                count++;
            }

            System.out.println();
            System.out.println("Numbers:");
            count = 1;
            while (numberMatcher.find()) {
                System.out.println(count + ". " + numberMatcher.group());
                count++;
            }

            System.out.println();
            System.out.println("Website URLs:");
            count = 1;
            while (websiteMatcher.find()) {
                System.out.println(count + ". " + websiteMatcher.group());
                count++;
            }

        		} else if (choice == 4) { // it tells that the user chose is 4, the program exits the functionality
        			System.out.println("Program exited....");

        		} else {
            System.out.println("Invalid choice!!!!!! This option is not implemented yet.");

        }
            System.out.println();
        }
        sc.close();
    }
}

