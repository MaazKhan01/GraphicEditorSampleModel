abstract class Shapes extends View {
    String color;
    int vertices;
    abstract public void draw();

    public void select(){
        System.out.println("select method from Shape class");
    }
    public void move(){
        System.out.println("Move method from Shape class");
    }
    public void rotate(){
        System.out.println("Rotate method from Shape class");
    }
}