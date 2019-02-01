import org.junit.Assert;
import org.junit.Test;

public class PresentSimpleSentencesTest {

    @Test
    public void buildDeclarativeSenttencesTestTwoWords(){
        String expected = "I want";
        String actual = PresentSimpleSentences.buildDeclarativeSenttences("I", "want");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildDeclarativeSenttencesTestOneWords(){
        String expected = "Не введено всі члени речення";
        String actual = PresentSimpleSentences.buildDeclarativeSenttences("I", null);
        Assert.assertEquals(expected, actual);
    }
}
