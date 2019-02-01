import org.junit.Assert;
import org.junit.Test;

public class SentencesTest {

    @Test
    public void test(){
        String expected = "I want";
        String actual = Sentences.build("I", "want");
        Assert.assertEquals(expected, actual);
    }
}
