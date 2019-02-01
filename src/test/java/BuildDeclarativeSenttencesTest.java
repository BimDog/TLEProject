import org.junit.Assert;
import org.junit.Test;

public class BuildDeclarativeSenttencesTest {

    Pronouns pronouns = new Pronouns();
    Verb verb = new Verb();

    @Test
    public void test_correct_two_words(){
        String expected = "I want";
        String actual = PresentSimple.buildDeclarativeSenttences(pronouns.getWord(), verb.getWord());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_first_word_is_null(){
        String expected = "Не введено всі члени речення";
        String actual = PresentSimple.buildDeclarativeSenttences(null, verb.getWord());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_second_word_is_null(){
        String expected = "Не введено всі члени речення";
        String actual = PresentSimple.buildDeclarativeSenttences(pronouns.getWord(), null);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_two_words_is_null(){
        String expected = "Не введено всі члени речення";
        String actual = PresentSimple.buildDeclarativeSenttences(null, null);
        Assert.assertEquals(expected, actual);
    }
}