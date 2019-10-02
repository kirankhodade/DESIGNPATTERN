package com.factory.bp;

import java.io.File;

import com.factory.bp.CSVParser;

public class CSVBatchProcessor extends BP {

	@Override
	public Parser createParser(File file) {
		return new CSVParser();
	}

}
