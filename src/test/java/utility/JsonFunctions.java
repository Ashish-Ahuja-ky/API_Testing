package utility;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class JsonFunctions {

    /*
    This class will contain functions related to Json
     */

    Gson gson = new Gson();

    /*
    De-Serialize Json to POJO Class
    Passing json file name and class as parameters
     */

    public Object deserializeJson(String jsonfile,Class c) {
        String path = "./src/test/Data/"+jsonfile+".json";
        Reader input;
        try {
             input = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return  gson.fromJson(input, c);
    }
}
