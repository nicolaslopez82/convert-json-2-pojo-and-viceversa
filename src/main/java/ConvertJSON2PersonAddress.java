import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import model.Address;
import model.Person;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by NicolasLopez on 08/06/2017.
 */

@SuppressWarnings("unchecked")
public class ConvertJSON2PersonAddress {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("C:\\Users\\NicolasLopez\\JSONTraining\\persons.json"));

            JSONObject jsonObject =  (JSONObject) obj;

           /* String firstName = (String) jsonObject.get("firstName");
            System.out.println(firstName);

            String lastName = (String) jsonObject.get("lastName");
            System.out.println(lastName);

            String address = (String) jsonObject.get("address");
            System.out.println(address); */

            // loop array
            JSONArray persons = (JSONArray) jsonObject.get("persons");
            Iterator<Person> person = persons.iterator();
            while (person.hasNext()) {

                /*JSONArray addresses = (JSONArray) jsonObject.get("addresses");
                Iterator<Address> address = addresses.iterator();
                while (address.hasNext()){
                    System.out.println(address.next());
                }*/
                System.out.println(person.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

   }

