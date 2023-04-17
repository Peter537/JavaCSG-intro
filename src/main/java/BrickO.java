import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;

public class BrickO {

    private final JavaCSG csg;
    private final int diameter;

    private final int height;
    private final int angularREsolution;


    public BrickO(JavaCSG csg, int diameter, int height, int angularREsolution) {
        this.csg = csg;
        this.diameter = diameter;
        this.height = height;
        this.angularREsolution = angularREsolution;
    }

    public Geometry3D generatedCircle() {
        Geometry3D circle = csg.cylinder3D(diameter, height, angularREsolution, true);

        Geometry3D centerHole = csg.cylinder3D(diameter / 2, height + 50, angularREsolution, true);

        return csg.difference3D(circle, centerHole);
    }
}