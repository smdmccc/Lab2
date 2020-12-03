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
