package com.hcl;
import java.util.*;
public class AnimalClass {
	
	private List<String> animalList;
	private Set<String> animalSet;
	private Map<Integer,String> animalMap;
	private Properties animalProp;
	
	public AnimalClass() {}

	public List<String> getAnimalList() {
		return animalList;
	}

	public void setAnimalList(List<String> animalList) {
		this.animalList = animalList;
	}

	public Set<String> getAnimalSet() {
		return animalSet;
	}

	public void setAnimalSet(Set<String> animalSet) {
		this.animalSet = animalSet;
	}

	public Map<Integer, String> getAnimalMap() {
		return animalMap;
	}

	public void setAnimalMap(Map<Integer, String> animalMap) {
		this.animalMap = animalMap;
	}

	public Properties getAnimalProp() {
		return animalProp;
	}

	public void setAnimalProp(Properties animalProp) {
		this.animalProp = animalProp;
	}

	@Override
	public String toString() {
		return "AnimalClass [animalList=" + animalList + "\nanimalSet=" + animalSet + "\nanimalMap=" + animalMap
				+ "\nanimalProp=" + animalProp + "]";
	}
	
	
	

}
