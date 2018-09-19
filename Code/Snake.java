public class Snake{

   int positionX;
   int positionY;
   String message;
   
   public Snake(){
      positionX = 9;
      positionY = 9;
      message = "I'm the evil Snake, I'm now standing on the square \t";
      
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
      System.out.println("Ahhhrrrr im eating you ha ha!");
   }
}