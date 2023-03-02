public class RectangularPrismTester {
    public static void main(String[] args){
        RectangularPrism rectangularPrism = new RectangularPrism();
        rectangularPrism.setHeight(10);
        rectangularPrism.setWidth(12);
        rectangularPrism.setLength(8);
        double surfaceArea = rectangularPrism.surfaceArea();
        double prismVolume = rectangularPrism.volume();
        System.out.println("Rectangular Prism");
        System.out.println("Width: " + rectangularPrism.getWidth());
        System.out.println("Height: " + rectangularPrism.getHeight());
        System.out.println("Length: " + rectangularPrism.getLength());
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + prismVolume);
    }
}