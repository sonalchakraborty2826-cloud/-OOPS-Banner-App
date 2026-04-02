public class uc6 {
    public static void printCharacter(String[] pattern) {
        for (String line : pattern) {
            System.out.println(line);
        }
        System.out.println(); // space between letters
    }

    // Static function to render full word
    public static void renderWord() {

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        };

        String[] S = {
                " *****",
                "*     ",
                " *****",
                "      *",
                " *****"
        };

        printCharacter(O);
        printCharacter(O);
        printCharacter(P);
        printCharacter(S);
    }

    public static void main(String[] args) {
        renderWord();   
    }
}