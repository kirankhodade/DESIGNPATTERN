package com.factory.bp;

import java.io.File;

import com.factory.bp.TextParser;

public class TextBatchProcessor extends BP {

	@Override
	public Parser createParser(File file) {
		return new TextParser();
	}

}
