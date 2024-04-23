public class Main {
    public static void main(String[] args) {
        Methods.printThreeWords();
        Methods.checkSumSign(2, -2);
        Methods.printColor(-3);
        Methods.compareNumbers(-1, 0);
        Methods.isSumOfIntsInThisRange(12, 12);
        Methods.compareWithZero(2);
        Methods.isIntNegative(2);
        Methods.printLine("Java", 4);
        Methods.isYearLeap(2024);
        int[] arr = new int[]{0, 0, 1, 0};
        Methods.recreateArray(arr);
        System.out.println();
        Methods.createArray(100);
        System.out.println();
        int[] arr2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Methods.filterAndRecreateArray(arr2);
        System.out.println();
        Methods.createSquareArray(5);
        Methods.createNewArray(11, 7);
    }
}
