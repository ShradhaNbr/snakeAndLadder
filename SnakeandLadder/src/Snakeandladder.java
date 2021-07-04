public class Snakeandladder {
	public static void main(String[] args) {
		int player_position = 0;
		final int WINNING_POSITION = 100;
		int die_count = 0;
		while (player_position < WINNING_POSITION) {
			int die_roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			System.out.println("You got" + die_roll);
			int option1 = (int) (Math.floor(Math.random() * 10) % 3);
			switch (option1) {
			case 0: {
				System.out.println("Ladder");
				if ((player_position + die_roll) > 100) {
					player_position = player_position;
					die_count++;
				} else
					player_position = player_position + die_roll;
				die_count++;
				break;
			}
			case 1: {
				System.out.println("Snake");
				player_position = player_position - die_roll;
				die_count++;
				break;
			}
			default:
				System.out.println("You got no play");
				die_count++;
				if (player_position < 0)
					player_position = 0;
				System.out.println("Player is at number" + player_position);
			}

		}
		System.out.println(die_count + "times die was rolled");
	}
}
