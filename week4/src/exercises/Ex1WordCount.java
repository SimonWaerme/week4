package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * Count number of words in some text
 *
 * See:
 * - UseCharacter
 * - UseString
 * - ShortForLoop
 */
public class Ex1WordCount {

    public static void main(String[] args) {
        new Ex1WordCount().program();
    }

    void program() {
        String string = "     word word word word       ";

        out.println(countWords(string));

        out.println(countWords("") == 0);
        out.println(countWords("hello") == 1);
        out.println(countWords(" hello ") == 1);
        out.println(countWords("hello world") == 2);
        out.println(countWords("hello        world") == 2);
        out.println(countWords("   hello        world  ") == 2);
        String s = "Education is what remains after one has forgotten what one has learned in school.";
        out.println(countWords(s) == 14);

        out.println(countWords(s));

    }

    int countWords( String input ) {
        int WordCount = 1;
        String inputTr = input.trim();
        char[] ch = inputTr.toCharArray();

        if (inputTr.isEmpty()) {
            WordCount = 0;
        }


        for (int i = 0; i < ch.length; i++) {
            if (Character.isWhitespace(ch[i]) && Character.isLetter(ch[i + 1])) {
                WordCount++;
            }



        }
        return WordCount;
    }


        /*for( int ch : input.toCharArray() ) {


            if( input.contains( Character.isLetter( ch ))) {
                WordCount++;
            }
        }
        return WordCount;
    }*/



}
