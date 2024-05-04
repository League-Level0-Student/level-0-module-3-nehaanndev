
void setup() {

  // set the size of your sketch
  size(500, 500);
}
void draw() {

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  int w = 450;
  int h = 450;
  for (int i = 0; i<8; i++) {
    if ( i % 2 == 1) {
      fill(0,0,0);
    } else {
     fill(255,0,0);
      //Use an if statement and remainder to alternate the color of your rings.
    }
    ellipse(250, 250, w, h);
    w = w - 50;
    h =h- 50;
  }
}
