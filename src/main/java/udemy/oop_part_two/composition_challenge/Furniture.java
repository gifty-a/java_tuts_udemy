package udemy.oop_part_two.composition_challenge;

public class Furniture {
    private Bed bed;
    private Sofa sofa;
    private Wardrobe wardrobe;

    public Furniture(Bed bed, Sofa sofa, Wardrobe wardrobe) {
        this.bed = bed;
        this.sofa = sofa;
        this.wardrobe = wardrobe;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Bed getBed() {
        return bed;
    }
//
//    public void furnishRoom(){
//        System.out.println(bed);
//        System.out.println(sofa);
//        System.out.println(wardrobe);
//    }
//    public Bed getBed() {
//        return bed;
//    }
//
//    public Sofa getSofa() {
//        return sofa;
//    }
//
//    public Wardrobe getWardrobe() {
//        return wardrobe;
//    }
}
