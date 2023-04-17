import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final JavaCSG csg;
    private final int boxSize;
    private final int borderSize;
    private final int heightBox;
    private final int heightBorder;

    public Board(JavaCSG csg, int boxSize, int borderSize, int heightBox, int heightBorder) {
        this.csg = csg;
        this.boxSize = boxSize;
        this.borderSize = borderSize;
        this.heightBox = heightBox;
        this.heightBorder = heightBorder;
    }

    private Geometry3D generateBottom() {
        Geometry3D bottomBox = csg.box3D(boxSize, boxSize, heightBox, false);
        return csg.translate3D(boxSize / 2.0, boxSize / 2.0, 0).transform(bottomBox);
    }

    private List<Geometry3D> generateBorders() {
        List<Geometry3D> borders = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Geometry3D boxX = csg.box3D(boxSize, borderSize, heightBorder, false);
            int added = boxSize / 3 * i;
            if (i == 3) {
                added -= borderSize;
            }
            borders.add(csg.translate3D(boxSize / 2.0, added + borderSize / 2.0, 0).transform(boxX));
        }

        for (int i = 0; i < 4; i++) {
            Geometry3D boxY = csg.box3D(borderSize, boxSize, heightBorder, false);
            int added = boxSize / 3 * i;
            if (i == 3) {
                added -= borderSize;
            }
            borders.add(csg.translate3D(added + borderSize / 2.0, boxSize / 2.0, 0).transform(boxY));
        }

        return borders;
    }

    public Geometry3D generate() {
        List<Geometry3D> items = new ArrayList<>();
        items.add(generateBottom());
        items.addAll(generateBorders());
        return csg.union3D(items);
    }
}