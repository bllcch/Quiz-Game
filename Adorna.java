/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adorna;

import java.util.Scanner;

/**
 *
 * @author laila
 */
public class Adorna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lives = 3;
        String correctAnswer = "James Gosling";
        String answer;
        Scanner scanner = new Scanner(System.in);

        while (lives > 0) {
            System.out.println("\nLife: " + lives);
            System.out.println("Who is the creator of Java?");
            System.out.print("Answer: ");
            answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(correctAnswer)) { 
                System.out.println("\nYou Win!");
                break;
            } else {
                lives--;
                if (lives > 0) {
                    System.out.println("Incorrect answer. Lives remaining: " + lives);
                }
            }
        }

        if (lives == 0) {
            System.out.println("\nYou Lose!");
        }

        scanner.close();
    }
    
}
