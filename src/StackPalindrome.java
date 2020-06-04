import java.util.*;

/** Uses a stack to determine if a string is a palindrome, ignoring spaces, capitalization and special characters. */
public class StackPalindrome {
        
        /** The main method executes other methods within the class. */
        public static void main(String args[]) {
                String p = getPalindrome();
                String a = getAnswer(p);
                printOutput(a);
        } // end main

        /** Reads and stores the user's input; removes spaces, ignores special characters and changes all characters to lower case; returns the new string representing the palindrome.
        @return The new string representing the palindrome. */
        public static String getPalindrome() {
                Scanner s = new Scanner(System.in);
                String p = "", p2 = "";
                System.out.println("Enter a string (spaces, capitalization and special characters will be ignored):");
                try {
                        p = s.nextLine();
                } // end try
                catch (InputMismatchException e) {
                        System.out.println("Incorrect input; ending program.");
                        System.exit(0);
                } // end catch
                p.replaceAll("\\s+","");
                int i, e = p.length();
                char c, c2;
                for (i = 0; i < e; i++) {
                        c = p.charAt(i);
                        if (Character.isLetter(c)) {
                                c2 = Character.toLowerCase(c);
                                p2 = p2 + c2;
                        } // end if
                } // end for
                return p2;
        } // end getPalindrome

        /** Uses a stack to get a new string which is the palindrome printed backwards; returns a string containing wheter or not the user's inputted string is a palindrome.
        @return a The string containing whether or not the user's inputted string is a palindrome.
        @parameter p The new string representing the palindrome. */
        public static String getAnswer(String p) {
                int i, e = p.length();
                Stack<Character> s  = new Stack<>();
                String p2 = "";
                String a = "";
                if (p.equals("")) {
                        a = "Empty input; ending program.";
                        return a;
                } // end if
                for (i = 0; i < e; i++) {
                        s.push(p.charAt(i));
                } // end for
                for (i = 0; i < e; i++) {
                        p2 = p2 + s.pop();
                }
                if (p.equals(p2)) {
                        a = (p + " is a palindrome; ending program.");
                        return a;
                } // end if
                else {
                        a = (p + " is not a palindrome; ending program.");
                        return a;
                } // end else
        } // end getAnswer

        /** Prints the string containing whether or not the user's inputted string is a palindrome.
        @return a The string containing whether or not the user's inputted string is a palindrome. */
        public static void printOutput(String a) {
                System.out.println(a);
        } // end printOutput     
        
} // end StackPalindrome
