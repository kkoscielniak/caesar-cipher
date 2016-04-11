package pl.kkoscielniak.caesarCipher.view;

import java.util.Scanner;

/**
 * Responsible for maintaining the presentation layer - the view. 
 * @author krystian
 */
public class View {
    /**
     * Represents instance of Scanner object, which is responsible for 
     * collecting information from user.
     */
    private final Scanner scanner = new Scanner(System.in);

    /**
     * The constructor takes no arguments.
     */
    public View() {}
    
    /**
     * Prompts for sentence if the user didn't pass it as an arguments.
     * @return input written by the user
     */
    public String getTheSentence() {
        System.out.print("Put the sentence to encode: ");       
        return scanner.nextLine();
    }
    
    /**
     * Prompts for sentence if the user didn't pass it as an arguments.
     * @return input written by the user
     */
    public int getTheOffset() {
        System.out.print("What is the offset? ");
        return Integer.parseInt(scanner.nextLine());
    }
    
    /**
     * Prints the given message
     * @param msg message to print
     */
    public void printMessage(String msg) {
        System.out.print(msg);
    }   
}
