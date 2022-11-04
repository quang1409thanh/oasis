public class Rook extends Piece {


    public Rook(int x, int y) {
        super(x, y);
    }

    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        // nếu di chuyển đúng hàng ngang hoặc hàng dọc thì bắt đầu kiểm tra
        // nếu trên đường đi từ vị trí của Rook đến trước vị trí cần đến, nếu không có
        // quân cờ nào thì băt đầu kiểm tra
        // nếu ở vị trí x, y có con cờ màu đen thì trả về
        // đúng( đồng thời xóa đi con cờ màu đen đó), hoặc không có con cờ nào thì trả về đúng
        // kiểm tra theo hàng ngang
        if ((this.getCoordinatesY() - y == 0)
                && board.validate(x, y)) {
            // bắt đầu kiểm tra trên hàng ngang đó con có nào không ?
            boolean flag = false;
            if (this.getCoordinatesX() < x) {
                for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                    if (board.getAt(i, y) != null) {
                        flag = true;
                        break;
                    }
                }
            } else {
                for (int i = x + 1; i < this.getCoordinatesX(); i++) {
                    if (board.getAt(i, y) != null) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag == false) {
                if (board.getAt(x, y) == null) {
                    return true;
                } else if (board.getAt(x, y).getColor() != this.getColor()) {
                    return true;
                }
            }
            return false;
        } else if ((this.getCoordinatesX() - x == 0)
                && board.validate(x, y)) {
            // bắt đầu kiểm tra trên cột đó có con cờ nào không ?
            boolean flag = false;
            if (this.getCoordinatesY() < y) {
                for (int i = this.getCoordinatesY() + 1; i < y; i++) {
                    if (board.getAt(x, i) != null) {
                        flag = true;
                        break;
                    }
                }
            } else {
                for (int i = y + 1; i < this.getCoordinatesY(); i++) {
                    if (board.getAt(x, i) != null) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag == false) {
                if (board.getAt(x, y) == null) {
                    return true;
                } else if (board.getAt(x, y).getColor() != this.getColor()) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

}