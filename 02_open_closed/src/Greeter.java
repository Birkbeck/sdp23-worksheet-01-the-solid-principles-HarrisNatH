public class Greeter {
    String formality;

    public String greet() {
        if (this.formality == "formal") {
            return "Good evening";
        } else if (this.formality == "casual") {
            return "Goodday?";
        } else if (this.formality == "intimate") {
            return "Hello darling!";
        } else {
            return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}

/*fix */
public interface Formality{
    void response(); 
}

public class formal implements Formality{
    @Override
    public void response(){
        return "Good Evening";
    }
}

public class casual implements Formality{
    @Override
    public void response(){
        return "Goodday?";
    }
}

public class intimate implements Formality{
    @Override
    public void response(){
        return "Hello Darling!";
    }
}

public class Greet{
    public void greet(Formality formality){
        if (Formality==null){
            return "Hello";
        }
        formality.response();
    } 
}

public class Greeter{
    public void static main (String[] args){
        new Greet().greet(new casual());
        new Greet().greet(new intimate());
        new Greet().greet(new formal());
        new Greet().greet();
    }
}