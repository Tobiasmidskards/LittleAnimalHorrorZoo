public class Game{

   int iterations;
   boolean gameover;
   
   Snake snake1 = new Snake();
   Rabbit rabbit1 = new Rabbit();
   
   public Game(){
   
   }
   
   public void iterate() {
      while (gameover == false){
         iterations++;
        
         
         if (collisionDetection()) {
            gameover = true;
         }      
         
         rabbit1.movement();
         snake1.movement();
      }
      
      gameOver();
     
   }
   
   public boolean collisionDetection() {
      if ((snake1.getPositionX() == rabbit1.getPositionX()) 
               && (snake1.getPositionY() == rabbit1.getPositionY())){
         return true;
      }
       
      else {
         return false;
      }
   
   }

   public void gameOver(){
      rabbit1.tellEndgame();
      snake1.tellEndgame();
   }

}