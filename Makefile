ANTLR=antlr4
PKG_NAME=madl
OUT_DIR=src
ANTLR_FLAGS=-o $(OUT_DIR) -package $(PKG_NAME)
GRAMMAR_FILE=MADL.g4

all: antlr

antlr:
	$(ANTLR) $(ANTLR_FLAGS) $(GRAMMAR_FILE)

clean:
	rm -v $(OUT_DIR)/*.{java,tokens}
