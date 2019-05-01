int score = 0;

void setup(){
  size(500, 500);
  background(#9C9EA0); 
}
int raindropY = 20;
int randomNumber = (int) random(500);

void draw(){
   if(raindropY > 500){
   raindropY = 20;
   randomNumber = (int) random(500);   
   }
  background(#9C9EA0);
  fill(#2A83F5);
  stroke(#2A83F5);
  rect(mouseX, 450, 70, 30);
  ellipse(randomNumber, raindropY,20, 20);
  raindropY += 10; 
  fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
if(raindropY == 470){
checkCatch(randomNumber);}
}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+70)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }