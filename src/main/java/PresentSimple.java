public class PresentSimple {

    public static String buildDeclarativeSenttences(String pronouns, String verb) {

        if(pronouns != null && verb != null) {
            return pronouns + " " + verb;
        } else {
            return "Не введено всі члени речення";
        }
    }
}
