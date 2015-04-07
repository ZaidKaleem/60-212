package Lab5;

// Zaid Kaleem
// 103619897
// Lab 5 - Part 2 | Q4

public class q4 {
    public static void main(String[] args)
    {

        String message = "Hello World!";
        char letter = 'o';

        // Calling method
        int result = occur(message, letter);

        System.out.println("The letter count in the message is " + result);
    }

    // Method counts the number of times the letter repeats in the message
    public static int occur(String message, char letter)
    {

        int count = 0;

        // Loop to go through the array
        for (int i = 0; i < message.length(); i++)
        {

            // Checkes if content of the array at position i matches letter
            if (message.charAt(i) == letter)
            {
                count++;
                message = message.substring(0,i) + message.substring(i+1);
                return count + occur(message, letter); //Recursive call
            }
        }

        return count;
    }
}