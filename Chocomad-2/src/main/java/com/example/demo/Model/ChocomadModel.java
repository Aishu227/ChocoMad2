package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ChocomadModel {
	    @Id
	    private int Billno;
	    private String name;
	    private String Item;
	    public String getItem() {
			return Item;
		}
		public void setItem(String item) {
			Item = item;
		}
		private int quantity;
	    private int price;
		public int getBillno() {
			return Billno;
		}
		public void setBillno(int billno) {
			Billno = billno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}

}
