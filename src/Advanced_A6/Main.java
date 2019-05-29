package Advanced_A6;

public class Main {

    public String calmString(String string, String word) {

        if(string.contains("IBIZA") || string.contains("ibiza") || string.contains("Ibiza")) {

            String tempWord = word + " ";
            string = string.replaceAll(tempWord, "");

            tempWord = " " + word;
            string = string.replaceAll(tempWord, " ");
        }

        return string;
    }

    public static void main(String[] args) {

    }
}
