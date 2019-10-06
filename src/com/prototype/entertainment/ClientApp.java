package com.prototype.entertainment;

public class ClientApp {
	public static void main(String[] args) {
		try {
			String moviePrototype = PrototypeFactory.getInstance(ProtoType.MOVIE).toString();
			System.out.println(moviePrototype);
			
			String albumPrototype = PrototypeFactory.getInstance(ProtoType.ALBUM).toString();
			System.out.println(albumPrototype);
			
			String showPrototype = PrototypeFactory.getInstance(ProtoType.SHOW).toString();
			System.out.println(showPrototype);
			
		}catch(CloneNotSupportedException cne) {
			cne.printStackTrace();
		}
	}
}
