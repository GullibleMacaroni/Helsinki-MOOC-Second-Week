package tools;

import java.util.Set;

public interface PhoneBook {
	public void addPhoneNumber(String personName, String phoneNumber);

	public Set<String> searchByPerson(String personName);

	public String searchByNumber(String personNumber);

	public void addAddress(String personName, String address);

	public String information(String personName);

	public void removeInformation(String personName);

}
