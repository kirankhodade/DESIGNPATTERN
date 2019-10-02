package com.factory.bp;

import java.io.File;
import java.util.List;

public class XMLParser implements Parser{

	public XMLParser() {
		System.out.println("XML parser constructor called..");
	}
	
	@Override
	public List<Record> parse(File file) {
		System.out.println("Parsing xml and creating record list...");
		return null;
	}

}
