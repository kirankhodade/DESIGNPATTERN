package com.prototype.entertainment;

import java.util.HashMap;

public class PrototypeFactory {
	
	private static HashMap<ProtoType , PrototypeCapable> protoTypeRegistryMap = new HashMap<>();

	static {
		protoTypeRegistryMap.put(ProtoType.MOVIE, new Movie());
		protoTypeRegistryMap.put(ProtoType.ALBUM, new Album());
		protoTypeRegistryMap.put(ProtoType.SHOW, new Show());
	}
	
	public static PrototypeCapable getInstance(ProtoType pt) throws CloneNotSupportedException {
        return ((PrototypeCapable) protoTypeRegistryMap.get(pt)).clone();
    }
}
