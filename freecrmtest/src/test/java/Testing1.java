import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing1 {
    @Test
    public void runtest(){
        Assert.assertEquals("Hello", "Hello");
    }
}
