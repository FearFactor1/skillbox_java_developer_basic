public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowLactoseMilkAmount = 1000;

        boolean isBlocked = true;

        int cappucinoMilkRequired = 60;
        int cappucinoCofeeRequired = 15;

        boolean milkIsEnough = skimmedMilkAmount >= cappucinoMilkRequired || milkAmount >= cappucinoMilkRequired;
        boolean coffeeIsEnough = coffeeAmount >= cappucinoCofeeRequired;

        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println("Кофе машина заблокирована");
            hasErrors = true;
        }

        if (!coffeeIsEnough) {
            System.out.println("Кофе не достаточно");
            hasErrors = true;
        }

        if (!milkIsEnough) {
            System.out.println("Молока не достаточно");
            hasErrors = true;
        }

        if (!hasErrors) {
            System.out.println("Готовоим кофе");

        }

    }
}