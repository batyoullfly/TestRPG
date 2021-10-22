public class Player {
    int xLocation;
    int yLocation;
    int[] location;
    public Player(int[] location) {
        this.location = location;
        this.xLocation = location[0];
        this.yLocation = location[1];
    }
    public int[] getLocation() {
        return location;
    }
    public int getXLocation() {
        return xLocation;
    }
    public int getYLocation() {
        return yLocation;
    }
}
