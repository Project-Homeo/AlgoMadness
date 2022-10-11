import java.util.*;

class Customer
{    
    public String customerId;
    public String name;
    public String phone;
 
    public Customer(String customerId, String name, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
    }
    
    public String getCustomerId() {
        return customerId;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPhone() {
        return phone;
    }
}

public class MyClass {
    public static void main(String args[]) {
      Customer c1 = new Customer("1000000", "John Smith", "0413 234 124");
      Customer c2 = new Customer("1000001", "Mary Janes", "0415 243 242");
      Customer c3 = new Customer("1000002", "Mark Weierstrass", "0238 322 443");
      
      List<Customer> mList = new ArrayList<>();
      mList.add(c1);
      mList.add(c2);
      mList.add(c3);
      
      for(int i=0; i<3; i++){
          System.out.println("Id: " + mList.get(i).getCustomerId() + " " + "Name: " + mList.get(i).getName() + " " + "Phone: " + mList.get(i).getPhone());
      }
    }
}