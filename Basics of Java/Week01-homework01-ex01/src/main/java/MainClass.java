import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainClass {
    public static void main(String[] args) throws IOException {
        ReadFromFile readFromFile = new ReadFromFile();

        String[] split = new String[0];

        split = readFromFile.readLinesFromTextFile("names.csv");

        List<Person> persons = new ArrayList<Person>();

        for(String line : split ){

            String[] splitter;

            splitter = line.split(", ");

            Person person = new Person();
        try {
            person.firstName = splitter[0];
            person.lastName = splitter[1];
            person.dob = Integer.parseInt(splitter[2]);
            person.dod = Integer.parseInt(splitter[3]);
            persons.add(person);
        }
        catch (Exception e){
            System.out.println("Error");
        }

        }

        HashSet<Person> setPersons = new HashSet<>(persons);

        List<Person> filteredList = new ArrayList<>(setPersons);

        System.out.println(persons);
        System.out.println(filteredList);


        System.out.println(persons.size());
        System.out.println(filteredList.size());


    }

}
