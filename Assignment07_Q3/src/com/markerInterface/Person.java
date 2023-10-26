package com.markerInterface;

public class Person implements Cloneable{
	private String name;
	private double weight;
	private double height;
    private Date birth;
    
    public Person() {
    	
    }

	public Person(String name, double weight, double height, Date birth) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	

	
	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public void display() {
		System.out.println("Name:" + name);
		System.out.println("Weight:" + weight);
		System.out.println("Height:" + height);
		System.out.println("Birthdate :" + birth);
	}
    
    @Override
    public Object clone() throws CloneNotSupportedException {
    	Person temp = (Person) super.clone();
    	
    	temp.birth = (Date) this.birth.clone();
       
    	return temp;
    }

	@Override
	public String toString() {
		return "Person [birth=" + birth + "]";
	}
    
    
}
