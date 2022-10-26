package configuration;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.dockerjava.api.model.Config;

import java.io.File;

public class YamlReader {

  //  ObjectMapper  objectMapper= new ObjectMapper();
  //  objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
  YamlReader yamlReader = new YamlReader();
    Config config = yamlReader.getConfig();
public YamlReader(){

    System.out.println(config);
}
    private Config getConfig() {
        return null;
    }



    File file = new File("src/main/resources/config.yaml");


}
