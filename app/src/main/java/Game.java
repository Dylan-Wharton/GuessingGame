import java.util.Random;

public class Game {
        int guessNum;
        boolean guessedCorrect;

        public Game() {
            Random random = new Random();
            this.guessNum = random.nextInt(10);
        }
        public boolean check(int correctNum){
            return i==this.guessNum;
        }
}
