package pe.pj.person.dto;

public class PersonDTO {
	private String name;
	private String paternalSurname;
	private String maternalSurname;
	private Boolean status;
	private String dni;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the paternalSurname
	 */
	public String getPaternalSurname() {
		return paternalSurname;
	}
	/**
	 * @return the maternalSurname
	 */
	public String getMaternalSurname() {
		return maternalSurname;
	}
	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param paternalSurname the paternalSurname to set
	 */
	public void setPaternalSurname(String paternalSurname) {
		this.paternalSurname = paternalSurname;
	}
	/**
	 * @param maternalSurname the maternalSurname to set
	 */
	public void setMaternalSurname(String maternalSurname) {
		this.maternalSurname = maternalSurname;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
}
