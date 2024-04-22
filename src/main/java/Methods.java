import java.io.FilterOutputStream;

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
        } else if (value > 100) {
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

    public static void isSumOfIntsInThisRange(int a, int b) {
        boolean flag;
        int sum = a + b;
        if (10 <= sum && sum <= 20) {
            flag = true;
        } else {
            flag = false;
        }
        System.out.println(flag);
    }

    public static void compareWithZero(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void isIntNegative(int a) {
        boolean flag;
        if (a < 0) {
            flag = true;
        } else {
            flag = false;
        }
        System.out.println(flag);
    }

    public static void printLine(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static void isYearLeap(int year) {
        boolean flag;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                flag = true;
            } else {
                flag = false;
            }
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        System.out.println(flag);
    }

    public static void recreateArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 1) {
                    arr2[j] = 0;
                } else if (arr[i] == 0) {
                    arr2[j] = 1;
                }
            }
        }
        for (int element : arr2) {
            System.out.print(element + " ");
        }
    }

}
