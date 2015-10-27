package jcat.assembly.sim;

import com.badlogic.gdx.utils.Array;


/**
 * This class allows creating a Memory object which stores integer values
 * in an array and allows for easily retrieving and setting these values
 * as well as printing them out in hex format.
 * @author Connor
 *
 */
public class Memory {


	private Array<Integer> mem; //Array for storing values at memory addresses
	private int bitLength = 4; //Number of bits in each memory address.
	
	
	
	
	
	/**
	 * Constructor for Memory object.
	 * @param size Number of memory addresses.
	 */
	public Memory(int size){
		mem = new Array<Integer>(size);
		for (int i = 0; i < size; i++){
			mem.add(0);
		}
	}
	
	/**
	 * Gets the value at given index.
	 * @param index Index of the array.
	 * @return Value at given index.
	 */
	public int getValue(int index){
		return (Integer) mem.get(index);
	}
	
	/**
	 * Set value for given index.
	 * @param index Index of the array.
	 * @param value Value to set.
	 */
	public void setValue(int index, int value){
		mem.set(index, value);
	}
	/**
	 * @return Returns string representation of Memory object.
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (Object val: this.mem){
			sb.append(String.format("0x%03x: 0x%03x\n", i*bitLength, val));
			i++;
		}
		return sb.toString();
	}
	
	
	
}
