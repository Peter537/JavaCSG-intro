import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class BrickX {

    private final JavaCSG csg;
    private final int length;
    private final int height;
    private final int width;

    public BrickX(JavaCSG csg, int length, int width, int height) {
        this.csg = csg;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Geometry3D generate() {
        Geometry3D cube1 = csg.box3D(length, width, height, true);
        Geometry3D cube2 = csg.box3D(width, length, height, true);
        return csg.union3D(cube1, cube2);
    }
}