package Lab6_P1.Q5;


public class Email extends Document {
    private String sender;
    private String recipient;
    private String title;

    //Setters
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Getters
    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }

    public String getTitle() {
        return title;
    }

    //No-arg
    public Email(){

    }

    //Constructor
    public Email(String text, String sender, String recipient, String title){
        super(text);
        setRecipient(recipient);
        setSender(sender);
        setTitle(title);
    }
    
    //toString
    public String toString(){
        return "\nSender: " + getSender() + "\nRecipient: " + getRecipient() + "\nTitle: " + getTitle() + super.toString();
    }
}
