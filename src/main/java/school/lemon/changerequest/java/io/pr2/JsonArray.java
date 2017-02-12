package school.lemon.changerequest.java.io.pr2;

import java.util.Collection;

/**
 * Created by lera on 10.02.17.
 */
public class JsonArray implements JsonType {
    private final Collection<JsonType> collection;

    public JsonArray(Collection<JsonType> collection) {
        this.collection = collection;
    }

    public Collection<JsonType> getCollection() {
        return collection;
    }

    @Override
    public String toStringRepresentation() {
        if (collection.isEmpty()) return "[]";
        StringBuilder newString = new StringBuilder();
        newString.append('[');
        for (JsonType element : collection) {
            newString.append(element.toStringRepresentation()).append(",");
        }
        newString.deleteCharAt(newString.length() - 1);
        newString.append(']');
        return newString.toString();
    }
}
