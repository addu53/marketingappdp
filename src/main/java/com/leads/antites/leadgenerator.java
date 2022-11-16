package com.leads.antites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leads")
public class leadgenerator {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name="product_name",length = 40,nullable = false)
private String productname;
@Column(name="quantity",length = 40,nullable = false)
private String quantity;
@Column(name="name",length = 40,nullable = false)
private String name;
@Column(name="mobile",length = 40,nullable = false,unique = true)
private String mobile;
@Column(name="location",length = 40,nullable = false)
private String location;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
	
	
}
