public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.pausetime = 1;
        plane.trailWidth = 11;
        plane.teleport(100, 100);
        gridOfSmallSquares();
    }

    public void fives() {
        for (int x = 5; x > -13; x = x - 1) {
            System.out.println(x);
        }
    }

    public void rowOfSmallSquares() {
        //in this method, create a long row of 10 pixel by 10 pixel squares
        plane.trailWidth = 5;
        /*for (int x = 100; x < 700; x = x + 20) {
            System.out.println(x);
            plane.teleport(x, 50);
            plane.square(10);
        }

         */
        //put your loop here
        for (int x = 2; x < 20; x = x + 1) {
            System.out.println(x);
            plane.teleport(x*25, 50);
            plane.square(10);
        }

    }

    public void columnOfSmallSquares() {
        //in this method, create a long column of 10 pixel by 10 pixel squares
        plane.trailWidth = 5;
        for (int y = 100; y < 700; y = y + 25) {
            System.out.println(y);
            plane.teleport(100, y);
            plane.square(10);
        }
        //put your loop here

    }

    public void gridOfSmallSquares() {
        //in this method, loop one of your previous two methods
        //your goal is to create a grid of squares
        //OPTIONAL EXTRA CHALLENGE can you make the squares fade from one color to another?
        //put your loop here

        //Making the grid in columns:
        /*for (int x = 0;x<20;x=x+1){

            for (int y = 1; y < 20; y = y + 1) {
                System.out.println(y);
                plane.teleport(200+x*25, 200+y*25);
                plane.square(10);
            }
        }



        //Making the grid in rows:
        for (int y=0;y<15;y=y+1){
            for (int x = 1; x < 15; x = x + 1) {
                System.out.println(x);
                plane.setColor(x*10,x*10,100);
                plane.teleport(200 + x*25, 200 + y*25);
                plane.square(10);
            }
        }

         */

        for (int x = 0;x<8;x=x+1){

            for (int y = 1; y < 10; y = y + 1) {
                System.out.println(y);
                plane.setColor(y*20,150,150);
                plane.teleport(100+y*25, 100+x*25);
                plane.square(10);
            }
        }

        for (int y = 0;y<8;y=y+1){

            for (int x = 1; x < 10; x = x + 1) {
                System.out.println(x);
                plane.setColor(x*20,150,150);
                plane.teleport(400+y*25, 100+x*25);
                plane.square(10);
            }
        }

        for (int x = 0;x<15;x=x+1){

            for (int y = 1; y < 15; y = y + 1) {
                System.out.println(y);
                plane.setColor((y/2)*(x/2)*5,150,150);
                plane.teleport(100+y*25, 400+x*25);
                plane.square(10);
            }
        }
    }
}

/*for(int x=100;x<700;x=x+100)
        {
        System.out.println(x);
        plane.teleport(x,100);
        plane.square(50);
        }

 */