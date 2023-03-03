public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
        int sumSalary = 0;
        for (int j : arr) {
            sumSalary += j;
        }
        System.out.println("Сумма трат за месяц составила " + sumSalary + " рублей.");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxSpending = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpending) {
                maxSpending = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+ maxSpending +" рублей");
        int minSpending = 1_000_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSpending) {
                minSpending = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ minSpending +" рублей");
    }
}