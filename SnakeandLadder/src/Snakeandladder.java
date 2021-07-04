public class Snakeandladder {
	public static void main(String[] args) {
		int player1_position = 0;
		int player2_position=0;
		final int WINNING_POSITION = 100;
		int die_count = 0;
		while (player1_position < WINNING_POSITION && player2_position < WINNING_POSITION) {
		// code for player1
			int die_roll1 = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			
			System.out.println("Player1 got " + die_roll1);
			int option1 = (int) (Math.floor(Math.random() * 10) % 3);
			switch (option1) {
			case 0: {
				System.out.println("Player1 climbed ladder");
				if ((player1_position + die_roll1) > 100) {
					player1_position = player1_position;
					die_count++;
				} else
					player1_position = player1_position + die_roll1;
				die_count++;
				break;
			}
			case 1: {
				System.out.println("Player1 is bit by snake");
				player1_position = player1_position - die_roll1;
				die_count++;
				break;
			}
			default:
				System.out.println("Player1 got no play");
				die_count++;
			}
			
			if (player1_position < 0) {
				player1_position = 0;
			
			}
			System.out.println("Player1 is at number " + player1_position);
			//code for player2
			int die_roll2 = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			
			System.out.println("player2 got " + die_roll2);
			
			int option2 = (int) (Math.floor(Math.random() * 10) % 3);
			switch (option2) {
			case 0: {
				System.out.println("Player2 climbed ladder");
				if ((player2_position + die_roll2) > 100) {
					player2_position = player2_position;
					die_count++;
				} else
					player2_position = player2_position + die_roll2;
				die_count++;
				break;
			}
			case 1: {
				System.out.println("Player2 is bit by snake");
				player2_position = player2_position - die_roll2;
				die_count++;
				break;
			}
			default:
				System.out.println("player2 got no play");
				die_count++;
				
				
			}
			if (player2_position < 0) {
				player2_position = 0;
			}
			System.out.println("Player2 is at number " + player2_position);
		}
		System.out.println(die_count + "times die was rolled");
		if (player1_position == WINNING_POSITION)
			System.out.println("WINNER is PLAYER1");
		else
			System.out.println("WINNER is PLAYER2");
	}
}
