import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    public Game(Board board) {
        this.board = board;
    }

    /**
     * .
     */
    public void movePiece(Piece piece, int x, int y) {
        if (board.getAt(x, y) == null) {
            if (piece.canMove(board, x, y)) {
                moveHistory.add(new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y, piece));
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
            }
        } else {
            if (piece.canMove(board, x, y)) {
                moveHistory.add(new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y, piece, board.getAt(x, y)));
                board.removeAt(x, y);
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
            }
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

}
