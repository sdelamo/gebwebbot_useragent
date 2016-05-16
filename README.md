[![Build Status](https://travis-ci.org/sdelamo/gebwebbot_useragent.svg?branch=master)](https://travis-ci.org/sdelamo/gebwebbot_useragent)

# Geb Webbot User Agent

This repository shows how to change the user agent while using PhantomJSDriver in combination with Geb.

The user agent for PhantomJSDriver is changed in _src/test/GebConfig.groovy_

```
./gradlew phantomJsTest 
```
Executes a spock test which probes that user agent change was succesful. 
