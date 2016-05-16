package groovycalamari.gebwebbot.whatismysuseragent

import geb.Browser
import spock.lang.IgnoreIf
import spock.lang.Specification

class WhatIsMyUserAgentSpec extends Specification {

    @IgnoreIf( { System.getProperty('geb.env') != 'phantomJs' } )
    def "tests phantomJS uses firefox as user agent as set in GebConfig"() {
        when:
        Browser browser = new Browser()

        def ua
        browser.drive(baseUrl: 'https://www.whatismybrowser.com/') {
            to WhatIsMyUserAgentPage
            ua = userAgent
        }
        then:
        ua
        ua.indexOf('PhantomJS/') == -1
        ua.indexOf('Firefox/') != -1
    }

}
