package Lab_7_2;

public class Address {

	private String fullAddress;
		
	public Address(String fullAddress) {
		this.fullAddress= fullAddress;
	}

	@Override
	public String toString() {
		return "Address [fullAddress=" + fullAddress + "]";
	}

	public String getAddress() {
		return fullAddress;
	}
}
