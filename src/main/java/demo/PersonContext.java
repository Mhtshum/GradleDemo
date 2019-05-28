package demo;

public class PersonContext {
    public static PersonContext getInstance() {
        return new PersonContext();
    }

    public boolean isMale() {
        if(true) return  false;
        return true;
    }

    public boolean isAdult() {
        if(true) return  false;
        return true;
    }
}
