import org.junit.Assert;
import org.junit.Test;

public class ListWordsTest {
    @Test
    public void get_Ten_Words_Test(){
        int expected = 10;
        int actual = ListWord.getList();
        Assert.assertEquals(expected, actual);
    }
}
