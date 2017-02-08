package school.lemon.changerequest.java.io.pr2;

/**
 * Marks given type as JSON-convertible type
 */
public interface JsonType {
    /**
     * Return JSON representation of current object as java String
     *
     * @return JSON object representation
     */
    String toStringRepresentation();
}
