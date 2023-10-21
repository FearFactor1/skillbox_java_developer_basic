public class Main4 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String line = "";
        for(int i = 0; i < 100000; i++) {
            line += Math.random();
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
