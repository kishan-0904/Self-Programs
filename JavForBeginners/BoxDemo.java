class Box{
    double width, height, depth;
    Box() {
        width = 10;
        height = 5;
        depth = 10;
    }

    double volume() {
        double vol = width * height * depth;
        return vol;
    }
}

public class BoxDemo {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol = mybox1.volume();
        System.out.println("Volume of Box1 = " + vol);
        vol = mybox2.volume();
        System.out.println(vol);
    }
}
