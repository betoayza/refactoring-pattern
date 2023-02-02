import java.util.Arrays;

/**
 * This program is a mix between refactoring exercises & comments good practices
 */

public class Main {
    public static void main(String[] args) {
        int[] arrInts = {1, 2, 3, 4, 5, 6, 7}; // the initial ints array
        System.out.println("First array: " + Arrays.toString(arrInts));

        // Even numbers * 3
        arrInts = iterateArray(arrInts); // "Extract Variable" + "Extract Method"
        System.out.println("Even numbers * 3: " + Arrays.toString(arrInts));

        // Get final even numbers
        int[] evenNumbers = Arrays.stream(arrInts).filter(x -> x % 2 == 0).toArray(); // "Functional Programming" + "Extract Variable"
        System.out.println("Final even numbers: " + Arrays.toString(evenNumbers));
    }

    /**
     * This function uses the "Extract method": a refactoring technique
     */
    public static int[] iterateArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = multiplyEvenBy3(array[i]); // "Extract Method": this is a bad comment, it's redundant
        }
        return array;
    }

    // Replace a conditional block
    public static int multiplyEvenBy3(int number) {
        if (number % 2 == 0) {
            number *= 3;
            return number; // "Return Early"
        }
        return number;
    }
}
