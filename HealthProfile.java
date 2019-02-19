package Lab_7_2;

public class HealthProfile {
	
	private String lastVisit;
	private String nextAppointment;
	private String patientsComplaint;
	private String doctorsPrescription;
	
	public HealthProfile(String lastVisit, String nextAppointment, String patientsComplaint,
			String doctorsPrescription) {
		this.lastVisit = lastVisit;
		this.nextAppointment = nextAppointment;
		this.patientsComplaint = patientsComplaint;
		this.doctorsPrescription = doctorsPrescription;
	}

	@Override
	public String toString() {
		return "HealthProfile [lastVisit=" + lastVisit + ", nextAppointment=" + nextAppointment + ", patientsComplaint="
				+ patientsComplaint + ", doctorsPrescription=" + doctorsPrescription + "]";
	}
}
