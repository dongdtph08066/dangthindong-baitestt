/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitest;


import entity.Category;
import entity.Product;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BaiTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
    

        Category category1 = new Category("DONG", "MT");
        Category category2 = new Category("TIEN", "DL");
   
        
        List<Product> pro = new ArrayList<>();
        pro.add(new Product("lapp", "MT", 16.0, category1));
        pro.add(new Product("may tinh", "MT", 15.0, category1));
        pro.add(new Product("pc", "MT", 16.0, category1));
        pro.add(new Product("tu lanh", "DL", 18.0, category2));
        pro.add(new Product("dieu hoa", "DL", 19.0, category2));
     
        
        
        Collections.sort(pro, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });        
             
       
        Collections.sort(pro, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice()> o1.getPrice() ? 1 : -1;
            }
        });
        
//        for (Product prooo : pro) {
//            System.out.println(prooo.toString());
//        }

//         Collections.sort(pro);
//         for (Product p1 : pro) {
//               System.out.println(p1);
//          }
        Scanner sc = new Scanner(System.in);
        

       
            System.out.println("Ban muon tron mat hang nao MT hay DL");
            String a = sc.nextLine();
  
            for (Product p : pro) {
                if (p.getCategory().getTag().equals(a)  ) {
                    
                        System.out.println("mat hang cua ban co: " + p.getName() + " " + p.getPrice() + " " + p.getCategory().getTag());  
                        
                }
           
            }
      
            
        }
    }

