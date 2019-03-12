package millionairerpackage;

import java.util.Scanner;

public class HomeAssignmentWithConstructor {
    public static void main(String[] args) {
        String[] options1 = {
                "A. Moth ",
                "B. Roach ",
                "C. Fly ",
                "D. Beetle "
        };
        String stringQuestion1 =
                "Which insect shorted out an early supercomputer and inspired the term \"computer bug\"?";
        String answer1 = "A";
        Questions question1 = new Questions (stringQuestion1, answer1, options1);

        String[] options2 = {"A. New Delhi ", "B. Cairo ", "C. Moscow ", "D. Baghdad "};
        String stringQuestion2 = "Now used to refer to a cat, the word \"tabby\" " +
                "is derived from the name of a district of what world capital?";
        String answer2 = "D";
        Questions question2 = new Questions (stringQuestion2, answer2, options2);

        String[] options3 = {"A. Albert Einstein ", "B. Niels Bohr ", "C. Isaac Newton ", "D. Enrico Fermi "};
        String stringQuestion3 = "Which of the following men does not have a chemical element named for him? ";
        String answer3 = "C";
        Questions question3 = new Questions (stringQuestion3, answer3, options3);

        Questions[] question = new Questions[3];
        question[0] = question1;
        question[1] = question2;
        question[2] = question3;
        for (int i = 0; i < question.length; i++) {
            System.out.println (i + 1 + " . " + question[i].getQuestions ( ) + "\nPress the correct letter:");
            for (String option : question[i].getOptions ( )) {
                System.out.println (option);
            }
            Scanner sc = new Scanner (System.in);
            String answer = sc.nextLine ( ).toUpperCase ( );

            if (answer.equals (question[i].getAnswer ( ))) {
                if (answer.equals (question[i].getAnswer ( )) && i == question.length - 1) {
                    System.out.println ("You won a million dollars!");
                    return;
                }
                System.out.println ("Correct!");
            } else {
                System.out.println ("You Lose!");
                return;
            }
        }
    }
}
