public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;
// change
    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());

        plane.teleport(0,0);
        plane.setColor(70,0,200);
        plane.trailWidth = 15;
        plane.isTrail = true;
        plane.pausetime = 1;
        plane.move(562);
        plane.turn(90);
        plane.move(990);
        plane.turn(90);
        plane.move(562);
        plane.turn(90);
        plane.move(1000);

        for (int row = 1; row < 562; row = row + 1) {
            for (int col = 1; col < 1000; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);

                if(red>200 && green>150 && col<305 && row>300 && row<550){
                    plane.setPixelColor(150, row/3+70, 230);
                }else if (red>200 && green>150 && blue<150 && col>305 && col<600 && row>330 && row<460){
                    plane.setPixelColor(206, row/2, 250);
                }else if (red<100 && green>100 && green<250 && blue>100 && col>350 && col<600 && row>420){
                    plane.setPixelColor(70, 30, 120);
                }else if (red>100 && red<200 && green>40 && green<100 && blue<40 && col>300 && col<610 && row>75 && row<300){
                    plane.setPixelColor(150, row/2, 230);
                }else if (red>200 && green>175 && blue<150 && col<150 && row<200){
                    plane.setPixelColor(150,220,240);
                }else if (red<200 && green>140 && blue>190 && col>100 && col<275 && row>475){
                    plane.setPixelColor(0, 107, 135);
                }else if (red>190 && green<130 && green>40 && blue>30 && col<225 && row>256 && row<530){
                    plane.setPixelColor(50,80,170);
                }else if (red>130 && green>100 && green<200 && blue<120 && col>766 && row<260){
                    plane.setPixelColor(40,128,row/2);
                }else if (red>120 && green<100 && blue<70 && col>750 && row>250 && row<450){
                    plane.setPixelColor(111, 242, 162);
                }else if (red<100 && green>120 && blue>150 && col>700 && row>400){
                    plane.setPixelColor(0, 69, 35);
                }


            }
        }


    }
}

//                    plane.setPixelColor(row/3, green, col/4);
/*
}else if(col<40 && row<300){
                    plane.setPixelColor(row/3, green, col/4);
                }else if(col>330 && row>550){
                    plane.setPixelColor(row/3, green, col/4);

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/