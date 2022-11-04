import java.util.ArrayList;

public class Board {

    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    public Board() {
    }

    /**
     * .
     */
    public boolean validate(int x, int y) {
        if ((x <= 8 && x >= 1) && (y <= 8 && y >= 1)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * .
     */
    public void addPiece(Piece piece) {
        // nếu quân cờ này thoả mãn tọa độ hợp lệ và không bị
        // trùng với các con cờ có trong danh sách.
        boolean flag = false;
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).checkPosition(piece)) {
                flag = true;
                break;
            }
        }
        if (!validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            flag = true;
        }
        if (!flag) {
            pieces.add(piece);
        }
    }

    /**
     * .
     */
    public void removeAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
                pieces.remove(i);
            }
        }
    }

    /**
     * .
     */
    public Piece getAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
                return pieces.get(i);
            }
        }
        return null;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
