public class Main4 {

    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";

        String[] colors = text.split(",?\\s+");

        for (String colorWord : colors) {
            System.out.println(colorWord);
        }
    }
}
