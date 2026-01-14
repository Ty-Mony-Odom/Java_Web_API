package com.setec.entities;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PutProductDAO {
  private Integer id;
  private String product_name;
  private double price;
  private int qty;
  private MultipartFile file;
  public Integer getId() {
	return id;
  }
  public void setId(Integer id) {
	this.id = id;
  }
  public String getProduct_name() {
	return product_name;
  }
  public void setProduct_name(String product_name) {
	this.product_name = product_name;
  }
  public double getPrice() {
	return price;
  }
  public void setPrice(double price) {
	this.price = price;
  }
  public int getQty() {
	return qty;
  }
  public void setQty(int qty) {
	this.qty = qty;
  }
  public MultipartFile getFile() {
	return file;
  }
  public void setFile(MultipartFile file) {
	this.file = file;
  }
  
}