void setup(){
  size(500,500);
  background(0,0,0);
}
void draw(){  
  makeMagical();
  for(int x = 0; x<1000; x++){
    fill(frameCount,x,0);
    ellipse(getWormX(x),getWormY(x),2,2);
  }
  if(mousePressed){
    fill(frameCount,100,0);
    ellipse(getWormX(100),getWormY(100),2,2);}    
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}