package inputParam;

import com.sun.javaws.Main;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class inputParam {
    @Test
    public void testMain() throws IOException {
        System.out.println("main");
        String[] args = null;
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(new File("[path_to_file]"));
        System.setIn(fips);
        Main.main(args);
        System.setIn(original);
    }
}
