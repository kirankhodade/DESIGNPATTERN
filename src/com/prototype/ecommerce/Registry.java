package com.prototype.ecommerce;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	private Map<String, Item> registryMap = new HashMap<String, Item>();

	public Registry() {
		loadItems();
	}

	public Item createItem(String type) {
		Item item = null;
		
		try {
			item = (Item)(registryMap.get(type)).clone();		
		}catch(CloneNotSupportedException cne) {
			cne.printStackTrace();
		}
		
		return item;
	}
	
	public void loadItems() {
		Movie m = new Movie();
		m.setTitle("DHOOM");
		m.setPrice("100");
		m.setRunTime("3 hours");
		registryMap.put("Movie", m);
		
		Books b = new Books();
		b.setTitle("Head First");
		b.setPrice("100");
		b.setNumberOfPages(250);
		registryMap.put("Book", b);
	}
}
