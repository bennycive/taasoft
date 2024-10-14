package com.tanzania.taasoft.service;

import com.tanzania.taasoft.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(110, "iPhone 13", 340000),
            new Product(111, "Samsung Galaxy S21", 350000),
            new Product(112, "Google Pixel 6", 320000),
            new Product(113, "OnePlus 9", 300000),
            new Product(114, "Huawei P40 Pro", 310000),
            new Product(115, "Sony Xperia 5", 290000),
            new Product(116, "Nokia 8.3", 250000),
            new Product(117, "Motorola Edge 20", 280000),
            new Product(118, "Xiaomi Mi 11", 270000),
            new Product(119, "Oppo Find X3", 260000),
            new Product(120, "LG Velvet", 240000),
            new Product(121, "Realme GT", 230000),
            new Product(122, "Asus Zenfone 8", 220000),
            new Product(123, "Blackberry Key2", 200000),
            new Product(124, "Microsoft Surface Duo", 450000),
            new Product(125, "ZTE Axon 30", 210000)
    ));


    public List<Product> getProducts(){

          return products;

      }

    public Product getProductById(int prodId) {

         return products.stream()
                 .filter(p->p.getProdId()==prodId)
                 .findFirst().orElse(new Product(prodId,"Error 404 :, Your Request Item not found", 0));

    }

     public  void addProducts(Product prod)
     {
          products.add(prod);
     }


    public void updateProduct(Product prod) {

        int index=0;
         for (int i=0; i<products.size(); i++){

             if(products.get(i).getProdId()== prod.getProdId())
             {
                 index=i;
                 products.set(index, prod);
             }
         }

    }
}




