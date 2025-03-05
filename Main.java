public class Main {
    public static void main(String[] args) {
        Shape s1 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        Shape s2 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        Shape s3 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);

        Shape s4 = ShapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE);
        Shape s5 = ShapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE);
        Shape s6 = ShapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE); 

        Shape s7 = ShapeFactory.getShape(ShapeFactory.TYPE_SQUARE); 
        Shape s8 = ShapeFactory.getShape(ShapeFactory.TYPE_SQUARE); 
        Shape s9 = ShapeFactory.getShape(ShapeFactory.TYPE_SQUARE); 

        s1.draw();
        s2.draw();
        s3.draw();
        s4.draw();
        s5.draw();
        s6.draw();
        s7.draw();
        s8.draw();
        
    }
}

