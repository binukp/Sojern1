package test;

import main.java.com.sojern.VersionChecker;
import org.junit.Assert;
import org.junit.Test;

public class VersionCheckerTest {

    @Test
    public void testCheckVersion() throws Exception {
        Assert.assertEquals("1.3.2", VersionChecker.checkVersion("1.3.0","1.3.2"));
        Assert.assertEquals("1.4.2", VersionChecker.checkVersion("1.3.8.56","1.4.2"));
    }
}

