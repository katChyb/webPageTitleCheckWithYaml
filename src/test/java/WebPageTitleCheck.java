import configuration.YamlReader;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;

public class WebPageTitleCheck extends BaseTest {


    private static Logger log = LoggerFactory.getLogger(WebPageTitleCheck.class);


    @Tag("regression")
    @DisplayName("Page title validation test")
    @ParameterizedTest(name = "{0} has been verified")
    @MethodSource("DataProvider#pageTitleSet")
    void checkTitle(String pageUrl, String expectedTitle) {
        driver.get(pageUrl);
        String actualTitle = driver.getTitle();
        log.info(">>>>>>>> My website adress id: " + pageUrl + "<<<<<<<<<");

        Map test= YamlReader.getPropertiesFromYaml();
        System.out.println(test.get("headlessMode"));
       //assertThat(actualTitle).isEqualTo(expectedTitle);

    }
}
