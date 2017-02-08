package school.lemon.changerequest.java.io.pr2;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/**
 * File output stream with ability to save any {@link JsonType} to file
 */
public interface IJsonOutputStream extends Closeable, Flushable {
    /**
     * Write given Json type
     *
     * @param json Json type to be written
     * @throws IOException if any exception related to IO happened
     */
    void writeJson(JsonType json) throws IOException;
}
