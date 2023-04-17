import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class Test {

    public static void main(String[] args) {
        JavaCSG csg = JavaCSGFactory.createDefault();
        Geometry3D cyl = csg.cylinder3D(100, 10, 360, true);
        Geometry3D cube = csg.box3D(10, 20, 40, true);
        var shape2 = csg.union3D(cyl, cube);
        csg.view(shape2);
    }
}