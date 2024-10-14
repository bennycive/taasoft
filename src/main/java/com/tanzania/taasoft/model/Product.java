package com.tanzania.taasoft.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;



@Component
public class Product {

     private int prodId;
     private String prodName;
     private double price;

     public Product() {

     }

     public Product(int prodId, String prodName, double price) {
          this.prodId = prodId;
          this.prodName = prodName;
          this.price = price;
     }



     public int getProdId() {
          return prodId;
     }

     public double getPrice() {
          return price;
     }

     public String getProdName() {
          return prodName;
     }

     public void setPrice(double price) {
          this.price = price;
     }

     public void setProdName(String prodName) {
          this.prodName = prodName;
     }

     public void setProdId(int prodId) {
          this.prodId = prodId;
     }

     @Override
     public String toString() {
          return "Product{" +
                  "prodId=" + prodId +
                  ", prodName='" + prodName + '\'' +
                  ", price=" + price +
                  '}';
     }

}
