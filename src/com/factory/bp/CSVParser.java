package com.factory.bp;

import java.io.File;
import java.util.List;

public class CSVParser implements Parser{
	
	public CSVParser() {
		System.out.println("CSV parser constructor called..");
	}
	
	@Override
	public List<Record> parse(File file) {
		System.out.println("Parsing csv and creating record list...");
		return null;
	}
}
