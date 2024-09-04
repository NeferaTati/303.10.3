public abstract class Shape {
    protected String color;
    protected double height;
    protected double width;
    protected double base;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

// The getArea method is abstract.
    // It must be overridden in a subclass.
    /** All shapes must provide a method called getArea() */
    public abstract double getArea();
    /** Returns a self-descriptive string */

    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayshapName()
    {
        System.out.println("I am a Shape.");
    }

    public class Circle extends Shape {
        protected double radius;
        private final double PI = Math.PI;

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, double height) {
            this.radius = radius;
            super.height = height;
        }
        public double getArea() {
            //double area = PI * this.radius * this.radius;
            double area = PI * Math.pow(this.radius, 2); // initializing value in parent class variable
            return area; //reference to  parent class variable
        }
        @Override
        public void displayshapName() {
            System.out.println("Drawing a Circle of radius " + this.radius);
        }
        /** Returns a self-descriptive string */
        @Override
        public String toString() {
            return "Circle[ radius = " + radius + super.toString() + "]";
        }


    }


}



