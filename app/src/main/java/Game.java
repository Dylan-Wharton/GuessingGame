import java.util.Random;

public class Game {
        int correctNum, guessedNum;

        public Game() {
            Random random = new Random();
            this.correctNum = random.nextInt(10);
        }
        public boolean check(int correctNum){
            return guessedNum==this.correctNum;
        }
}
