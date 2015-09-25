/**
 * Created by Aaron Fernandes.
 */
public class Patient {
	private int _patientId;
	private String _firstName;
	private String _lastName;
	private String _address;
	private String _city;
	private String _province;
	private String _postalCode;

	Patient(int patientId, String firstName, String lastName, String address, String city, String province, String postalCode){
		this._patientId=patientId;
		this._firstName=firstName;
		this._lastName=lastName;
		this._address=address;
		this._city=city;
		this._province=province;
		this._postalCode=postalCode;
	}

	Patient(){}

	//getter and setter for patientID
	public void set_patientId(int patientId){this._patientId=patientId;}
	public int get_patientId(){return this._patientId;}

	//getter and setter for firstName
	public void set_firstName(String firstName){this._firstName=firstName;}
	public String get_firstName(){return this._firstName;}

	//getter and setter for lastName
	public void set_lastName(String lastName){this._lastName=lastName;}
	public String get_lastName(){return this._lastName;}

	//getter and setter for address
	public void set_address(String address){this._address=address;}
	public String get_address(){return this._address;}

	//getter and setter for city
	public void set_city(String city){this._city=city;}
	public String get_city(){return this._city;}

	//getter and setter for provence
	public void set_province(String province){this._province=province;}
	public String get_province(){return this._province;}

	//getter and setter for postalCode
	public void set_postalCode(String postalCode){this._postalCode=postalCode;}
	public String get_postalCode(){return this._postalCode;}

	public String getPatientInfo(){
		return String.format("%s%nYour PatientId is %d %nAddress: %s%n%s, %s%n%s",
														this._firstName+" "+this._lastName, this._patientId
														,this._address, this._city, this._province, this._postalCode);
	}

}
