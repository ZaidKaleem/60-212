package Lab6_P1.Q5;


public class File extends Document {
    private String pathName;

    //Setter
    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    //Getter
    public String getPathName() {
        return this.pathName;
    }

    //No-arg
    public File(){

    }

    //Constructor
    public File(String text, String pathName){
        super(text);
        setPathName(pathName);
    }

    //toString
    public String toString(){
        return super.toString() + "\nPathname: " + getPathName();
    }
}
