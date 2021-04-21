package encapsulationExersise.shoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private  double money;
    private List<Product> products;

    public Person(String name, double money) {
       this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if(money<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product){
        if((this.money - product.getCost())<0){
            throw new IllegalArgumentException(String.format("%s can't afford %s",getName(),product.getName()));
        } else{
            setMoney(this.money- product.getCost());
            products.add(product);

        }

    }


}
