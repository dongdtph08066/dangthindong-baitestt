/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author admin
 */
public class Product   {
    private String name;
    private String categoryTag;
    private double price;
    private Category category;
    
    
    public Product(){
        
    }
    
    

    public Product(String name, String categoryTag, double price, Category category) {
        this.name = name;
        this.categoryTag = categoryTag;
        this.price = price;
        this.category = category;
    }
//    @Override
//    public int compareTo(Product product){
//        if(product.price >price){
//            return 1;
//        }else if(product.price<price){
//            return -1;  
//        } else if(product.getName().compareTo(getName())){
//            return 1;
//        } else
//        return  0;
//    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryTag() {
        return categoryTag;
    }

    public void setCategoryTag(String categoryTag) {
        this.categoryTag = categoryTag;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", categoryTag=" + categoryTag + ", price=" + price + ", category=" + category + '}';
    }

   

   

    
    
    
}
