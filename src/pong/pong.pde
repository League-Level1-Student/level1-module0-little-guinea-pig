PImage backgroundImage;
import ddf.minim.*;  
Minim minim;
AudioSample sound;
void setup(){
  size(500, 500);
  background(0,0,0);
  minim = new Minim (this);
sound = minim.loadSample("pong.wav", 8);
backgroundImage = loadImage("download.jpeg");
}
int ballX = 30;
int ballY = 30;
int xspeed = 10;
int yspeed = 10;
void draw(){
  image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
  fill(255,0,0);
  stroke(255,0,0);
  ellipse(ballX,ballY,20,20);
  rect(mouseX, 460, 70, 30);
  ballX += xspeed;
  ballY += yspeed;
  if(ballX >= 480){
    xspeed = xspeed * -1;    
}
  else if(ballX <= 20){
    xspeed = xspeed *-1;
  }
    if(ballY >= 480){
    yspeed = yspeed * -1;
    sound.trigger();
}
  else if(ballY <= 20){
    yspeed = yspeed *-1;
  }
  if(intersects(ballX, ballY, mouseX, 460, 70) == true){
    yspeed = yspeed *-1;
    
  }
  

}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}