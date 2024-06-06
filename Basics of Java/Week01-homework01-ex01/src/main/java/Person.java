import java.util.Objects;

public class Person {
    public Person(String firstName, String lastName, int dob, int dod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.dod = dod;
    }

    public Person(){

    }

    public String firstName;
    public String lastName;
    public int dob;
    public int dod;

    public String toString(){
        return firstName + " " + lastName + " " + dob +" " + dod;
    }

    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                dob == person.dob &&
                dod == person.dod;

    }

    public int hashCode(){
        return Objects.hash(firstName, lastName, dob, dod);
    }
}
