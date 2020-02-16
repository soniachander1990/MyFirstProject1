package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Properties;

public class FrameWorkConfig {
    private Properties properties;
    private static FrameWorkConfig frameWorkConfig;

    private FrameWorkConfig(){
           try {
               InputStream inputStream = new FileInputStream(Paths.get("src/test/resources/FrameWork.properties").toFile());
               properties = new Properties();
               properties.load(inputStream);
           }catch (IOException ex){
               ex.printStackTrace();

           }
    }
    public static String getProperty(String Key){
        if(frameWorkConfig==null){
            frameWorkConfig=new FrameWorkConfig();
        }
        return (String) frameWorkConfig.properties.get(Key);
    }

}
