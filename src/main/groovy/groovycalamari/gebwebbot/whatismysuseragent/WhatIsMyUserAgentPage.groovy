package groovycalamari.gebwebbot.whatismysuseragent

import geb.Page

class WhatIsMyUserAgentPage extends Page {

    static url = 'detect/what-is-my-user-agent'

    static content = {
        userAgent { $('.detected_result .value', 0).text() }
    }
}
