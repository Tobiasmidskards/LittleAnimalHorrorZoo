public class Rabbit {

   int positionX;
   int positionY;
   String message;

   public Rabbit(){
      positionX = 0;
      positionY = 0;
      message = "I'm the nice Rabbit, I'm now standing on the square \t";
      
   }
    public void movement(){
      positionX = Randomint.random();
      positionY = Randomint.random();
      System.out.println(message + positionX + ", " + positionY);
   }
   
   public int getPositionX(){
      return positionX;
   }  
   
   public int getPositionY(){
      return positionY;
   }
   
   public void tellEndgame(){
      System.out.println("Noooo, Please don't eat me");
   }
}
 
