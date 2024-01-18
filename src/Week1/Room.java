package Week1;

public class Room {
    float width;
    float length;
    public Room(float w,float l)
    {
        width =w;
        length = l;
    }

    public void computeDisplay()
    {
        float sqft = width*length;
        float sqyd = sqft/9;
        float amt = sqyd*10.5f;
        System.out.println("carpeting price ="+amt);
    }//end of compute Display

    public static void main(String[] args) {
        Room r1= new Room(2,4);
        r1.computeDisplay();
    }
}
