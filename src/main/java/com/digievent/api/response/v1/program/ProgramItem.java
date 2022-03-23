package com.digievent.api.response.v1.program;

import java.util.List;

public class ProgramItem {

	private String itemType;
	
	private String itemTypeDescription;
	
	private String itemName;

	private List<String> itemActors;

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemTypeDescription() {
		return itemTypeDescription;
	}

	public void setItemTypeDescription(String itemTypeDescription) {
		this.itemTypeDescription = itemTypeDescription;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<String> getItemActors() {
		return itemActors;
	}

	public void setItemActors(List<String> itemActors) {
		this.itemActors = itemActors;
	}
	
}
