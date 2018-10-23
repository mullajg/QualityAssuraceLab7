import static org.junit.Assert.*;

import org.junit.Test;

public class IsEmptyTest {

	@Test
	public void test() {
		TicTacToe game = new TicTacToe();
		game.board[0] = 'x';
		game.board[1] = ' ';
		boolean isEmpty0 = !(game.spaceInUse(0, game.board));
		boolean isEmpty1 = !(game.spaceInUse(1, game.board));
		assertEquals(false, isEmpty0);
		assertEquals(true, isEmpty1);
	}

}
