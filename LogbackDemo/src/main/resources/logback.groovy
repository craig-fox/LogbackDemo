import ch.qos.logback.classic.encoder.PatternLayoutEncoder 
import ch.qos.logback.core.FileAppender
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.WARN

def bySecond = timestamp("yyyyMMdd'T'HHmmss")

def USER_HOME = System.getProperty("user.home");
println "USER_HOME=${USER_HOME}"


appender("FILE", FileAppender) {
  println "Setting [file] property to [${USER_HOME}/myApp.log]"
  file = "${USER_HOME}/myApp.log"  
  encoder(PatternLayoutEncoder) {
    pattern = "%msg%n"
  }
}



appender("CONSOLE", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%level %logger - %msg%n"
  }
}


logger("record", DEBUG, ["FILE"])

logger("demo", WARN, ["CONSOLE"])