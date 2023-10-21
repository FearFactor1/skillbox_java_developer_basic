public class Main {
    public static void main(String[] args) {
        int[] roomCounts = new int[6];

        roomCounts[0] = 5;
        roomCounts[1] = 45;
        roomCounts[2] = 34;
        roomCounts[3] = 28;

        for (int i = 0; i < roomCounts.length; i++) {
            System.out.println(roomCounts[i]);
        }

        int[] roomCounts2 = {4, 34, 48, 9, 0, 0};

        for (int i = 0; i < roomCounts2.length; i++) {
            System.out.println(roomCounts2[i]);
        }
    }
}