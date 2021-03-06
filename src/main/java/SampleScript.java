import org.seleniumx.annotations.Page;
import org.seleniumx.util.Script;
import org.testng.Assert;

public class SampleScript extends Script {
    @Page(page = SamplePage.class)
    public void script() {
        execute("SamplePage", "clickTab");
        Assert.assertEquals(data.get("result"), get("SamplePage", "GetResult"));
    }
}
