public class Main3 {

    public static void main(String[] args) {
        int[] ticketNumbers = new int[1000];

        int[] winTickets = new int[10];

        for (int i = 0; i < ticketNumbers.length; i++) {
            int value = 1000000 + (int) Math.round(1000000 * Math.random());
            ticketNumbers[i] = value;
            if (i % 100 == 0) {
                winTickets[i / 100] = value;
            }
        }
        for (int winTicketNumber : winTickets) {
            System.out.println(winTicketNumber);
        }
    }
}
