package com.person;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws EmployeeException {
		if(age < 0)
			throw new EmployeeException("Age", this.age);
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == this)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof Person))
			return false;
		Person other = (Person)obj;
		return (this.name == other.name && this.age == other.age);
	}
}
