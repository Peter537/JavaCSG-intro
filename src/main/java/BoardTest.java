import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class BoardTest {

    public static void main(String[] args) {
        JavaCSG csg = JavaCSGFactory.createDefault();
        Board board = new Board(csg, 120, 3, 6, 10);
        var shape = board.generate();
        csg.view(shape);
    }
}