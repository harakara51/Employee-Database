package Data;

import java.util.ArrayList;

public class employeeBean
{
	
	private String id;
	private String firstname;  
	private String middlename; 
	private String lastname;
	private String gender;
	private String email;
	private String extension ;
	private String hiredate;
	private String salary;
	private String commission_pct;
	private String department_id;
	private String job_id;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	
	public employeeBean()
	{
		super();
	}

	public employeeBean(String id, String firstname, String middlename, String lastname, String gender, String email,
			String extension, String hiredate, String salary, String commission_pct, String department_id,
			String job_id, String address, String city, String state, String zipcode)
	{
		super();
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.gender = gender;
		this.email = email;
		this.extension = extension;
		this.hiredate = hiredate;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.department_id = department_id;
		this.job_id = job_id;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	
	public employeeBean(ArrayList<String> row)
	{
		super();
		this.id = row.get(0);
		this.firstname = row.get(1);
		this.middlename = row.get(2);
		this.lastname = row.get(3);
		this.gender = row.get(4);
		this.email = row.get(5);
		this.extension = row.get(5);
		this.hiredate = row.get(6);
		this.salary = row.get(7);
		this.commission_pct = row.get(8);
		this.department_id = row.get(9);
		this.job_id = row.get(10);
		this.address = row.get(11);
		this.city = row.get(12);
		this.state = row.get(13);
		this.zipcode = row.get(14);
	}

	/**
	 * @return the id
	 */
	
	public ArrayList<String> employeeToArray ()
	{
		ArrayList<String> employee = new ArrayList<>();
		employee.add(id);
		employee.add(firstname);
		employee.add(middlename);
		employee.add(lastname);
		employee.add(gender);
		employee.add(email);
		employee.add(extension);
		employee.add(hiredate);
		employee.add(salary);
		employee.add(commission_pct);
		employee.add(department_id);
		employee.add(job_id);
		employee.add(address);
		employee.add(city);
		employee.add(state);
		employee.add(zipcode);
		return null;
	}
	public String getId()
	{
		return id;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname()
	{
		return firstname;
	}

	/**
	 * @return the middlename
	 */
	public String getMiddlename()
	{
		return middlename;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname()
	{
		return lastname;
	}

	/**
	 * @return the gender
	 */
	public String getGender()
	{
		return gender;
	}

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * @return the extension
	 */
	public String getExtension()
	{
		return extension;
	}

	/**
	 * @return the hiredate
	 */
	public String getHiredate()
	{
		return hiredate;
	}

	/**
	 * @return the salary
	 */
	public String getSalary()
	{
		return salary;
	}

	/**
	 * @return the commission_pct
	 */
	public String getCommission_pct()
	{
		return commission_pct;
	}

	/**
	 * @return the department_id
	 */
	public String getDepartment_id()
	{
		return department_id;
	}

	/**
	 * @return the job_id
	 */
	public String getJob_id()
	{
		return job_id;
	}

	/**
	 * @return the address
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * @return the state
	 */
	public String getState()
	{
		return state;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode()
	{
		return zipcode;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	/**
	 * @param middlename the middlename to set
	 */
	public void setMiddlename(String middlename)
	{
		this.middlename = middlename;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * @param extension the extension to set
	 */
	public void setExtension(String extension)
	{
		this.extension = extension;
	}

	/**
	 * @param hiredate the hiredate to set
	 */
	public void setHiredate(String hiredate)
	{
		this.hiredate = hiredate;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary)
	{
		this.salary = salary;
	}

	/**
	 * @param commission_pct the commission_pct to set
	 */
	public void setCommission_pct(String commission_pct)
	{
		this.commission_pct = commission_pct;
	}

	/**
	 * @param department_id the department_id to set
	 */
	public void setDepartment_id(String department_id)
	{
		this.department_id = department_id;
	}

	/**
	 * @param job_id the job_id to set
	 */
	public void setJob_id(String job_id)
	{
		this.job_id = job_id;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city)
	{
		this.city = city;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state)
	{
		this.state = state;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode)
	{
		this.zipcode = zipcode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "employeeBean [id=" + id + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname="
				+ lastname + ", gender=" + gender + ", email=" + email + ", extension=" + extension + ", hiredate="
				+ hiredate + ", salary=" + salary + ", commission_pct=" + commission_pct + ", department_id="
				+ department_id + ", job_id=" + job_id + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}
	
	public String toquery()
	{	
		String query = "(firstname, lastname, gender, email, extension, hiredate, salary,"
				+ " commission_pct, department_id, job_id, address, city , state , zipcode) VALUES (\"" +firstname
				+ "\" , \"" + lastname + "\" , \"" + gender + "\" , \"" + email + "\" , \"" + extension + 
						"\"," + "CURDATE()" + "," + salary + "," + commission_pct + ","+ department_id + " , " + job_id + ",\"" + address + "\", \""
				 + city + "\" , \"" + state + "\" , \"" + zipcode + "\");";
 	return query;
	}
	
	
	
	

}
