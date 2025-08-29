#!/bin/sh
#
# Gradle start up script for UN*X
#
DIR="$( cd "$( dirname "$0" )" && pwd )"
APP_NAME="Gradle"
APP_BASE_NAME=$(basename "$0")

# Add default JVM options here if desired
DEFAULT_JVM_OPTS=""

CLASSPATH=$DIR/gradle/wrapper/gradle-wrapper.jar

exec "$JAVA_HOME/bin/java" $DEFAULT_JVM_OPTS -cp "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
