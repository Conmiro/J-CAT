package jcat.assembly.sim;

import com.badlogic.gdx.utils.Array;

public class Registry extends Memory{

	
	private static int numRegisters = 8; //Total number of labeled registries.
	private Array<String> registryIds = new Array<String>(numRegisters);

	/**
	 * Constructor for Registry object. Size is predefined.
	 */
	public Registry() {
		super(numRegisters);
		registryIds.addAll("%eax", "%ecx", "%edx", "%ebx", "%esp", "%ebp", "%esi", "%edi");
	}
	
	/**
	 * @return Returns string representation of Memory object formatted as Registry.
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numRegisters; i++){
			sb.append(String.format("%s: 0x%03x\n", registryIds.get(i),getValue(i)));
		}
		return sb.toString();
	}
	

	
}
