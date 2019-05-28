package demo;

public class Person {

    public void check() {
        PersonContext context = PersonContext.getInstance();
        if(context.isMale()){return;}
        context.isAdult();
    }
}
