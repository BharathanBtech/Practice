public class Dog_Barking {
    private int size;
    String barking_sound;
    int times;

    public void setBarkingType(int size) {
        if (size <= 20) {
            barking_sound = "yipp!";
        } else if (size > 20 && size <= 40) {
            barking_sound = "ruff!!";
        } else {
            barking_sound = "woff!!";
        }
    }
    
    public void BarkingLoop(int times)
    {
    	while(times > 0) {
    		System.out.println(barking_sound);
    		times= times-1;
    	}
    }

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
}
