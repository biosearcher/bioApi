package de.betaradion.biosearcher.model.raw;

import org.json.simple.JSONObject;

public abstract class BSDataStructure {

	protected int id = 0;
	protected String name = "";

	public BSDataStructure(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public abstract JSONObject getJSONDescription(int levels);

	public JSONObject getJSONDescription() {
		return getJSONDescription(0);
	}

	public abstract void loadSubmodules(int levels);

	public void loadSubmodules() {
		loadSubmodules(1000);
	}
}
