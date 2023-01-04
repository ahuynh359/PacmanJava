package pacman.ultis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ReadFile {
    public static List<List<String>> readMap(URI name) {
        List<List<String>> map = new ArrayList<>();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(name.toURL().openStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                List<String> l = Arrays.asList(line.split(";"));
                map.add(l);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return map;
    }
}
