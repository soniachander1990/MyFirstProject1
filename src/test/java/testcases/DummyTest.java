package testcases;

import config.FrameWorkConfig;
import org.testng.annotations.Test;

public class DummyTest {

    @Test
    public void testName(){
        System.out.println(FrameWorkConfig.getProperty("browser"));
    }
}
