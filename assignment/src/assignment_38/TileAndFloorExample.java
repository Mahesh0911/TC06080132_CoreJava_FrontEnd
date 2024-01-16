package assignment_38;

public class TileAndFloorExample {
    public static void main(String[] args) {
        Tile tile = new Tile(2.5);  // Example tile with edge length 2.5 units
        Floor floor = new Floor(10, 8);  // Example floor with length 10 units and width 8 units

        int totalTilesNeeded = floor.totalTiles(tile);

        System.out.println("Total tiles needed to cover the floor completely: " + totalTilesNeeded);
    }
}