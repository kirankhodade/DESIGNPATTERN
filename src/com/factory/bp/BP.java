package com.factory.bp;

import java.io.File;
import java.util.List;

public abstract class BP {
	
	protected Parser parser = null;
	
	public BP() {
		System.out.println("Batch Processor constructor called...");
	}

	//Factory method
	public abstract Parser createParser(File file);
	
	public final void processBatch(String fileName) {
		File file = openFile(fileName);
		parser = createParser(file);
		List<Record> recordList = parser.parse(file);
		processRecords(recordList);
		writeSummary();
	}
	
	private File openFile(String fileName) {
		System.out.println("File Opened..");
		return null;
	}

	private void writeSummary() {
		System.out.println("Wrote batch summary -- 0 failed...");
	}

	private void processRecords(List<Record> recordList) {
		System.out.println("Processing each record.. DB calls etc..." );
	}

}
