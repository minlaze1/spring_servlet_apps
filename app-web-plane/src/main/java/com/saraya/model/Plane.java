package com.saraya.model;

public class Plane {

	private int id;
	private int year;
	private String make;
	private String model;
	private float length;
	private String image;
	
public Plane(int id, int year, String make, String model, float length, String image) {
		super();
		this.id = id;
		this.year = year;
		this.make = make;
		this.model = model;
		this.length = length;
		this.image = image;
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public float getLength() {
	return length;
}

public void setLength(float length) {
	this.length = length;
}

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Plane other = (Plane) obj;
	if (id != other.id)
		return false;
	return true;
}


public String toString() {
	return String.format("Plane [id=%s, year=%s, make=%s, model=%s, length=%s, image=%s]", id, year, make, model,
			length, image);
}
	
}
