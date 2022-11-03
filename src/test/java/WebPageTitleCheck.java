import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;


public class WebPageTitleCheck extends BaseTest {
    private static Logger log = LoggerFactory.getLogger(WebPageTitleCheck.class);
    @Tag("regression")
    @DisplayName("Page title validation test")
    @Test
    void checkTitle() {
        String actualTitle = driver.getTitle();
        log.info(">>>>>>>> My website address id: " + System.getProperty("appUrl") + "<<<<<<<<<");
        assertThat(actualTitle).isEqualTo(System.getProperty("title"));

    }
}
