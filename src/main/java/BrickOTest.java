import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class BrickOTest {
    public static void main(String[] args) {
        JavaCSG csg = JavaCSGFactory.createDefault();
        BrickO circle = new BrickO(csg, 100, 20, 360);
        csg.view(circle.generatedCircle());
    }
}
