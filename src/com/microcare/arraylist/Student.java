package com.microcare.arraylist;

public class Student {
	private long id;
	private String name;
	private int age;
	private boolean graduate;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGraduate() {
		return graduate;
	}
	public void setGraduate(boolean graduate) {
		this.graduate = graduate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", graduate=" + graduate + "]";
	}
	
	
	
	

}
