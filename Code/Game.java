public class Game {

    int iterations;
    boolean gameOver;
    Snake snake = new Snake();
    Rabbit rabbit = new Rabbit();

    public boolean collisionDetection() {
      if (snake.getX() == rabbit.getX() && snake.getY() == rabbit.getY()) {
        return true;
      }
      return false;
    }

    public void move() {
      rabbit.moveRabbit(randomInt(),randomInt());
      snake.moveSnake(randomInt(),randomInt());
      if (collisionDetection()) {
        gameOver = true;
      }
    }

    public void iterate() {
      while (!gameOver) {
        move();
      }
      gameOver();
    }

    public void gameOver() {
        rabbit.tellEndGame();
        snake.tellEndGame();
    }

    public int randomInt(){
      int ran = (int) (Math.random() * 10);
      return ran;
    }
}
