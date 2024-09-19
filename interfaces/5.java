interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public void resizeWidth(int w) {
        width = w;
        System.out.println("Width resized to: " + width);
    }

    public void resizeHeight(int h) {
        height = h;
        System.out.println("Height resized to: " + height);
    }

    public void displayDimensions() {
        System.out.println("Rectangle dimensions - Width: " + width + ", Height: " + height);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(10, 5);
        
    
        rectangle.displayDimensions();
     
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(10);
        
   
        rectangle.displayDimensions();
    }
}
