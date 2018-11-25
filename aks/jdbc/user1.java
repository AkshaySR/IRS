package aks.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="Registration")
@RequestScoped

public class user1 {

	private String userName="";
	private String firstName="";
	private String lastName="";
	private String password="";
	private String newpassword="";

	/*	private String eMail="";*/
	private String DOB="";
	private String address1="";
	private String phoneNo="";
	private String city123="";
	private String state="";
	private String country="";
	private String mailid="";
	private String pass="";
	
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getCity123() {
		return city123;
	}
	public void setCity123(String city123) {
		this.city123 = city123;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	Connection con = null; 
	public String add1()
	{
		
		System.out.println("i am inside add1");
		int i = 0;

		
			PreparedStatement ps = null;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/record1", "root", "password");
				String sql = "INSERT INTO register(UserName, FirstName,LastName,password,EMail,DOB,Address1,PhoneNo,City123,State,Country) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
				ps= con.prepareStatement(sql); 
				ps.setString(1, userName);
				ps.setString(2, firstName);
				ps.setString(3, lastName);
				ps.setString(4,password );
				ps.setString(5,mailid);
				/*ps.setString(5, eMail);*/
				ps.setString(6, DOB);
				ps.setString(7, address1);
				ps.setString(8, phoneNo);
				ps.setString(9, city123);
				ps.setString(10, state);
				ps.setString(11, country);
				
				
				i = ps.executeUpdate();
				ps = con.prepareStatement( "select firstname"); 
				
								System.out.println("Data Added Successfully");
								
			}
			catch(Exception e)
			{
				System.out.println(e); 
			}
			finally
			{
				try
				{
					con.close();
					ps.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			if(i>0){	
				return "success.xhtml";
		}else {
			return "invalid";
		}
							
		}
	
	public String logininfo(String userName)
	{
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/record1", "root", "password");
			System.out.println("I am in retrieve try");
			PreparedStatement st = con.prepareStatement("select userName,password from register where userName = '"+userName+"'" );
			System.out.println("I am in retrieve after");
			ResultSet r1 = st.executeQuery();
			System.out.println("Data ");
		     if(r1.next()) {
		    	 userName = r1.getString("userName");  
		    	 pass = r1.getString("password");
		    	 System.out.println("userName"+this.userName);
		    	 System.out.println("password"+this.password);
		    	 System.out.println("password"+this.pass);
		
		    	 /*System.out.println("Fname"+this.firstname);
		    	 System.out.println("Lname"+this.lastname);
		    	 System.out.println("ssn"+this.ssn);
		    	 System.out.println("firstName2"+this.firstName2);
		    	 System.out.println("lastname2"+this.lastname2);
		    	 System.out.println("spousessn"+this.spousessn);*/
		     }

		} catch (SQLException e) {
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try
			{
				con.close();
				//st.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return null;
	    
		
		
 }

		 public String login() { 
			 logininfo(userName); 
			 if (userName.equals(userName) && pass.equals(password)) {
				 System.out.println("i am here");
				 return "insert.xhtml";
			 } else {
				 System.out.println("i am else");
				 
				 return "loginerror.xhtml";
		 }  }
		
		 public String resetpassword() { 
			 logininfo(userName); 
			 if (userName.equals(userName) && pass.equals(password)) {
				 PreparedStatement st = null;
					int i = 0;
					try {
						Class.forName("com.mysql.jdbc.Driver");
						try {
							con = DriverManager.getConnection("jdbc:mysql://localhost:3306/record1", "root", "password");
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("i am reset password");
						String sql = "update register set password='"+newpassword+"' where username = '"+userName+"'";
						System.out.println("i am after sql statement");
						try {
							st= con.prepareStatement(sql);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
						try {
							i = st.executeUpdate();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println(e);
					}
					finally
					{
						try
						{
							con.close();
							st.close();
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					}
					 return "passwordresetsuccess.xhtml";
					
					
				}
			return null;
			 } 
		  
		 public void logout() {  
		        FacesContext.getCurrentInstance().getExternalContext()  
		                .invalidateSession();  
		        FacesContext.getCurrentInstance()  
		                .getApplication().getNavigationHandler()  
		                .handleNavigation(FacesContext.getCurrentInstance(), null, "/login.xhtml");  
		    }
		 
	}


