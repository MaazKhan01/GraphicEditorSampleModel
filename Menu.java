
class Menu{
    String name;
    String isOpen;
    
    public void open(){
        System.out.println("open from class Menu");
    }
    public void select(){
        System.out.println("select from class Menu");
    }
    public void move(){
        System.out.println("move method from class menu");
    }
    public void rotate(){
        System.out.println("rotate method from class menu");
    }
    public static void main (String[] args) {
        //Object for Class Line
       Line ln = new Line();
       ln.draw();
       //Object for Circle class
       Circle crcl = new Circle();
       crcl.draw();
        //class group
        Group grp = new Group();
       grp.draw();
       grp.select();
        grp.remove();
       grp.group();
       grp.add();
       grp.show();
       grp.move();
       grp.rotate();
       //Object for Triangle class
       Triangle tri = new Triangle();
       tri.draw();
        
       Menu menu = new Menu();
       menu.open();
       menu.select();
       menu.move();
       menu.rotate();
   }
}
