public class UPcase_a_speci_char_in_String 
{
    public static void main(String[] args) {
        String inputString = "hello world";
        int indexToUppercase = 0; // Index of the character to be uppercased

        // Convert string to character array
        char[] charArray = inputString.toCharArray();

        if (indexToUppercase >= 0 && indexToUppercase < charArray.length) {
            // Uppercase the character at the specified index
            charArray[indexToUppercase] = Character.toUpperCase(charArray[indexToUppercase]);

            // Convert character array back to string
            String result = new String(charArray);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Index out of bounds");
        }
    }  
}
