package jcat.assembly.sim;
import com.badlogic.gdx.math.Vector3;


public class ScreenButton extends ScreenObject {
	//to know if the button has been touched.
	private boolean touched;
	//to know the width and height of the button
	private float width, height;
	
	//This sets up my button information.
	public ScreenButton(int x, int y,float width, float height) {
		super(x, y);
		this.width = width;
		this.height = height;
		this.touched = false;
	}

	//returns true or false if button was touched.
	public boolean isTouched(boolean touchDown, Vector3 touchPoint){
		//first check if the screen was touched
		if(touchDown){
			//then check if the finger was inside the horizontal part of the button.
			if((this.getX()<= touchPoint.x) && (touchPoint.x <= this.getX() + this.width)){
				//then check if the finger was inside the vertical part of the button
				if((this.getY() <= touchPoint.y) && (touchPoint.y <= this.getY() + this.height)){
					return touched = true;
				}
			}
		}
		return touched = false;
	}
	
	/**
	 * Just returns the touched boolean value
	 * @return touched which is the boolean value.
	 */
	public boolean getTouched(){
		return touched;
	}

}
