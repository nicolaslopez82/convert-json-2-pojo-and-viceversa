
import java.io.*;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import model.Staff;

/**
 * Created by NicolasLopez on 07/06/2017.
 */
public class ConvertJSON2Pojo {

    public static void main(String[] args) {

        Gson gson = new Gson();

        ConvertJSON2Pojo convertJSON2Pojo = new ConvertJSON2Pojo();

        try (Reader reader = new FileReader("C:\\Users\\NicolasLopez\\JSONTraining\\staff.json")) {

                // Convert JSON to Java Object
                Staff staff = gson.fromJson(reader, Staff.class);
                System.out.println(staff);

                // Convert JSON to JsonElement, and later to String
                JsonElement json = gson.fromJson(reader, JsonElement.class);
                String jsonInString = gson.toJson(json);
                System.out.println(jsonInString);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
