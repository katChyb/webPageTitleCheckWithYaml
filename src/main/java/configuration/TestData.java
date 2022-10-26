package configuration;

import lombok.Data;

@Data
public class TestData {
    String title;
    public TestData(String title) {
        this.title = title;
    }


}
