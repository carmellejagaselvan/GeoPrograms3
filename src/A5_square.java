public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(0, 0, 0);
        plane.startingAngle(180);
        plane.setPos(200,475);
        house();
        plane.turn(-90);
        plane.setPos(350,475);
        house();
        plane.turn(-90);
        plane.setPos(500,475);
        house();
        plane.turn(-90);
        plane.setPos(650,475);
        house();
        plane.setPos(130,220);
        star();
        plane.setPos(275,300);
        star();
        plane.setPos(500,150);
        star();
        plane.setPos(675,275);
        star();
    }

    public void star(){
        plane.startingAngle(20);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(-48);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(-48);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(-48);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(-48);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
    }

    public void square() {
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(0, 0, 0);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
    }
    
    public void pentagon(){
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
    }

    public void window(){
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(25);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(25);
        plane.turn(90);
        plane.move(25);
        plane.turn(90);
        plane.move(50);
    }

    public void triangle(){
        plane.move(100);
        plane.turn(-120);
        plane.move(100);
        plane.turn(-120);
        plane.move(100);
    }

    public void house(){
        square();
        triangle();
        plane.isTrail = false;
        plane.move(30);
        plane.turn(-120);
        plane.move(90);
        plane.isTrail=true;
        plane.turn(-90);
        window();
    }
}


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/