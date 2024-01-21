package app.Task_02;

public class StringsTask02 {
    public static void main(String[] args) {
        print(format(deleteWord("orange, plum, tomato, onion, grape, onion", "onion")));
    }
    private static String deleteWord(String items, String word){
        String regexTemplate = "(.*)%s, |%s(.*)";
        return items.replaceAll(String.format(regexTemplate, word, word), "$1$2");
    }

    private static String format(String items) {
        StringBuilder stringBuilder = new StringBuilder();
        String lineTemplate = "%d) %s";
        String[] words = items.split(", ");
        for (int i = 0; i<words.length; i++) {
            stringBuilder.append(String.format(lineTemplate, i+1, words[i])).append("\n");
        }

        return stringBuilder.toString();
    }

    private static void print(String output) {
        System.out.println(output);
    }
}