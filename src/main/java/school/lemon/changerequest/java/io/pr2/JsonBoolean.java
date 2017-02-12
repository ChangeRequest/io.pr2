package school.lemon.changerequest.java.io.pr2;

/**
 * Created by lera on 10.02.17.
 */
public class JsonBoolean implements JsonType {
    private final boolean value;

    public JsonBoolean(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    @Override
    public String toStringRepresentation() {
        return String.valueOf(value);
    }
}
