import static org.junit.Assert.*;

import org.junit.Test;

public class PlacesOTest {

	@Test
	public void test() {
		TicTacToe game = new TicTacToe();
		game.ChangePlayer();
		game.MakeMove(game.board, 8);
		char oAt = game.board[8];
		assertEquals('o', oAt);
	}

}
