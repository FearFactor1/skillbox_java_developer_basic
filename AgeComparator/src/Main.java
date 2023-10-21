public class Main {
    public static void main(String[] args) {
        int vasyaAge = 55;
        int katyaAge = 55;
        int mishaAge = 55;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
            System.out.println("Minimal age: " + min);
        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
            System.out.println("Minimal age: " + min);
        } else if (mishaAge <= vasyaAge && mishaAge <= katyaAge) {
            min = mishaAge;
            System.out.println("Minimal age: " + min);
        }

        if (vasyaAge >= mishaAge && vasyaAge <= katyaAge || vasyaAge >= katyaAge && vasyaAge <= mishaAge) {
            middle = vasyaAge;
            System.out.println("Middle age: " + middle);
        } else if (katyaAge >= vasyaAge && katyaAge <= mishaAge  || katyaAge >= mishaAge && katyaAge <= vasyaAge) {
            middle = katyaAge;
            System.out.println("Middle age: " + middle);
        } else if (mishaAge >= vasyaAge && mishaAge <= katyaAge || mishaAge >= katyaAge && mishaAge <= vasyaAge) {
            middle = mishaAge;
            System.out.println("Middle age: " + middle);

        }

        if (vasyaAge > katyaAge && vasyaAge > mishaAge) {
            max = vasyaAge;
            System.out.println("Maximal age: " + max);
        } else if (katyaAge > vasyaAge && katyaAge > mishaAge) {
            max = katyaAge;
            System.out.println("Maximal age: " + max);
        } else if (mishaAge >= vasyaAge && mishaAge >= katyaAge) {
            max = mishaAge;
            System.out.println("Maximal age: " + max);
        }
    }
}