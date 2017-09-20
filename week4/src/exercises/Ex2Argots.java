package exercises;

import static java.lang.System.out;

/*
 *  Argots, silly secret languages
 *  See https://en.wikipedia.org/wiki/Argot
 *
 *  See:
 *  - UseCharacter
 *  - UseString
 * -  UseStringBuilder
 */
public class Ex2Argots {

    public static void main(String[] args) {
        new Ex2Argots().program();
    }

    void program() {
        out.println(toRobber("Jag talar rövarspråket")
                .equals("JoJagog totalolaror rorövovarorsospoproråkoketot"));

        out.println(toRobber("I speak robber language")
                .equals("I sospopeakok rorobobboberor lolanongoguagoge"));

        /*out.println(toPigLatin("My name is Eric")
                .equals("yMay amenay isway Ericway"));*/

        /*String s = "abc";
        out.println(s.charAt(1));
        char[] c = s.toCharArray();
        out.println(c[1]);

        for( int i = 0; i < c.length; i++) {

            out.println(s.charAt(i));
        }

        for( char ch: s.toCharArray()) {
            out.println(ch);
        }*/

     out.println(toRobber("JoJoJoJagogogog totototalolololarororor rorororövovovovarorororsososospopopoprorororåkokokok"));
    }

    // ---------- Methods --------------------

    String toRobber( String input) {
        String robber = "";
        for( char ch: input.toCharArray()) {
            if( isVowelOrSpace(ch)) {
                robber = robber + ch;

            }
            else {

                robber = robber + ch + "o" + ch;
            }

        }
        return robber;
    }

boolean isVowelOrSpace(char letter) {
        char[] vowels = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u', 'Y', 'y', 'Å', 'å', 'Ä', 'ä', 'Ö', 'ö', ' '};
        for( char ch: vowels) {
            if ( letter == ch) {
                return true;
            }
        }
        return false;
}


}
