package Lab6_P1.Q5;


public class DocumentTester {
    public static void main(String[] args){

        // Email Object 1
        Email emailOne = new Email("Hello World!", "Zaid", "John", "Testing.");
        System.out.println(emailOne.toString());
        System.out.println("Contains Keyword 'W': " + emailOne.ContainsKeyword(emailOne, "W"));

        // Email Object 2
        Email emailTwo = new Email("Bye World!", "John", "Zaid", "Testing OK!");
        System.out.println(emailTwo.toString());
        System.out.println("Contains Keyword 'j': " + emailTwo.ContainsKeyword(emailTwo, "j"));

        // File Object 1
        File fileOne = new File("Hello World!", "HDD/Desktop/fileOne");
        System.out.println(fileOne.toString());
        System.out.println("Contains Keyword 'W': " + fileOne.ContainsKeyword(fileOne, "W"));

        // File Object 2
        File fileTwo = new File("Bye World!", "HDD/Documents/School/fileTwo");
        System.out.println(fileTwo.toString());
        System.out.println("Contains Keyword 'j': " + fileTwo.ContainsKeyword(fileTwo, "j"));

    }
}
