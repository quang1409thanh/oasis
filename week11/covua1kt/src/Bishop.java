public class Bishop extends Piece {


    public Bishop(int x, int y) {
        super(x, y);
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        // nếu di chuyển đúng thì bắt đầu kiểm tra
        // nếu trên đường đi từ vị trí của Rook đến trước vị trí cần đến, nếu không có
        // quân cờ nào thì băt đầu kiểm tra
        // nếu ở vị trí x, y có con cờ màu đen thì trả về
        // đúng( đồng thời xóa đi con cờ màu đen đó), hoặc không có con cờ nào thì trả về đúng
        // kiểm tra theo hàng ngang
        if ((Math.abs(this.getCoordinatesY() - y) == Math.abs(this.getCoordinatesX() - x))
                && ((Math.abs(this.getCoordinatesX() - x) > 0)
                && (Math.abs(this.getCoordinatesX() - x) < 8))
                && board.validate(x, y)) {
            boolean flag = false;
            if (this.getCoordinatesX() < x && this.getCoordinatesY() < y) {
                for (int i = 1; i < x - this.getCoordinatesX(); i++) {
                    if (board.getAt(this.getCoordinatesX() + i,
                            this.getCoordinatesY() + i) != null) {
                        flag = true;
                        break;
                    }
                }
            } else if (this.getCoordinatesX() < x && this.getCoordinatesY() > y) {
                for (int i = 1; i < x - this.getCoordinatesX(); i++) {
                    if (board.getAt(this.getCoordinatesX() + i,
                            this.getCoordinatesY() - i) != null) {
                        flag = true;
                        break;
                    }
                }
            } else if (this.getCoordinatesX() > x && this.getCoordinatesY() < y) {
                for (int i = 1; i < this.getCoordinatesX() - x; i++) {
                    if (board.getAt(this.getCoordinatesX() - i,
                            this.getCoordinatesY() + i) != null) {
                        flag = true;
                        break;
                    }
                }
            } else {
                for (int i = 1; i < this.getCoordinatesX() - x; i++) {
                    if (board.getAt(this.getCoordinatesX() - i,
                            this.getCoordinatesY() - i) != null) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag == false) {
                if (board.getAt(x, y) == null) {
                    return true;
                } else {
                    if (!board.getAt(x, y).getColor().equals(this.getColor())) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }

}