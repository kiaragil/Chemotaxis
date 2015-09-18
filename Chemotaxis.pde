Bacteria [] colony = new Bacteria[150];
void setup()   
{     
	size(600, 600);
	background(255);
	for(int i = 0; i < colony.length; i++)
	{
		colony[i] = new Bacteria();
	}	    
 }   
 void draw()   
 {    
 	fill(252, 225, 155);
 	rect(0, 0, 600,600);
 	for(int i = 0; i < colony.length; i++)
 	{
 		colony[i].move();
 		colony[i].show();  
 }  
 class Bacteria    
 {     
 	//lots of java!   
 }    