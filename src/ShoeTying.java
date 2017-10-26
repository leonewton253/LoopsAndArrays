
public class ShoeTying {
    public static void grabLace(String whichLace) {
        System.out.println("Grab "+whichLace+" lace");
    }
    
    public static void tieShoe() {
        System.out.println("Bend down");
        grabLace("left");
        grabLace("Right");
        System.out.println("tie laces");
    }
    
    public static void main(String[] args) {
        tieShoe();
        tieShoe();
        System.out.println(Math.pow(2, 24));
        
    }
}
