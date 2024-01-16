package assignment_38;


class Floor {
    double length;
    double width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the whole number of tiles needed to cover the floor completely
    public int totalTiles(Tile tile) {
        double tileArea = tile.edgeLength * tile.edgeLength;
        double floorArea = length * width;
        return (int) Math.ceil(floorArea / tileArea);
    }
}

