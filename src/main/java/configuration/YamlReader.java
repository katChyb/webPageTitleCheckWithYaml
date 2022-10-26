package configuration;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.github.dockerjava.api.model.Config;
import lombok.SneakyThrows;

import java.io.File;
import java.util.Map;

public class YamlReader {



//zwracanie mapy klucz - wartosc
   @SneakyThrows
   public static Map getPropertiesFromYaml(){
       ObjectMapper  objectMapper= new ObjectMapper(new YAMLFactory());
       return objectMapper.readValue(new File("src/main/resources/config.yaml"), Map.class);

   }



}
