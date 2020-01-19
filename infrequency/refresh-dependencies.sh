#!/usr/bin/env bash
find $HOME/.gradle -name '*techandsolve*' | xargs rm -rf
./gradlew --refresh-dependencies
