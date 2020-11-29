
//this is a main method class
class Menu{
    public static void main (String[] args) {
        
        //Object for Class Line
       Line ln = new Line();
       ln.draw();
       //Object for Circle class
       Circle crcl = new Circle();
       crcl.draw();
       //Object for Triangle class
       Triangle tri = new Triangle();
       tri.draw();
       //Object for Shapes and view class in class "Group" is combined, so here we grouped this two class and instansiated it, 
       //display screen is constant and in a graphic aditor, there are varity of diffrent shapes we can make, Here we are just taking three(line, circle, triangle) Examples;

       Group grp = new Group();
       grp.draw();
       grp.select();
       grp.move();
       grp.rotate();
       grp.remove();
       grp.group();
       grp.add();
       grp.show();
       // Shapes shape = new Shapes();
       // shape.select();
       // shape.move();
       // shape.rotate();
   }
}