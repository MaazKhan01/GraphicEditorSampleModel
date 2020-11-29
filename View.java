abstract class View{
    int noOfObjects;
    int selected;
    public void add(){
              System.out.println("add method from View class");
    }
    public void remove(){
              System.out.println("Remove method from view class");
    }
    public void group(){
              System.out.println("Group method from view class");
    }
    public void show(){
              System.out.println("Show method from view class");
    }
    abstract public void select();
    abstract public void move();
    abstract public void rotate();
    
}