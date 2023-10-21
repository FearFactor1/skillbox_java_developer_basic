public class Main {
    public static void main(String[] args) {
        String name = "Дмитрий";
        String empty = "";

        System.out.println(empty.isEmpty());
        System.out.println(empty.isBlank());

        String blank = " \t \n ";
        System.out.println(blank.isBlank());
    }
}