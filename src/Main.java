public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sumSpending = 0;
        for (int j : arr) {
            sumSpending += j;
        }
        System.out.println("Сумма трат за месяц составила " + sumSpending + " рублей.");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxSpending = -1;
        for (int j : arr) {
            if (j > maxSpending) {
                maxSpending = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+ maxSpending +" рублей");
        int minSpending = 1_000_000;
        for (int j : arr) {
            if (j < minSpending) {
                minSpending = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ minSpending +" рублей");
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double midSpending = 0;
        int sumSpending = 0;
        for (int j : arr) {
            sumSpending += j;
        }
        midSpending = sumSpending / 30;
        System.out.println("Средняя сумма трат за месяц составила " + midSpending + " рублей.");
    }
}