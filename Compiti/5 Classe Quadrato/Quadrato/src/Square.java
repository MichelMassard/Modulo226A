public class Square {
    int side;
    public Square(int side) {
        if (side > 0) {
            this.side = side;
        }
    }
    public Square(){
        this.side = 0;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

}
