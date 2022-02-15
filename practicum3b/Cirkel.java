package practicum3b;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y){
        this.radius = rad;
        this.xPositie = x;
        this.yPositie = y;

        if(rad > 0){
//            System.out.println("Cirkel (" + x + ", " + y + ") met radius: " + rad);
        } else{
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
    }

    public String toString(){

        return "cirkel (" + xPositie + ", " + yPositie + ") met radius: " + radius;
    }
}
