package udemy.oop_part_two.composition_challenge;

public class Wall {
    private String wallcolor;
    private boolean hasWallPanels;

    public Wall(String wallcolor, boolean hasWallPanels) {
        this.wallcolor = wallcolor;
        this.hasWallPanels = hasWallPanels;
    }

    public String getWallcolor() {
        return wallcolor;
    }
    public boolean getHasWallPanels(){
        return hasWallPanels;
    }
}
