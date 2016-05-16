#!/bin/bash
set -e
rm -rf *.zip
./gradlew phantomJsTest
EXIT_STATUS=0
exit $EXIT_STATUS
