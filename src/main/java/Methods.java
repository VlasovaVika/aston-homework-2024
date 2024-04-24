public class Methods {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumOfIntsInThisRange(int a, int b) {
        return 10 <= (a + b) && (a + b) <= 20;
    }

    public static void compareWithZero(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isIntNegative(int a) {
        return a < 0;
    }

    public static void printLine(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static boolean isYearLeap(int year) {
        return ((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

    public static void recreateArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr2[i] = 0;
            } else {
                arr2[i] = 1;
            }
        }
        for (int element : arr2) {
            System.out.print(element + " ");
        }
    }

    public static void createArray(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void filterAndRecreateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void createSquareArray(int a) {
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            arr[i][i] = 1;
        }
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
    }

    public static void createNewArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }
}
