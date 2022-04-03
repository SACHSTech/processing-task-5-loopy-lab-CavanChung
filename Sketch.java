/**
 * Name: Processing Task 5
 * Purpose: Using loops draw rectangles in patterns in quadrants
 * Author: Cavan Chung
 * Created: 2022/04/02
 */
import processing.core.PApplet;

public class Sketch extends PApplet {
	
	

  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  

    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  

  public void draw_section1(){
    int intX = 0;
    int intY = 0;
    
    // set the x and y values and loop until a grid has formed
    for(int intRow = 5; intRow < 300; intRow += 10){
      for(int intColumn = 5; intColumn < 300; intColumn += 10){
        intX = intRow; 
        intY = 300 + intColumn;
        
        // draw rectangles
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section2(){
    int intX = 0;
    int intY = 0;
    int colour;

    // set the x and y values and loop until a grid has formed
    for(int intRow = 0; intRow < 30; intRow += 1){
      for(int intColumn = 0; intColumn < 30; intColumn += 1){
        intX = 304 + (intRow * 10); 
        intY = 304 + (intColumn * 10);

        // if statement to determine colour values
        if (intRow % 2 == 0) {
          colour = 255;
        }
        else {
          colour = 0;
        }

        // draw rectangles, determining colour based on the if statment
        fill(colour);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  public void draw_section3(){

    int intX = 0;
    int intY = 0;
    int colour;

    // set the x and y values and loop until a grid has formed 
    for(int intRow = 0; intRow < 30; intRow += 1){
      for(int intColumn = 0; intColumn < 30; intColumn += 1){
        intX = 604 + (intRow * 10); 
        intY = 304 + (intColumn * 10);

        // if statement to determine colour values
        if (intColumn % 2 == 0) {
          colour = 255;
        }
        else {
          colour = 0;
        }

        // draw rectangles, determining colour based on the if statment
        fill(colour);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  
  public void draw_section4(){

    int intX = 0;
    int intY = 0;
    int colour;

    // set the x and y values and loop until a grid has formed
    for(int intRow = 0; intRow < 30; intRow += 1){
      for(int intColumn = 0; intColumn < 30; intColumn += 1){
        intX = 904 + (intRow * 10); 
        intY = 304 + (intColumn * 10);
        
        // if statement to determine colour values
        if (intRow % 2 == 0 & intColumn % 2 == 0) {
          colour = 255;
        }
        else {
          colour = 0;
        }

        // draw rectangles, determining colour based on the if statment
        fill(colour);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section5(){

    int intX = 0;
    int intY = 0;

    // determine x and y values loop until half the quadrant is covered (triangle)
    for(int intColumn = 5; intColumn < 300; intColumn += 10){
      for(int intRow = 300 - intColumn; intRow < 300; intRow += 10){
        intX = intRow; 
        intY = intColumn;

        // print rectangles
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
        }
      }
  }

  public void draw_section6(){

    int intX = 0;
    int intY = 0;

    // determine x and y values loop until half the quadrant is covered (triangle)
    for(int intRow = 300; intRow > 0; intRow -= 10){
      for(int intColumn = 295; intColumn > intRow; intColumn -= 10){
        intX = 300 + intRow; 
        intY = intColumn - 5;

        // print rectangles
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
        }
      }
  }

  public void draw_section7(){

    int intX = 0;
    int intY = 0;

    // determine x and y values loop until half the quadrant is covered (triangle)
    for(int intColumn = 5; intColumn < 300; intColumn += 10){
      for(int intRow = 300 - intColumn; intRow > 0; intRow -= 10){
        intX = 600 + intRow - 3; 
        intY = intColumn;

        // print rectangles
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
        }
      }
  }
  
  public void draw_section8(){

    int intX = 0;
    int intY = 0;
    
    // determine x and y values loop until half the quadrant is covered (triangle)
    for(int intRow = 5; intRow < 300; intRow += 10){
      for(int intColumn = 5; intColumn < intRow; intColumn += 10){
        intX = 900 + intRow - 3; 
        intY = intColumn;

        // print rectangles
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
        }
      }
  }
}
