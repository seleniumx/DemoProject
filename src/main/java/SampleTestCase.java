import org.seleniumx.annotations.DriverSettings;
import org.seleniumx.annotations.Script;
import org.seleniumx.util.Set;
import org.seleniumx.util.TestCase;

public class SampleTestCase extends TestCase {
    @DriverSettings(
            BASE_URL = "https://www.seleniumx.com",
            WINDOW_SIZE = Set.WINDOW_SIZE.DEFAULT,
            OS = Set.OS.LINUX,
            BROWSER = Set.BROWSER.CHROME)
    @Script(script = SampleScript.class)
    public void testCase() {
        data.put("Result", "Documentation");
        testCase(data);
    }
}
