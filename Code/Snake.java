public class Snake{
  private int positionX, positionY;
  private String message;

  public Snake(){
    positionX = 0;
    positionY = 0;
    message = "I am the evil snake, I'm now standing on the square\t";
  }

  public void tell() {
    System.out.println(message + positionX + ", " + positionY);
  }

  public void tellEndGame(){
    System.out.println("Ahhhr i'm eating you ha ha!");
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
