import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.remote.DesiredCapabilities

environments {
    // run via “./gradlew firefoxTest”
    // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
    firefox {
        driver = { new FirefoxDriver() }
    }

    // run via “./gradlew phantomJsTest”
    phantomJs {
        driver = {
            def capabilities = new DesiredCapabilities()
            String fakeUserAgent = 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.11; rv:37.0) Gecko/20100101 Firefox/37.0'
            capabilities.setCapability('phantomjs.page.settings.userAgent', fakeUserAgent)
            new PhantomJSDriver(capabilities)
        }
    }
}
