package project.passwordExercise;

import java.util.Scanner;

public class PasswordExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type youre password: ");
        String password = input.nextLine();
        if (hasPasswordTenChar(password) && hasLettersAndDigits(password) && hasAtLeastTwoDigits(password)) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password invalid ");
        }

    }

    public static boolean hasPasswordTenChar(String tenCharacters) {
//        return tenCharacters.length() >= 10;
//        varianta scurta la if-ul de jos
        int lenght = tenCharacters.length();
        if (lenght >= 10) {
            return true;

        } else {
                return false;
        }
    }

    public static boolean hasLettersAndDigits(String lettersDigits) {
        String digits;
        String letters;

        if (lettersDigits.matches(".*[0-9].*") && lettersDigits.matches(".*[a-zA-Z].*")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasAtLeastTwoDigits(String twoDigits) {
        int counter = 0;
        for (int i = 0; i < twoDigits.length(); i++) {
            char bla = twoDigits.charAt(i);
            if (Character.isDigit(bla)) {
                counter++;
            }
        }
        if (counter >= 2) {
            return true;
        } else {
            return false;
        }
    }

}

