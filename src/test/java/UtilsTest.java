import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UtilsTest {

    @Test
    public void testGetClasses() {
        List<String> output = Utils.getClasses("movie");
        assertEquals("Result 1", "http://schema.org/Movie", output.get(0));
        assertEquals("Result 2", "http://dbpedia.org/ontology/Film", output.get(1));
    }

}