public class ArrayLargest {

    public static void main(String[] args) {

        numbers();
    }

    public static void numbers() {
        double numList[] = {10.4, 1, 22, 32.4, 40, 12, 0, 99.2, 130, 23, 32, 44, 5, 33, 442.3, 22, 33, 41, 41, 553, 536, 70, 90};

        int stringLength = numList.length;
        System.out.println("The length of the array is: " + stringLength + "\n");

        double largest = numList[0];
        for (int i = 0; i < stringLength; i++) {
            if (numList[i] > largest) {
                largest = numList[i];
            }
        }
        System.out.println("The largest value is: " + largest);
        return;
    }
}
