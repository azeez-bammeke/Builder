package Lab_7_2;

import java.util.HashMap;
import java.util.Map;

public class ImageFactory{
	
	private static Image[] loadMap= new Image[11];
	static{
  	loadMap[0] = new Image("FairField Map","Residential Area");
  	loadMap[1] = new Image("Burlginton Map","Residential Area");
  	loadMap[2] = new Image("Otummwa Road","Highway");
  	loadMap[3] = new Image("Country Ave","School Area");
  	loadMap[4] = new Image("Crital Vill","Residential Area");
  	loadMap[5] = new Image("Dalby Road","Pedestian street");
  	loadMap[6] = new Image("MC Donald","Cafe");
  	loadMap[7] = new Image("MUM","School");
  	loadMap[8] = new Image("Rec Center","Residential Area");
  	loadMap[9] = new Image("Ceadar Rapid","Airport Road");
  	loadMap[10] = new Image("DOC","Office Area");
	}
	
	
	private Address address;
	
	private static Map<Address, Image> locationMapImages;
	
  	public ImageFactory() {
	  locationMapImages = new HashMap<>();
	}
	
	
	private void addAddress(Address address, Image image) {
		locationMapImages.put(address, image);
	}
	
	
	
	public Image getImage(Address address) {
		if(locationMapImages.containsKey(address)) {
			return locationMapImages.get(address);
		}
		String custAddress = address.getAddress();
		System.out.println("Address  " + custAddress);
		this.address = new Address(custAddress);
        int i = (int)(Math.random()*11+0);
        addAddress(address, loadMap[i]);
		  	
		System.out.println(i);
		return locationMapImages.get(address);
	}
	

}
