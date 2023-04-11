package net.kdigital.generic;

public class ThreeDPrinter  {
	private Object material;

	public void setMaterial(Object material) {
		this.material = material; 
	}
	
	public Object setMaterial() {
		return material;
	}

	public void setMaterial(Powder material) {
		this.material = material;
	}
}
