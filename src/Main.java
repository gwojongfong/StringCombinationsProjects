import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
 
import com.java.json.Employee;
public class Main {
	 
    public static void mainx(String[] a) throws JsonParseException, Exception, Exception{
         
        Employee emp = new Employee();
        ObjectMapper mapperObj = new ObjectMapper();
        ObjectMapper mapper = new ObjectMapper(); 
        try {
            // get Employee object as a json string
            String jsonStr = mapperObj.writeValueAsString(emp);
            System.out.println(jsonStr);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        Employee emp2 = mapper.readValue("{    \"empId\": 1017,    \"name\": \"Nagesh Y\",    \"designation\": \"Manager\",    \"department\": \"Java2Novice\",    \"salary\": 30000}", Employee.class);
        System.out.println(emp);
         
    }
}