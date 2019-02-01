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
    public void build_Declarative_Senttences_Test_First_Word_Is_Null(){
        String expected = "Не введено всі члени речення";
        String actual = PresentSimpleSentences.buildDeclarativeSenttences(null, "want");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void build_Declarative_Senttences_Test_Second_Word_Is_Null(){
        String expected = "Не введено всі члени речення";
        String actual = PresentSimpleSentences.buildDeclarativeSenttences("I", null);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void build_Declarative_Senttences_Test_Two_Words_Is_Null(){
        String expected = "Не введено всі члени речення";
        String actual = PresentSimpleSentences.buildDeclarativeSenttences(null, null);
        Assert.assertEquals(expected, actual);
    }
}
