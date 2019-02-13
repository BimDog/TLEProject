import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuildDeclarativeSenttencesTest {

   private Pronouns pronouns;
   private Verb verb;

    @Before
    public void setUp(){
       this.pronouns = new Pronouns();
       this.verb = new Verb();
    }

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
