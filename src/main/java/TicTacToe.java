import java.util.Arrays;

public class TicTacToe {
    private int count = 0;
    private Object[] theBoard = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    public Object[] ticTacToeBoard(int playersChoice) {
            if (playersChoice == 0) {
                return theBoard;
            }

            if (count % 2 == 0) {
                theBoard[playersChoice - 1] = "X";
            } else {
                theBoard[playersChoice - 1] = "O";
            }

            System.out.println(Arrays.toString(theBoard));
            count++;
            return theBoard;
        }
    }

//    public static void getPlayersChoice() throws IOException {
//        BufferedReader reader =
//                new BufferedReader(new InputStreamReader(System.in));
//        String choice = reader.readLine();
//        int number = Integer.parseInt(choice);
//
//        ticTacToeBoard(number);
//    }
//
//    public static void main(String[] args) throws IOException {
//        getPlayersChoice();
//    }
//}

