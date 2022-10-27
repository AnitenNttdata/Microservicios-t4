package com.nttdata.bootcamp.microserviceWebFlux.modelo;

public class Person {
	
	private String name;
	private String lastname;
	private Integer age;
	public Person() {}
	
	public Person(String name, String lastname, int age){
		this.name= name;
		this.lastname= lastname;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
