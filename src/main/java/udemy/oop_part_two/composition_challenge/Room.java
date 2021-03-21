package udemy.oop_part_two.composition_challenge;

public class Room {
    private RoomDimensions roomDimensions;
    private boolean hasInbuiltWashroom;
    private Furniture furniture;
    private Wall wall;

    public Room(RoomDimensions roomDimensions, boolean hasInbuiltWashroom, Furniture furniture, Wall wall) {
        this.roomDimensions = roomDimensions;
        this.hasInbuiltWashroom = hasInbuiltWashroom;
        this.furniture = furniture;
        this.wall = wall;
    }

    public boolean isHasInbuiltWashroom() {
        return hasInbuiltWashroom;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void getRoomDescription(){
        System.out.println("Room Description");
        System.out.println("-------------------");
        System.out.println("Room Dimensions : " + roomDimensions.getRoomDims());
        System.out.println("has inbuilt washroom : " + hasInbuiltWashroom);
        System.out.println("Wall color : " + wall.getWallcolor());
        System.out.println(" has wall panels? " + wall.getHasWallPanels());
        displayFurnitureItems();
    }

    private void displayFurnitureItems(){
        System.out.println("Furniture in room");
        System.out.println(furniture.getBed());
        System.out.println(furniture.getSofa());
        System.out.println(furniture.getWardrobe());
    }

}
