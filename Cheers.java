// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

	    String inputWord = args[0];
            String word = inputWord.toUpperCase();
            int times = Integer.parseInt(args[1]);
            String sCheck = "AEFHILMNORSX";
            char letter;
            for (int i = 0; i < word.length(); i++) {
                letter = word.charAt(i);
                if (sCheck.indexOf(letter) == -1 ) {
                        System.out.println("Give me a  " + word.charAt(i) + ": " + word.charAt(i) + "!");
                }
                else
                {
                        System.out.println("Give me an " + word.charAt(i) + ": " + word.charAt(i) + "!");
                }
            }

            System.out.println("What does that spell?");

            for (int i = 0; i < times; i++) {
                System.out.println(word + "!!!");
            }
        }
}
