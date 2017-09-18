import java.util.*;

/** A program which tells you if a string is a palindrome, ignoring spaces, capitalization and special characters. */
public class stack_palindrome {

        /** The main method executes other methods within the class. */
        public static void main(String args[]) {
                String p = get_palindrome();
                String a = get_answer(p);
                print_output(a);
        } // end main

        /** Reads and stores the user's input; removes spaces, ignores special characters and changes all characters to lower case; returns the new string representing the palindrome.
        @return The new string representing the palindrome. */
        public static String get_palindrome() {
                Scanner s = new Scanner(System.in);
                String p = "", p2 = "";
                System.out.println("Enter a string:");
                try {
                        p = s.nextLine();
                } // end try
                catch (InputMismatchException e) {
                        System.out.println("Incorrect input; restart the program");
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
        } // end get_palindrome

        /** Uses a stack to get a new string which is the palindrome printed backwards; returns a string containing wheter or not the user's inputted string is a palindrome.
        @return a The string containing whether or not the user's inputted string is a palindrome.
        @parameter p The new string representing the palindrome. */
        public static String get_answer(String p) {
                int i, e = p.length();
                Stack<Character> s  = new Stack<>();
                String p2 = "";
                for (i = 0; i < e; i++) {
                        s.push(p.charAt(i));
                } // end for
                for (i = 0; i < e; i++) {
                        p2 = p2 + s.pop();
                }
                String a = "";
                if (p.equals(p2)) {
                        a = (p + " is a palindrome.");
                        return a;
                } // end if
                else {
                        a = (p + " is not a palindrome.");
                        return a;
                } // end else
        } // end get_answeri

        /** Prints the string containing whether or not the user's inputted string is a palindrome.
        @return a The string containing whether or not the user's inputted string is a palindrome. */
        public static void print_output(String a) {
                System.out.println(a);
        } // end print_output
} // end stack_palindrome
