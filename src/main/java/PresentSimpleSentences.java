public class PresentSimpleSentences {

    public static String buildDeclarativeSenttences(String i, String want) {

        if(i != null && want != null) {
            return i + " " + want;
        } else {
            return "Не введено всі члени речення";
        }
    }
}
