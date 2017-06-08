import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Address;
import model.Person;
import model.Staff;

/**
 * Created by NicolasLopez on 08/06/2017.
 */
public class ConvertJavaObject2JSON {

    public static void main(String[] args) {
        ConvertJavaObject2JSON obj = new ConvertJavaObject2JSON();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();
        List<Person> personList = dummyInsertPersons();

        try {
            // Convert object to JSON string and save into a file directly
            mapper.writeValue(new File("C:\\Users\\NicolasLopez\\JSONTraining\\out_persons.json"), personList );
                // Convert object to JSON string
                String jsonInString = mapper.writeValueAsString(personList);
                System.out.println(jsonInString);

                System.out.println(" ");

                // Convert object to JSON string and pretty print
                jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(personList);
                System.out.println(jsonInString);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Person> dummyInsertPersons() {

        List<Person> listPerson = new LinkedList<Person>();

        Person person1 = new Person("Jon", "Snow");
        Person person2 = new Person("Tyrion", "Lannister");

        Address address1 = new Address("Nightwatch", "Far North", "11111");
        Address address2 = new Address("Hayford Castle", "Kings Landing", "22222");
        Address address3 = new Address("Pentos", "Free City", "33333");

        person1.getAddresses().add(address1);
        person2.getAddresses().add(address2);
        person2.getAddresses().add(address3);

        listPerson.add(person1);
        listPerson.add(person2);
        return listPerson;
    }
}
