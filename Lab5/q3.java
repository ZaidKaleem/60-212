package Lab5;

// Zaid Kaleem
// 103619897
// Lab 5 - Part 2 | Q3


public class q3 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        // Calling sumArray method
        int result = sumArray(array, array.length - 1);

        System.out.println("The sum of the array is " + result);
    }

    // Sums up all elements in the array
    public static int sumArray(int[] array, int length){

        if (length == 0){
            return array[length];
        }

        else
            return array[length] + sumArray(array, length - 1);
    }
}
