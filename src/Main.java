public class Main {
    public static void main(String[] args) {
        tasks();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void tasks() {
        System.out.println("Задача 1");
        int[] array = generateRandomArray();
        int totalPayout = 0;
        for (int i = 0; i < array.length; i++) {
            totalPayout = totalPayout + array[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalPayout + " рублей");
        System.out.println("Задача 2");
        int minPayout = array[0];
        int maxPayout = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxPayout) {
                maxPayout = array[i];
            }
            if (array[i] < minPayout) {
                minPayout = array[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxPayout + " рублей, минимальная сумма трат за день составила " + minPayout + " рублей");
        System.out.println("Задача 3");
        double averagePayout = 0;
        for (int i = 0; i < array.length; i++) {
            averagePayout = averagePayout + array[i];
        }
        System.out.println("Средняя сумма трат в день составила " + (averagePayout / array.length) + " рублей");
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}