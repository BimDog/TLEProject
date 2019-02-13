import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] wordsE = new String[]{"want", "like", "need", "do", "live", "work", "know", "get", "see", "hear"};
        String[] wordsU = new String[]{"хотіти", "любити", "потребувати", "робити", "жити", "працювати", "знати", "ставати", "бачити", "чути"};

        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < wordsE.length; i++) {
            map.put(wordsE[i], wordsU[i]);
        }

        for (String key: map.keySet()) {
            System.out.print(key + " - ");
            String translite = scanner.next();
            if (translite.equals(map.get(key))){
                System.out.println("true");
            }
            else {
                System.out.println("falce");
            }
        }

    }
}