package school.lemon.changerequest.java.io.pr2;

/**
 * Created by lera on 10.02.17.
 */
public class JsonNumber implements JsonType {

    private final Number value;

    public JsonNumber(Number value) {
        this.value = value;
    }

    public Number getValue() {
        return value;
    }

    @Override
    public String toStringRepresentation() {
        return String.valueOf(value);
    }
}
