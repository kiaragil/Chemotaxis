import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria [] colony = new Bacteria[250];
public void setup(){     
	size(600, 600);
	background(255);
	for(int i = 0; i < colony.length; i++){
		colony[i] = new Bacteria();
	} //end loop 
 } //end setup 
 public void draw(){    
 	fill(252, 225, 155);
 	rect(0, 0, 600,600);
 	for(int i = 0; i < colony.length; i++){
 		colony[i].move();
 		colony[i].show();  
 	} //end loop

 } //end draw     

class Bacteria    
 {     
 	int bacX,bacY,bacSize, rgb;
 	Bacteria(){
 		bacX = (int)(Math.random()*300)+50;
 		bacY = (int)(Math.random()*30)+50;
 		rgb = color((int)(Math.random()*255), (int)(Math.random()*230),0);
 		bacSize = (int)(Math.random()*20)+5;
 	} //end bac constructor

 	public void show(){
 		stroke(rgb);
 		fill(rgb);
 		ellipse(bacX,bacY, bacSize, bacSize);
 	} //end show

 	public void move()
 	{
 			if (bacX < mouseX){
 				bacX += (int)(Math.random()*5);
 			}
 			else if (bacX > mouseX){
 				bacX += (int)(Math.random()*5)-3;
 			}

 			if (bacY < mouseY){
				bacY += (int)(Math.random()*5);
 			}

 			else if (bacY > mouseY){
 				bacY += (int)(Math.random()*5)-3;
 			}
 	} //end move

 } // end bac class
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
