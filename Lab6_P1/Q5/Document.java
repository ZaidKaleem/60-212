package Lab6_P1.Q5;


public class Document {
    private String text;

    //Getter
    public String getText() {
        return this.text;
    }

    //Setter
    public void setText(String text) {
        this.text = text;
    }

    //No-arg
    public Document() {

    }

    //Constructor
    public Document(String text) {
        setText(text);
    }

    //toString
    public String toString() {
        return "\nMessage/Content: " + getText();
    }


    //Method checks for a keyword in text
    public static boolean ContainsKeyword(Document docObject, String keyword) {
        if (docObject.toString().indexOf(keyword, 0) >= 0)
            return true;
        else
            return false;
    }
}
