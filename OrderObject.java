// has takes a certain input and outputs an object of a certain length
// name 
// quantity numbers
// string for ID  call the method call MessageDigest.getInstance(); < put in constructor
// current time using java.
// getters for each
import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 

public class OrderObject   {
   String name = "";
   int ticketQuantity = 0;
   String orderID = "";
      
   public OrderObject(String n, int tq)  {
      name = n;
      ticketQuantity = tq;
      String hashString = n + tq;      
      orderID+= hashString.hashCode();
      System.out.println(orderID);
   }
   
   public String getName()  {
      return name;
   }
   
   public int getQuanitiy() {
      return ticketQuantity;
   }


}
