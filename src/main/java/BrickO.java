import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;

public class BrickO {

    private final JavaCSG csg;
    private final int diameter;
    private final int height;
    private final int angularResolution;

    public BrickO(JavaCSG csg, int diameter, int height, int angularResolution) {
        this.csg = csg;
        this.diameter = diameter;
        this.height = height;
        this.angularResolution = angularResolution;
    }

    public Geometry3D generatedCircle() {
        Geometry3D circle = csg.cylinder3D(diameter, height, angularResolution, true);
        Geometry3D centerHole = csg.cylinder3D(diameter / 2.0, height + 50, angularResolution, true);
        return csg.difference3D(circle, centerHole);
    }
}