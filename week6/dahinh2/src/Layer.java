import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape temp) {
        shapes.add(temp);
    }

    /** Javadoc1. */
    public void removeCircles() {
        int i = 0;
        while (i < shapes.size()) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(shapes.get(i));
            }
            i++;
        }
    }

    /** Javadoc1. */
    public String getInfo() {
        String rs = "Layer of crazy shapes:\n";
        for (Shape i : shapes) {
            if ((i instanceof Circle) || (i instanceof Rectangle)) {
                rs += i.toString() + "\n";
            }
        }
        return rs;
    }

    /** Javadoc1. */
    public void removeDuplicates() {
        int i = 0;
        while (i < shapes.size() - 1) {
            if (shapes.get(i) instanceof Circle) {
                Circle a = (Circle) shapes.get(i);
                int j = i + 1;
                while (j < shapes.size()) {
                    if (shapes.get(j) instanceof Circle) {
                        Circle b = (Circle) shapes.get(j);
                        if (b.equals(a) && b.center.equals(a.center)) {
                            shapes.remove(j);
                        } else {
                            j++;
                        }
                    } else {
                        j++;
                    }
                }
            } else if (shapes.get(i) instanceof Rectangle) {
                Rectangle a = (Rectangle) shapes.get(i);
                int j = i + 1;
                while (j < shapes.size()) {
                    if (shapes.get(j) instanceof Rectangle) {
                        Rectangle b = (Rectangle) shapes.get(j);
                        if (b.equals(a)) {
                            shapes.remove(j);
                        } else {
                            j++;
                        }
                    } else {
                        j++;
                    }
                }
            }
            i++;
        }
    }
}
