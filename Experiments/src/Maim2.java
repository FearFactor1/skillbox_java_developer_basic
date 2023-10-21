public class Maim2 {

    public static void main(String[] args) {
        String[] color = {"Красный", "Зелёный\n"};

        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }

        String text = "Каждый охотник желает знать, где сидит фазан";

        String[] color2 = text.split(",?\\s+");

        for (int i = 0; i < color2.length; i++) {
            System.out.println(color2[i]);
        }
    }
}
