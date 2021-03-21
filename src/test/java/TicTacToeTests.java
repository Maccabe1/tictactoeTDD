import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TicTacToeTests {

    private TicTacToe game;

    @BeforeEach
    void setUp() {
        game = new TicTacToe();
    }

    @AfterEach
    void tearDown() {
        game = null;
    }

    @Test
    void gameBoardStartsWithNumbersOnly() {
        Object[] theBoard = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Object[] board = game.ticTacToeBoard(0);

        assertArrayEquals(theBoard, board);
    }

    @Test
    void firstPlayer_CanAddFirstMoveToBoard() {
        Object[] theBoard = { "X", 2, 3, 4, 5, 6, 7, 8, 9 };

        Object[] board  = game.ticTacToeBoard(1);

        assertArrayEquals(theBoard, board);
    }

    @Test
    void secondPlayer_CanAddFirstMoveToBoard() {
        Object[] theBoard = { "X", "O", 3, 4, 5, 6, 7, 8, 9 };

        Object[] board =
                game.ticTacToeBoard(1);
                game.ticTacToeBoard(2);

        assertArrayEquals(theBoard, board);
    }

    @Test
    void firstPlayer_CanAddSecondMoveToBoard() {
        Object[] theBoard = { "X", "O", 3, "X", 5, 6, 7, 8, 9 };

        Object[] board =
                game.ticTacToeBoard(1);
                game.ticTacToeBoard(2);
                game.ticTacToeBoard(4);

        assertArrayEquals(theBoard, board);
    }
}
