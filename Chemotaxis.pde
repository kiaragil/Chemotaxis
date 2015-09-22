Bacteria [] colony = new Bacteria[100];
void setup(){     
	size(600, 600);
	background(255);
	for(int i = 0; i < colony.length; i++){
		colony[i] = new Bacteria();
	} //end loop 
 } //end setup 
 void draw(){    
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
 		rgb = (int)(Math.random()*230);
 		bacSize = (int)(Math.random()*10)+5;
 	} //end bac constructor

 	void show(){
 		stroke(0, rgb, 0);
 		fill(0, rgb, 0);
 		ellipse(bacX,bacY, bacSize, bacSize);
 	} //end show

 	void move()
 	{
 			if (bacX < mouseX){
 				bacX += (int)(Math.random()*4)+3;
 			}
 			else if (bacX > mouseX){
 				bacX += (int)(Math.random()*4)-3;
 			}

 			if (bacY < mouseY){
				bacY += (int)(Math.random()*4)+3;
 			}

 			else if (bacY > mouseY){
 				bacY += (int)(Math.random()*4)-3;
 			}
 	} //end move

 } // end bac class

