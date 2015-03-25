GRAMMAR_NAME=MADL
GRAMMAR_FILE=$(GRAMMAR_NAME).g4

ANTLR=antlr4
PKG_NAME=madl
OUT_DIR=src
ANTLR_FLAGS=-o $(OUT_DIR) -package $(PKG_NAME)

JAVAC=javac
TARGET_DIR=target
ANTLR_LIB=lib/antlr-4.4-complete.jar
JAVAC_FLAGS=-d $(TARGET_DIR) -classpath $(ANTLR_LIB):$(CLASSPATH)

all: antlr compile

antlr:
	$(ANTLR) $(ANTLR_FLAGS) $(GRAMMAR_FILE)

compile:
	$(JAVAC) $(JAVAC_FLAGS) $(OUT_DIR)/*.java

clean:
	rm -v $(OUT_DIR)/*.{java,tokens} $(TARGET_DIR)/$(PKG_NAME)/*.class
