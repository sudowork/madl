#!/bin/sh

export CLASSPATH=.:./target:./lib/antlr-4.4-complete.jar:$CLASSPATH
java -classpath $CLASSPATH org.antlr.v4.runtime.misc.TestRig madl.MADL sourceElements -gui "$@"
