package sizeAffectsBark;

public class EletricGuitar {
	
	private String brand;
	private int numOfPickups = 2;
	private boolean rockStarsUseIt;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String aBrand) {
		this.brand = aBrand;
	}
	public int getNumOfPickups() {
		return numOfPickups;
	}
	public void setNumOfPickups(int num) {
		if (num >2) {
			this.numOfPickups = num;			
		}
	}
	public boolean isRockStarsUseIt() {
		return rockStarsUseIt;
	}
	public void setRockStarsUseIt(boolean yesOrNo) {
		this.rockStarsUseIt = yesOrNo;
	}
	
	@Override
	public String toString() {
		
		return this.toString();
	}
	

}
