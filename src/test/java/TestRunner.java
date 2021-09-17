import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/AddGiftcardstocart.feature"},
        //glue = {"steps"},
        //features = {"src/test/java/features/"},
        //tags = "@endtoend",
        plugin = {"pretty","html:target/report.html"}

)

public class TestRunner
{

}
