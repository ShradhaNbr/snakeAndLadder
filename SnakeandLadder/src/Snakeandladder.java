public class Snakeandladder {
	public static void main(String[] args) {
		int player_1 = 0;
		int die_roll = (int) (Math.floor(Math.random() * 10 ) % 6 + 1);
		System.out.println("You got " +  die_roll);
	}
}
