package jcat.assembly.sim;

import com.badlogic.gdx.utils.Array;

public class Memory {

	/*
	 * Registry ID's
	 * %eax = 0
	 * %ecx = 1
	 * %edx = 2
	 * %ebx = 3
	 * %esp = 4
	 * %ebp = 5
	 * %esi = 6
	 * %edi = 7
	 */
	
	private Array<Integer> mem;
	private int bitLength = 4;
	
	
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
