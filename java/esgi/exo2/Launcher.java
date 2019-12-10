package java.esgi.exo2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;

public class Launcher {
    public static void main(String[] args) {
        Instant start = Instant.now();
        HashMap<String, String> map = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("toast.txt"));
            map = getValues(reader);
            System.out.println(getScore(map,"padidee@nope.eu"));
        } catch (FileNotFoundException err) {
            System.err.println(err.getCause() + " " + err.getMessage());
        }
        System.out.println("Execution time of the program : " + Duration.between(start, Instant.now()));
    }

    public static HashMap<String, String> getValues(BufferedReader reader) {
        String line;
        String[] words;
        HashMap<String, String> map = new HashMap<>();
        try {
            while ((line = reader.readLine()) != null) {
                words = line.split(":");
                map.put(words[0], words[1]);
            }
        } catch (IOException err) {
            System.err.println(err.getCause() + " " + err.getMessage());
        }
        return map;
    }

    public static int getAverage() {
        int res = -1;
        return res;
    }

    public static int getScore(HashMap<String, String> map, String email) {
        return Integer.parseInt(map.get(email));
    }
}