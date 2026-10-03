class Vector {
    protected int x;
    protected int y;
    protected int z;

    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX(){return x;}
    public int getY(){return y;}
    public int getZ(){return z;}

    public int ScalarMultiply(Vector v){
        return (this.x * v.getX() + this.y * v.getY() + this.z * v.getZ());
    }

    public void VectorMultipliedByNum(int num){
        this.x *= num;
        this.y *= num;
        this.z *= num;
    }

    public Vector VectorMultiplied(Vector v){
        
        int c_x = (this.y * v.getZ() - this.z * v.getY());
        int c_y = (this.z * v.getX() - this.x * v.getZ());
        int c_z = (this.x * v.getY() - this.y * v.getX());
        
        Vector c = new Vector(c_x, c_y, c_z);

        return c;
    }

    public void GetVector(){
        System.out.println("(" + this.x + " , " + this.y + " , " + this.z + ")");
    }
}

public class Vector3d{
    public static void main(String[] args){
        Vector a = new Vector(5,6,7);
        Vector b = new Vector(8,9,10);

        int alpha = 10;

        int SchalarResult = a.ScalarMultiply(b);
        
        a.VectorMultipliedByNum(alpha);
        b.VectorMultipliedByNum(alpha);

        Vector c = a.VectorMultiplied(b);

        System.out.println("Результат сколярного умножения векторов а = (5,6,7) и b = (8,9,10): " + SchalarResult + "\n");
        
        System.out.println("Результат умножения векторов а = (5,6,7) и b = (8,9,10) на число альфа = 10: ");
        a.GetVector();
        b.GetVector();
        System.out.println();
        
        System.out.println("Результат векторного умножения векторов а = (5,6,7) и b = (8,9,10): ");
        c.GetVector();
    }
}



