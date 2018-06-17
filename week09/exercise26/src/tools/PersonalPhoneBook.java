package tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalPhoneBook implements PhoneBook {

	private Map<String, Map<String, Set<String>>> contactByNameWithAddress = new HashMap<>();
	private Map<String, String> contactByNumber = new HashMap<>();

	private ArrayList<String> numbersList = new ArrayList<>();

	@Override
	public void addPhoneNumber(String personName, String phoneNumber) {

		if (!this.contactByNameWithAddress.containsKey(personName)) {
			Map<String, Set<String>> number = new HashMap<>();
			Set<String> setNumbers = new HashSet<>();
			setNumbers.add(phoneNumber);
			number.put("PhoneNumber", setNumbers);
			this.contactByNameWithAddress.put(personName, number);
			this.contactByNumber.put(personName, phoneNumber);
			this.numbersList.add(phoneNumber);
		} else {
			this.contactByNameWithAddress.get(personName).get("PhoneNumber").add(phoneNumber);
			this.contactByNumber.put(phoneNumber, personName);
			this.numbersList.add(phoneNumber);
		}
	}

	@Override
	public Set<String> searchByPerson(String personName) {
		// TODO Auto-generated method stub

		return this.contactByNameWithAddress.get(personName).get("PhoneNumber");

	}

	@Override
	public String searchByNumber(String personNumber) {
		// TODO Auto-generated method stub

		return this.contactByNumber.get(personNumber);

	}

	@Override
	public void addAddress(String personName, String address) {
		// TODO Auto-generated method stub
		Set<String> addresses = new HashSet<>();
		addresses.add(address);
		this.contactByNameWithAddress.get(personName).put("Address", addresses);

	}

	@Override
	public String information(String personName) {
		// TODO Auto-generated method stub
		return this.contactByNameWithAddress.get(personName).get("PhoneNumber") + " "
				+ this.contactByNameWithAddress.get(personName).get("Address");
	}

	@Override
	public void removeInformation(String personName) {
		// TODO Auto-generated method stub
		this.contactByNameWithAddress.remove(personName);
		for (String number : this.numbersList) {
			this.contactByNumber.remove(number);
		}
	}

}
