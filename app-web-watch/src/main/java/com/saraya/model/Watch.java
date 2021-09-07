package com.saraya.model;

public class Watch {
	private int id;
	private int year;
	private String brand;
	private String model;
	private String image;
	
public Watch(int id, int year, String brand, String model, String image) {
		super();
		this.id = id;
		this.year = year;
		this.brand = brand;
		this.model = model;
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

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
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
	Watch other = (Watch) obj;
	if (id != other.id)
		return false;
	return true;
}


public String toString() {
	return String.format("Watch [id=%s, year=%s, brand=%s, model=%s, image=%s]", id, year, brand, model, image);
}

}
