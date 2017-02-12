package school.lemon.changerequest.java.io.pr2;

/**
 * Created by lera on 10.02.17.
 */
public class JsonString implements JsonType {

    private final String value;

    public JsonString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toStringRepresentation() {
        if ("".equals(value)) return "null";
        String newValue = value.replaceAll("\"", "\\\\\"");
        return "\"" + newValue + "\"";
    }
}
