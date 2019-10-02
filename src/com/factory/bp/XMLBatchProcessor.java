package com.factory.bp;

import java.io.File;

import com.factory.bp.Parser;
import com.factory.bp.XMLParser;

public class XMLBatchProcessor extends BP {

	@Override
	public Parser createParser(File file) {
		return new XMLParser();
	}
	
}
