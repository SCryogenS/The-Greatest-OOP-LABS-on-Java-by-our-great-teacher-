class Figure{
    protected String name;

    public Figure(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

class Square extends Figure{
    protected int a;

    public Square(String name, int a){
        super(name);
        this.a = a;
    }

    public void Perimeter(){
        int p = 4*a;
        System.out.println("Периметр " + super.getName() + ": " + p);
    }

    public void square(){
        int s = a*a;
        System.out.println("Площадь " + super.getName() + ": " + s + "\n");
    }
}

class Rectangle extends Figure{
    protected int a;
    protected int b;

    public Rectangle(String name, int a, int b){
        super(name);
        this.a = a;
        this.b = b;
    }

    public void Perimeter(){
        int p = 2*(a+b);
        System.out.println("Периметр " + super.getName() + ": " + p);
    }

    public void square(){
        int s = a*b;
        System.out.println("Площадь " + super.getName() + ": " + s + "\n");
    }
}

class RightTriangle extends Figure{ // Прямоугольный
    protected int a;
    protected int b;

    public RightTriangle(String name, int a, int b){
        super(name);
        this.a = a;
        this.b = b;
    }

    public void Perimeter(){
        double c = Math.pow((a*a + b*b),0.5);
        double p = a+b+c;
        System.out.println("Периметр " + super.getName() + ": " + p);
    }

    public void square(){
        double s = a*b*0.5;
        System.out.println("Площадь " + super.getName() + ": " + s + "\n");
    }
}

class IsoscelesTriangle extends Figure{ // Равнобедренный
    protected int a;
    protected int b;
    protected int h;

    public IsoscelesTriangle(String name, int a, int b, int h){
        super(name);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void Perimeter(){
        int p = 2*a+b;
        System.out.println("Периметр " + super.getName() + ": " + p);
    }

    public void square(){
        double s = a*h*0.5;
        System.out.println("Площадь " + super.getName() + ": " + s + "\n");
    }
}

class Circle extends Figure{ 
    protected int r;

    public Circle(String name, int r){
        super(name);
        this.r = r;
    }

    public void Perimeter(){
        double p = 2 * 3.14 * r;
        System.out.println("Периметр " + super.getName() + ": " + p);
    }

    public void square(){
        double s = (r*r) * 3.14;
        System.out.println("Площадь " + super.getName(  ) + ": " + s + "\n");
    }
}

public class SquareAndPerimeter{
    public static void main(String[] args){
        
        Square square = new Square("Квадрат", 5);
        Circle circle = new Circle("Круг", 12);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle("Равнобедренный треугольник", 14, 1488, 56);
        RightTriangle rightTriangle = new RightTriangle("Прямоугольный треугольник", 14, 67);
        Rectangle rectangle = new Rectangle("Треугольник", 44, 32);

        square.Perimeter();
        square.square();

        circle.Perimeter();
        circle.square();

        isoscelesTriangle.Perimeter();
        isoscelesTriangle.square();

        rightTriangle.Perimeter();
        rightTriangle.square();

        rectangle.Perimeter();
        rectangle.square();
    }
}
