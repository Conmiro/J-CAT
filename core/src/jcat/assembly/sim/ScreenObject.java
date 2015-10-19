/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcat.assembly.sim;

/**
 *
 * @author burritolove
 * This an abstract class that all screen objects will use.
 */
public abstract class ScreenObject {
    private int x,y;
   /**
    * This sets the coordinates of the screen objects that will
    * be used. Note that it is using the bottom left corner.
    * @param x This is the x coordinate
    * @param y This is the y coordinate
    */
    public ScreenObject(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x){
    	this.x = x;
    }
 
    public void setY(int y){
    	this.y = y;
    }
    
    public int getX(){
    	return x;
    }
    
    public int getY(){
    	return y;
    }
}
