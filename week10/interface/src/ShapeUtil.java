import java.util.List;

public class ShapeUtil {
    /**
     * .
     */
    public String printInfo(List<GeometricObject> shapes) {
        String rs = "Circle:";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                rs += "\n" + shapes.get(i).getInfo();
            }
        }
        rs += "\nTriangle:";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                rs += "\n" + shapes.get(i).getInfo();
            }
        }
        return rs;
    }
}
