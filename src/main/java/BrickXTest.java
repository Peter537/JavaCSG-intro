import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class BrickXTest {

    public static void main(String[] args) {
        JavaCSG csg = JavaCSGFactory.createDefault();
        BrickX brickx = new BrickX(csg, 30, 5, 6);
        csg.view(brickx.generate());
    }
}