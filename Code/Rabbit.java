public class Rabbit{
  private int positionX, positionY;
  private String message;

  public Rabbit(){
    positionX = 9;
    positionY = 9;
    message = "I am the nice rabbit, I'm now standing on the square\t";
  }

  public void tell() {
    System.out.println(message + positionX + ", " + positionY);
  }

  public void tellEndGame(){
    System.out.println("Noooo Please don't eat me!!");
  }

  public void move(int x, int y) {
    this.positionX = x;
    this.positionY = y;
    tell();
  }

  public int getX(){
    return positionX;
  }

  public int getY(){
    return positionY;
  }
}
