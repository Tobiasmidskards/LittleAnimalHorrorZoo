public class Randomint{

   public static int random(){
      // laver en random INT fra 0-9.
      // bruger Math biblioteket som ligger installeret på computeren.
      
      int random = (int)(Math.random() * 10);
      return random;
   }


}