import java.util.ArrayList;
import java.util.List;

public class IsLetter {
    public static void main(String[] args) {
                String word_1 = new String("ahmed");
                String word_2 = new String("ahmed1hks");
                String word_3 = null;
                String word_4 = "";


                System.out.println(allAlphabet(word_1));
                System.out.println(allAlphabet(word_2));
                System.out.println(allAlphabet(word_3));
                System.out.println(allAlphabet(word_4));
            }

            public static List<Character> StrCharList(String word) {
                List<Character> charList = new ArrayList<>();
                word.chars().forEach(x -> charList.add(Character.valueOf((char) x)));
                return charList;
            }

            public static boolean allAlphabet(String word) {
                if (word !=null && word.length()>0) {
                    List<Character> seq = StrCharList(word);
                    return seq.stream().allMatch(Character::isLetter);
                }
                else return false;
            }



        }


