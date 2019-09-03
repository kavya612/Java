package com.quinnox.basics.model;

public class SimpleBean {
private String name=null;
private int age=0;
public SimpleBean() {
	super();
}
public String getName() {
	return name;
}
public String setName (String name) {
	return this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}
