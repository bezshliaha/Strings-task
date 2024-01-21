package app.Task_01;

public class StringsTask01 {

    public static void main(String[] args) {

        print(format(doCorrect("brange, plum, tomato, onibn, grape")));
    }

    private static String doCorrect(String items) {
        return items
                .replaceAll("b(range)","o$1")
                .replaceAll("(oni)b(n)","$1o$2");
    }

    private static String format(String items) {
        StringBuilder sb = new StringBuilder();
        String lineTemplate = "%d) %s";
        String[] words = items.split(", ");
        for (int i = 0; i<words.length; i++) {
            sb.append(String.format(lineTemplate, i, words[i])).append("\n");
        }

        return sb.toString();
    }

    private static void print(String output) {
        System.out.println(output);
    }
}