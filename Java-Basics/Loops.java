public class Loops {
    public static void main(String[] args) {

        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\nWhile Loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        System.out.println("\nDo-While Loop:");
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= 5);
    }
}
