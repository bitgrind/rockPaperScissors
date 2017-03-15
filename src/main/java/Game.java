import java.util.Arrays;
import java.util.List;

public class Game {
  public String compare(String player1, String player2) {
    String winner = "";
    List<String> player1Array = Arrays.asList("rock", "paper", "scissors");
    List<String> player2Array = Arrays.asList("paper", "scissors", "rock");

    if (player1.equals(player2)){
      winner = "tie";
    } else if (player1Array.indexOf(player1) == player2Array.indexOf(player2)) {
      winner = "player2";
    } else {
      winner = "player1";
    }
    return winner;
  }
}
