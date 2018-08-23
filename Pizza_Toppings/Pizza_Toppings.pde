PImage eyeball;
PImage goblin;
int random;
import ddf.minim.*;
Minim minim;
AudioPlayer sound;
void setup() {
  size(500,500);
  fill(211,170,2);
  ellipse(250,250,200,200);
  fill(255,0,0);
  ellipse(250,250,190,190);
  fill(0,255,0);
  ellipse(250,250,180,180);
  eyeball = loadImage("eyeball.ppm.gif");
  goblin = loadImage("goblin.ppm.gif");
  minim = new Minim(this);
  sound = minim.loadFile("rain.wav");
}
void draw(){
  if (mousePressed){
    random = (int)random(0,3);
    if (random == 1) {
      image(eyeball,mouseX,mouseY);
      sound.play();
      sound.rewind();
    }
    if (random == 2) {
      image(goblin,mouseX,mouseY);
      sound.play();
      sound.rewind();
    }
  }
}