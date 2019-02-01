import org.junit.Assert;
import org.junit.Test;

public class BuildDeclarativeSenttencesTest {

    @Test
    public void test_correct_two_words(){
        String expected = "I want";
        String actual = PresentSimpleSentences.buildDeclarativeSenttences("I", "want");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_first_word_is_null(){
        String expected = "Не введено всі члени речення";
        String actual = PresentSimpleSentences.buildDeclarativeSenttences(null, "want");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_second_word_is_null(){
        String expected = "Не введено всі члени речення";
        String actual = PresentSimpleSentences.buildDeclarativeSenttences("I", null);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_two_words_is_null(){
        String expected = "Не введено всі члени речення";
        String actual = PresentSimpleSentences.buildDeclarativeSenttences(null, null);
        Assert.assertEquals(expected, actual);
    }
}
