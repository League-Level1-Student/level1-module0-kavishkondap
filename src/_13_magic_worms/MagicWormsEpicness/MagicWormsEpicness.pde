void setup(){
  size(900,900);
  background(100,100,100);

  
}

void draw (){
  makeMagical();
  for(int i=1; i<301; i++){
     fill(i-160,i-50,i-16);
    ellipse(getWormX(i),getWormY(i),10,10);
 
}
  
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
