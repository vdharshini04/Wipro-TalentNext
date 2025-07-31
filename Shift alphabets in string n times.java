/*Write a program that forms a new sentence upon talking an input sentence using the below algorithm.

Shift the alphabets N number of times in FORWARD mode by the N length of a particular word in the given String.

Example:

input1: Hi Hell

output: Jk Lipp

Explanation: H and i in 1st word "Hi" is shifted 2 times foward as the length of "Hi is 2.

All the alphabets in the word Hell are shifted 4 times forward as the length of "Hell" is 4. 

• If the alphabet reaches the end of the series, then it should be placed with Z, depending on its case.

Example:

input1: ABCDX

output: FGHIZ

Explanation: When the last alphabet X needs to be shifted 5 times and the alphabets end at Z, X is replaced by Z • 
String may contain lowercase and uppercase letters, which the in espective cases.*/

import java.util.*;

class ShiftWordsCapped {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int shift = word.length();
            StringBuilder shiftedWord = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                if (Character.isUpperCase(c)) {
                    int shifted = c + shift;
                    if (shifted > 'Z') {
                        shiftedWord.append('Z');
                    } else {
                        shiftedWord.append((char) shifted);
                    }
                } else if (Character.isLowerCase(c)) {
                    int shifted = c + shift;
                    if (shifted > 'z') {
                        shiftedWord.append('z');
                    } else {
                        shiftedWord.append((char) shifted);
                    }
                } else {
                    // Non-alphabetic character (space, punctuation), leave as is
                    shiftedWord.append(c);
                }
            }

            result.append(shiftedWord).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
