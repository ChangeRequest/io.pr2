package school.lemon.changerequest.java.io.pr2;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lera on 10.02.17.
 */
public class Demo {
    public static void main(String[] args) {

        JsonBoolean jsonBoolean = new JsonBoolean(false);
        JsonString jsonString = new JsonString("I need to use Quotes(\")");
        JsonString emptyString = new JsonString("");
        JsonNumber jsonDouble = new JsonNumber(34.2);
        JsonNumber jsonInteger = new JsonNumber(78);
        Map<String, JsonType> emptyMap = new HashMap<>();
        JsonObject anotherEmptyObject = new JsonObject(emptyMap);

        JsonNumber jsonNumber1 = new JsonNumber(1);
        JsonNumber jsonNumber2 = new JsonNumber(2);
        JsonNumber jsonNumber3 = new JsonNumber(3);
        JsonString jsonString1 = new JsonString("String");
        Collection<JsonType> collection = new ArrayList<>();
        collection.add(jsonNumber1);
        collection.add(jsonNumber2);
        collection.add(jsonNumber3);
        collection.add(jsonString1);
        JsonArray jsonArray = new JsonArray(collection);

        Map<String, JsonType> map = new HashMap<>();
        map.put("string", jsonString);
        map.put("list", jsonArray);
        map.put("anotherEmptyObject", anotherEmptyObject);
        map.put("boolean", jsonBoolean);
        map.put("null", emptyString);
        map.put("integer", jsonInteger);
        map.put("double", jsonDouble);

        JsonObject jsonObject = new JsonObject(map);

        String output_file = "jsonfile.json";
        try {
            OutputStream out = new FileOutputStream(output_file);
            JsonOutpputStream jsonOutpputStream = new JsonOutpputStream(out);
            jsonOutpputStream.writeJson(jsonObject);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        System.out.println(jsonObject.toStringRepresentation());
    }
}
