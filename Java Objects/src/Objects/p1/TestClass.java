package Objects.p1;

public class TestClass {

    public void testPerson() {

        try {
            Person person_1 = new Person("Ionel", "Popescu");
            assert person_1.getFirstName().equals("Ionel") : "Invalid first name";
            assert person_1.getSureName().equals("Popescu") : "Invalid sure name";
            System.out.println("Test 1 passed");
        } catch (
                AssertionError e1) {
            System.out.println(e1.getMessage());
        }

        try {
            Person person_2 = new Person("Calin Lazar");
            assert person_2.getFirstName().equals("Calin") : "Invalid first name";
            assert person_2.getSureName().equals("Lazar") : "Invalid sure name";
            System.out.println("Test 2 passed");
        } catch (
                AssertionError e2) {
            System.out.println(e2.getMessage());
        }

        try {
            Person person_3 = new Person("Andrei");
            assert person_3.getFirstName() == null : "Invalid first name";
            assert person_3.getSureName() == null : "Invalid sure name";
            System.out.println("Test 3 passed");
        } catch (
                AssertionError e3) {
            System.out.println(e3.getMessage());
        }

    }
}
