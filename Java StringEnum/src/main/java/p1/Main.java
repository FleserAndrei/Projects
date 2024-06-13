package p1;

public class Main {

    public static void main(String[] args) {

        System.out.println(ValidationClass.validateEmail("fleser.andrei.ro@gmail.com"));
        System.out.println(ValidationClass.validateEmail("steauabucuresti"));

        System.out.println(ValidationClass.validatePassword("Steauabucuresti1909@"));
        System.out.println(ValidationClass.validatePassword("fleser.andrei.ro@gmail.com"));

        System.out.println(ValidationClass.validatePhoneNumber("+40767999397"));
        System.out.println(ValidationClass.validatePhoneNumber("0040767999397"));
        System.out.println(ValidationClass.validatePhoneNumber("40767999413397"));



    }
}
