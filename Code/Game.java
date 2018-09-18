public class Game {

    int iterations;
    boolean gameOver;
    Snake snake = new Snake();
    Rabbit rabbit = new Rabbit();

    public void iterate() {
      while (!gameOver) {
        iterations++;
        updateGameLogic();
        if (collisionDetection()) {
          gameOver = true;
        }
      }
      gameOver();
    }

    public boolean collisionDetection() {
      if (snake.getX() == rabbit.getX() && snake.getY() == rabbit.getY()) {
        return true;
      }
      return false;
    }

    public void updateGameLogic() {
      rabbit.move(randomInt(),randomInt());
      snake.move(randomInt(),randomInt());
    }

    public void gameOver() {
        rabbit.tellEndGame();
        snake.tellEndGame();

        System.out.println("\nSimulated: " + iterations + " iterations.");
    }

    public int randomInt(){
      int ran = (int) (Math.random() * 10);
      return ran;
    }
}
