  PImage pictureOfRecord;
  int angle=0;
  import ddf.minim.*;
 Minim minim;        //as a member variable
  AudioPlayer song;
void setup (){

size(600,600);
  pictureOfRecord = loadImage ("record.jpg");
 pictureOfRecord.resize(600,600);
 minim = new Minim(this);
song =minim.loadFile("awesomeTrack.mp3", 512);
}
void draw (){

  if (mousePressed){
  angle+=10;
  rotateImage (pictureOfRecord,angle); 
  song.play();
}else{
 song.pause(); 
}
image(pictureOfRecord, 0,0);
}
 void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
