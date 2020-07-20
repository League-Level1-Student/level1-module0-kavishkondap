int y = 0;
 int randomNumber = (int) random(700);
 int score=0;
void setup (){
  size(700,700);
  
}
void draw() {
  background(#9D9D9D);
  fill(0,0,255);
  stroke(0,0,0);
 
  ellipse(randomNumber,y,30,30);
  y+=5;
  if(y==700){
   y=0; 
checkCatch (randomNumber);
randomNumber =(int) random (700);
  }
  fill(48,48,48);
  rect (mouseX, 650, 70,50);
 
  fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
