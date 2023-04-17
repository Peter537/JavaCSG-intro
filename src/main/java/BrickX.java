import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class BrickX {

    JavaCSG csg = JavaCSGFactory.createDefault();

    int length;
    int height;
    int width;


    public BrickX(JavaCSG csg,int length, int height, int width) {

        this.csg = csg;
        this.length = length;
        this.height = height;
        this.width = width;
    }


    public Geometry3D generateBrickX()
    {
        Geometry3D cube1 = csg.box3D(30, 5, 6, true);
        var rotatecube2 = csg.rotate3DX(csg.degrees(50));
        Geometry3D cube2 = csg.box3D(5, 30, 6, true);
        var shapeBrick = csg.union3D(cube1, cube2);

        return shapeBrick;

    }



}