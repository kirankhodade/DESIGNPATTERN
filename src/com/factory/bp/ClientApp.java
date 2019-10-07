package com.factory.bp;

public class ClientApp {
	public static void main(String[] args) {
		BP batchProcessor = ClientApp.getBP(BPType.CSV);
		batchProcessor.processBatch("csvInputFile");
		
		batchProcessor = ClientApp.getBP(BPType.TEXT);
		batchProcessor.processBatch("textInputFile");
		
		batchProcessor = ClientApp.getBP(BPType.XML);
		batchProcessor.processBatch("xmlInputFile");
	}
	
	
	//Below method is a static/simple factory, but NOT factory method design pattern as it does not conform to Gang of 4 definition : of let subclass decide which object to instantiate.
	public static BP getBP(BPType bpType) {
		switch(bpType) {
			case TEXT : {
				return new TextBatchProcessor();
			}
			case CSV : {
				return new CSVBatchProcessor();
			}
			case XML : {
				return new XMLBatchProcessor();
			}
			default : {
				return null;
			}
		}
	}
}
