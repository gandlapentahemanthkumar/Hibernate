package org.jsp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private  String name;
private double perc;
private long phone;
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public List<course> getCourses() {
	return courses;
}
public void setCourses(List<course> courses) {
	this.courses = courses;
}
@ManyToMany(mappedBy = "students")
private List<course>courses;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPerc() {
	return perc;
}
public void setPerc(double perc) {
	this.perc = perc;
}
}
