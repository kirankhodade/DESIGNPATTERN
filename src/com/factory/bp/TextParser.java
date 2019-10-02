package com.factory.bp;

import java.io.File;
import java.util.List;

public class TextParser implements Parser{

	public TextParser() {
		System.out.println("Text parser constructor called..");
	}
	
	@Override
	public List<Record> parse(File file) {
		System.out.println("Parsing text and creating record list...");
		return null;
	}
	
}
