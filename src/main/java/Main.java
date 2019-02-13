import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] wordsE = new String[]{"want", "like", "need", "do", "live", "work", "know", "get", "see", "hear"};
        String[] wordsU = new String[]{"хотіти", "любити", "потребувати", "робити", "жити", "працювати", "знати", "ставати", "бачити", "чути"};

        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < wordsE.length; i++) {
            map.put(wordsE[i], wordsU[i]);
        }

        for (String key: map.keySet()) {

            System.out.print(key + " - ");
            System.out.println(map.get(key));
        }


    }
}