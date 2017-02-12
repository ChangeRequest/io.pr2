package school.lemon.changerequest.java.io.pr2;

import java.util.Map;

/**
 * Created by lera on 10.02.17.
 */
public class JsonObject implements JsonType {
    private final Map<String, JsonType> map;

    public JsonObject(Map<String, JsonType> map) {
        this.map = map;
    }

    public Map<String, JsonType> getMap() {
        return map;
    }

    @Override
    public String toStringRepresentation() {
        if (map.isEmpty()) return "{}";
        StringBuilder str = new StringBuilder();
        str.append("{");
        for (Map.Entry<String, JsonType> pair : map.entrySet()) {
            str.append("\"").append(pair.getKey()).append("\"").append(":").append(" ").append(pair.getValue().toStringRepresentation()).append(",");
        }
        str.deleteCharAt(str.length() - 1);
        str.append("}");
        return str.toString();
    }
}
