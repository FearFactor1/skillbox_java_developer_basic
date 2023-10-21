public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int poolVolume = 0;
        int fullTime = 0;

        while (true) {
            poolVolume = poolVolume + (fillingSpeed - devastationSpeed);
            fullTime = fullTime + 1;

            if(poolVolume == volume) {
                break;
            }
        }
        System.out.println("время наполнения бассейна = " + fullTime);
    }
}