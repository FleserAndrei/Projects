package Objects.p3;

public class ParentClass {

    {System.out.println("Parent class instance block");}

    static {
        System.out.println("Parent class static block");
    }

    static String staticField = "Static field in parent class";

    String variable = "Variable in parent class";

    public ParentClass() {
        System.out.println("ParentClass constructor");
    }
}
