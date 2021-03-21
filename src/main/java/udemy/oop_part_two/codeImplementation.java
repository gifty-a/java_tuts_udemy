package udemy.oop_part_two;

import udemy.oop_part_two.composition_challenge_three.*;
import udemy.oop_part_two.encapsulation.challenge_one.Printer;
import udemy.oop_part_two.polymorphism.Ford;
import udemy.oop_part_two.polymorphism.Holden;
import udemy.oop_part_two.polymorphism.Mitsubishi;

public class codeImplementation {
    public static void main(String[] args) {
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlader");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
//        Printer printer = new Printer(50, true);
//        System.out.println("Initial page count = " + printer.getNumberOfPagesPrinted());
//        int numPagesPrinted = printer.printPage(19);

//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//
//        Ceiling ceiling = new Ceiling(12, "Peach");
//        Bed bed = new Bed("modern", 9, 2, 2,1);
//        Lamp lamp = new Lamp("classic", false, 75);
//
//        Bedroom bedroom = new Bedroom("Judy", wall1, wall2, wall3, wall4,ceiling,bed,lamp);
//        bedroom.makeBed();
//        bedroom.getLamp().turnOn();

//        Bed bed = new Bed(Size.QUEEN, "Metal","Memory Foma mattress",3, true, true);
//        Sofa sofa = new Sofa("plush",3);
//        Wardrobe wardrobe = new Wardrobe("wood", 6, true);
//        Furniture furniture = new Furniture(bed,sofa, wardrobe);
//        Room availRoom = new Room(new RoomDimensions(3,3,Unit.cm),false,furniture, new Wall("blue",false));
//        availRoom.getRoomDescription();
//        Case case1 = new Case("32p", "HP", "234", new Dimensions(23, 78, 78));
//        Monitor monitor = new Monitor("27inch Beast", "samsung", 24, new Resolution(2540, 1440));
//        Motherboard motherboard = new Motherboard("25-333", "Asus", 4, 6, "v3.45");
//        Computer surfacePro = new Computer(case1, motherboard, monitor);
//        surfacePro.powerUp();
//        surfacePro.getMonitor().drawPixelArt(2,2,"pink");
//        surfacePro.getMotherboard().loadProgram("windows 10");
//        surfacePro.getPcCase().pressPowerBtn();
    }
}
