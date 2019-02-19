package Lab_7_2;

public class Image implements ImageLoader{
	
	private String image;
	private String type;
	
	
	public Image(String image, String type) {
		this.image= image+".jpg";
	    this.type = type;
	}
	
	public String getImage() {
		return this.image+"\n"+ this.type;
		}

	@Override
	public Image getImage(Address address) {
		
		return this.getImage(address);
	}
	
	
	
}
