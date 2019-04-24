import ddf.minim.*;
PImage pictureOfRecord; 
Minim minim;//as member variable
AudioPlayer song;
int angle = 0;
void setup(){
  size(1000,1000);     //in setup method  
  pictureOfRecord= loadImage("record.png");
  pictureOfRecord.resize(height,width);     //in setup method
  minim = new Minim(this);
  song = minim.loadFile("Going-Different-Ways_Looping.mp3", 512);
 
}
void draw(){
angle += 200;
rotateImage(pictureOfRecord, angle);
image(pictureOfRecord, 0,0);     //in draw method
 if (mousePressed == true){
    song.play();
  }
  else{
    song.pause();
  }

}
void rotateImage(PImage pictureOfRecord, int amountToRotate) {
  if (mousePressed == true){
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-pictureOfRecord.width/2, -pictureOfRecord.height/2);
  }
}