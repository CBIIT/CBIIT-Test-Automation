package CHARMS.alljava;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class ParticipantPersonalInformation {
    private String firstName;
    private String middleName;
    private String lastName;
    private String proxyFirstname;
    private String proxyMiddleName;
    private String proxyLastName;
	
    public ParticipantPersonalInformation(String firstName, String middleName, String lastName, String proxyFirstname,
			String proxyMiddleName, String proxyLastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.proxyFirstname = proxyFirstname;
		this.proxyMiddleName = proxyMiddleName;
		this.proxyLastName = proxyLastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProxyFirstname() {
		return proxyFirstname;
	}

	public void setProxyFirstname(String proxyFirstname) {
		this.proxyFirstname = proxyFirstname;
	}

	public String getProxyMiddleName() {
		return proxyMiddleName;
	}

	public void setProxyMiddleName(String proxyMiddleName) {
		this.proxyMiddleName = proxyMiddleName;
	}

	public String getProxyLastName() {
		return proxyLastName;
	}

	public void setProxyLastName(String proxyLastName) {
		this.proxyLastName = proxyLastName;
	}

	public int compareTo(ParticipantPersonalInformation participantPersonalInformation) {
		CompareToBuilder compareToBuilder = new CompareToBuilder();
		compareToBuilder.append(getFirstName(), participantPersonalInformation.getFirstName());
		compareToBuilder.append(getMiddleName(), participantPersonalInformation.getMiddleName());
		compareToBuilder.append(getLastName(), participantPersonalInformation.getLastName());
		compareToBuilder.append(getProxyFirstname(), participantPersonalInformation.getProxyFirstname());
		compareToBuilder.append(getProxyMiddleName(), participantPersonalInformation.getProxyMiddleName());
		compareToBuilder.append(getProxyLastName(), participantPersonalInformation.getProxyLastName());
		return compareToBuilder.toComparison();
	} 
};
