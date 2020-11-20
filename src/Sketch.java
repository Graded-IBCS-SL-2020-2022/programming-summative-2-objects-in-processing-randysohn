
/** MAKE SURE TO READ THE README CAREFULLY BEFORE YOU BEGIN EDITING THIS CODE */
//Hi
import processing.core.PApplet;

public class Sketch extends PApplet {

    /*
     * SUMMATIVE REQUIRED Declare at least four balls, four bubbles, and four
     * snowflakes as instance variables. I have made the first ball for you.
     * 
     * SUMMATIVE OPTIONAL Use *arrays* to store the elements, rather than individual
     * variables.
     */

    Ball b1;
    Ball b2;
    Ball b3;
    Ball b4;
    Bubble bu1;
    Bubble bu2;
    Bubble bu3;
    Bubble bu4;
    Snowflake sn1;
    Snowflake sn2;
    Snowflake sn3;
    Snowflake sn4;
    boolean b1Pressed = false;
    boolean b2Pressed = false;
    boolean b3Pressed = false;
    boolean b4Pressed = false;


    public void settings() {
        size(500, 500);
    }

    /*
     * SUMMATIVE REQUIRED Initialize the balls, bubbles, and snowflakes using your
     * constructors inside of setup(). You must use a non-default-constructor at
     * least once and a default constructor at least once for each type.
     * 
     * I have done the first ball for you.
     */
    public void setup() {
        frameRate(30);
        b1 = new Ball(this);
        b2 = new Ball(this);
        b3 = new Ball(this, 230, 170, 120, color(255,0,0), 3, 5);
        b4 = new Ball(this, 120, 210, 180, color(100,120,0), 2, 4);

        bu1 = new Bubble(this);
        bu2 = new Bubble(this, 10, 15, 50, 4);
        bu3 = new Bubble(this, 250, 25, 40, color(255,255,255), 1, -3);
        bu4 = new Bubble(this, 100, 30, 30, color(255,255,255), 2, -2);

        sn1 = new Snowflake(this);
        sn2 = new Snowflake(this);
        sn3 = new Snowflake(this, 10, 30, 70, color(0,30,180), 3, 3);
        sn4 = new Snowflake(this, 50, 70, 40, color(10,10,80), 4, 2);
    }

    public void draw() {
        background(100);

        /* SUMMATIVE REQUIRED Draw and move all balls, snowflakes, and bubbles */
        b1.drawBall();
        b1.moveBall();
        b2.drawBall();
        b2.moveBall();
        b3.drawBall();
        b3.moveBall();
        b4.drawBall();
        b4.moveBall();
        
        bu1.drawBubble();
        bu1.moveBubble();
        bu2.drawBubble();
        bu2.moveBubble();
        bu3.drawBubble();
        bu3.moveBubble();
        bu4.drawBubble();
        bu4.moveBubble();

        sn1.drawSnowflake();
        sn1.moveSnowflake();
        sn2.drawSnowflake();
        sn2.moveSnowflake();
        sn3.drawSnowflake();
        sn3.moveSnowflake();
        sn4.drawSnowflake();
        sn4.moveSnowflake();
    }

    /**
     * Convenience method to return a random color
     * 
     * @param transluscent if true, make the color transluscent, otherwise solid
     */
    public int randomColor(boolean transluscent) {
        int alpha;
        if (transluscent) {
            alpha = 125;
        } else {
            alpha = 255;
        }
        return color(random(0, 255), random(0, 255), random(0, 255), alpha);
    }

    /*
     * SUMMATIVE OPTIONAL Add a void method called mousePressed() that stops some or
     * all of the balls from moving when you click the mouse. (it will run
     * automatically when you click if the name is correct)
     * 
     * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
     * stops? (this is a major challenge - you can use the variables mouseX and
     * mouseY to see where the mouse was clicked.)
     */

     public void mousePressed() {
       if (mouseX < b1.x + b1.getRadius() && mouseX > b1.x - b1.getRadius() && mouseY > b1.y - b1.getRadius() && mouseY < b1.y + b1.getRadius() && !b1Pressed){
         b1.stop();
         b1Pressed = true;
       }

       else if (mouseX < b1.x + b1.getRadius() && mouseX > b1.x - b1.getRadius() && mouseY > b1.y - b1.getRadius() && mouseY < b1.y + b1.getRadius() && b1Pressed){
         b1.start();
         b1Pressed = false;
       }

       if (mouseX < b2.x + b2.getRadius() && mouseX > b2.x - b2.getRadius() && mouseY > b2.y - b2.getRadius() && mouseY < b2.y + b2.getRadius() && !b2Pressed){
         b2.stop();
         b2Pressed = true;
       }

       else if (mouseX < b2.x + b2.getRadius() && mouseX > b2.x - b2.getRadius() && mouseY > b2.y - b2.getRadius() && mouseY < b2.y + b2.getRadius() && b2Pressed){
         b2.start();
         b2Pressed = false;
       }
       if (mouseX < b3.x + b3.getRadius() && mouseX > b3.x - b3.getRadius() && mouseY > b3.y - b3.getRadius() && mouseY < b3.y + b3.getRadius() && !b3Pressed){
         b3.stop();
         b3Pressed = true;
       }

      else  if (mouseX < b3.x + b3.getRadius() && mouseX > b3.x - b3.getRadius() && mouseY > b3.y - b3.getRadius() && mouseY < b3.y + b3.getRadius() && b3Pressed){
         b3.start();
         b3Pressed = false;
       }
       if (mouseX < b4.x + b4.getRadius() && mouseX > b4.x - b4.getRadius() && mouseY > b4.y - b4.getRadius() && mouseY < b4.y + b4.getRadius() && !b4Pressed){
         b4.stop();
         b4Pressed = true;
       }

       else if (mouseX < b4.x + b4.getRadius() && mouseX > b4.x - b4.getRadius() && mouseY > b4.y - b4.getRadius() && mouseY < b4.y + b4.getRadius() && b4Pressed){
         b4.start();
         b4Pressed = false;
       }

     }

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
