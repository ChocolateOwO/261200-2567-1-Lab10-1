public class ShapeFactory {
    public static final int TYPE_CIRCLE = 3;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE = 2;
    private static final int MAX_CIRCLE = 2;
    private static final int MAX_RECTANGLE = 2;
    private static final int MAX_SQUARE = 2;
    private static final int MAX_TOTAL_SHAPES = 5;
    private static int countCircle = 0;
    private static int countRectangle = 0;
    private static int countSquare = 0;
    private static int totalShapes = 0;

    public static Shape getShape(int type) {
        if (totalShapes >= MAX_TOTAL_SHAPES) {
            return null;
        }

        switch (type) {
            case TYPE_CIRCLE:
                if (countCircle < MAX_CIRCLE) {
                    countCircle++;
                    totalShapes++;
                    return new Circle();
                }
                return null;

            case TYPE_RECTANGLE:
                if (countRectangle < MAX_RECTANGLE) {
                    countRectangle++;
                    totalShapes++;
                    return new Rectangle();
                }
                return null;

            case TYPE_SQUARE:
                if (countSquare < MAX_SQUARE) {
                    countSquare++;
                    totalShapes++;
                    return new Square();
                }
                return null;

            default:
                return null;
        }
    }
}

