
import processing.core.PApplet;

public class fourBallsProcedu extends PApplet {
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 800;
    public static final int RADIUS = 25;
    int x = 0;


    public static void main(String[] args) {
        PApplet.main("fourBallsProcedu", args);

    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle(1);
        drawCircle(2);
        drawCircle(3);
        drawCircle(4);
        increaseXPostion();
    }

    private void increaseXPostion() {
        x++;
    }

    private void drawCircle(int multiplier) {
        ellipse(x * multiplier, HEIGHT / 5 * multiplier, RADIUS, RADIUS);
    }

}


