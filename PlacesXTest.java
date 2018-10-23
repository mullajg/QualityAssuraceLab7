import static org.junit.Assert.*;

import org.junit.Test;

public class PlacesXTest {

	@Test
	public void test() {
		TicTacToe game = new TicTacToe();
		game.MakeMove(game.board, 8);
		char xAt = game.board[8];
		assertEquals('x', xAt);
	}

}
