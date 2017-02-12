package school.lemon.changerequest.java.io.pr2;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by lera on 11.02.17.
 */
public class JsonOutpputStream extends FilterOutputStream implements IJsonOutputStream {

    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field <tt>this.out</tt> for later use, or
     *            <code>null</code> if this instance is to be
     *            created without an underlying stream.
     */
    public JsonOutpputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void writeJson(JsonType json) throws IOException {
        String jsonString = json.toStringRepresentation();
        byte[] bytes = jsonString.getBytes();
        out.write(bytes);
    }

    @Override
    public void close() throws IOException {
    }

    @Override
    public void flush() throws IOException {
    }
}
