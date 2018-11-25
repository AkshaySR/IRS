package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


@ManagedBean(name="userRegistration")
@RequestScoped

public class User {

	private String firstname="";
	private String lastname="";
	private String ssn="";
	private String firstName2="";
	private String lastname2="";
	private String spousessn="";
	private String address="";
	private String aptno="";
	private String city="";
	private String foreigncountryname="";
	private String foriegnprovince="";
	private String foriegnpostalcode="";
	private String wages="";
	private String taxableinterest="";
	private String unemployment="";
	private String adjustedgrossincome="";
	private String filingjointly="";
	private String taxableincome="";
	private String fedralincome="";
	private String EIC="";
	private String nontaxable="";
	private String totalpayments="";
	private String taxtable="";
	private String refund="";
	private String routingnumber="";
	private String accountnumber="";
	private String amountowe="";
	private String designeesname="";
	private String phoneno="";
	private String pin="";
	private String date="";
	private String occupation="";
	private String daytimephonenumber="";
	private String spousesign="";
	private String datenew="";
	private String spouseoccupation="";
	private String sentpin="";
	private String preparersname="";
	private String preparerssign="";
	private String datepreparer="";
	private String PSIN="";
	private String firmsname="";
	private String firmsEin="";
	private String firmaddress="";
	private String firmphone="";
	
	
	
	//register
	private String UserName="";
	private String FirstName="";
	private String LastName="";
	private String password="";
	private String EMail="";
	private String DOB="";
	private String Address1="";
	private String PhoneNo="";
	private String City123="";
	private String State="";
	private String Country="";
	
	
	
	

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEMail() {
		return EMail;
	}

	public void setEMail(String eMail) {
		EMail = eMail;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String address1) {
		Address1 = address1;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getCity123() {
		return City123;
	}

	public void setCity123(String city123) {
		City123 = city123;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public String getTaxableinterest() {
		return taxableinterest;
	}

	public void setTaxableinterest(String taxableinterest) {
		this.taxableinterest = taxableinterest;
	}

	public String getUnemployment() {
		return unemployment;
	}

	public void setUnemployment(String unemployment) {
		this.unemployment = unemployment;
	}

	public String getAdjustedgrossincome() {
		return adjustedgrossincome;
	}

	public void setAdjustedgrossincome(String adjustedgrossincome) {
		this.adjustedgrossincome = adjustedgrossincome;
	}

	public String getFilingjointly() {
		return filingjointly;
	}

	public void setFilingjointly(String filingjointly) {
		this.filingjointly = filingjointly;
	}

	public String getTaxableincome() {
		return taxableincome;
	}

	public void setTaxableincome(String taxableincome) {
		this.taxableincome = taxableincome;
	}

	public String getFedralincome() {
		return fedralincome;
	}

	public void setFedralincome(String fedralincome) {
		this.fedralincome = fedralincome;
	}

	public String getEIC() {
		return EIC;
	}

	public void setEIC(String eIC) {
		EIC = eIC;
	}

	public String getNontaxable() {
		return nontaxable;
	}

	public void setNontaxable(String nontaxable) {
		this.nontaxable = nontaxable;
	}

	public String getTotalpayments() {
		return totalpayments;
	}

	public void setTotalpayments(String totalpayments) {
		this.totalpayments = totalpayments;
	}

	public String getTaxtable() {
		return taxtable;
	}

	public void setTaxtable(String taxtable) {
		this.taxtable = taxtable;
	}

	public String getRefund() {
		return refund;
	}

	public void setRefund(String refund) {
		this.refund = refund;
	}

	public String getRoutingnumber() {
		return routingnumber;
	}

	public void setRoutingnumber(String routingnumber) {
		this.routingnumber = routingnumber;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAmountowe() {
		return amountowe;
	}

	public void setAmountowe(String amountowe) {
		this.amountowe = amountowe;
	}

	public String getDesigneesname() {
		return designeesname;
	}

	public void setDesigneesname(String designeesname) {
		this.designeesname = designeesname;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDaytimephonenumber() {
		return daytimephonenumber;
	}

	public void setDaytimephonenumber(String daytimephonenumber) {
		this.daytimephonenumber = daytimephonenumber;
	}

	public String getSpousesign() {
		return spousesign;
	}

	public void setSpousesign(String spousesign) {
		this.spousesign = spousesign;
	}

	public String getDatenew() {
		return datenew;
	}

	public void setDatenew(String datenew) {
		this.datenew = datenew;
	}

	public String getSpouseoccupation() {
		return spouseoccupation;
	}

	public void setSpouseoccupation(String spouseoccupation) {
		this.spouseoccupation = spouseoccupation;
	}

	public String getSentpin() {
		return sentpin;
	}

	public void setSentpin(String sentpin) {
		this.sentpin = sentpin;
	}

	public String getPreparersname() {
		return preparersname;
	}

	public void setPreparersname(String preparersname) {
		this.preparersname = preparersname;
	}

	public String getPreparerssign() {
		return preparerssign;
	}

	public void setPreparerssign(String preparerssign) {
		this.preparerssign = preparerssign;
	}

	public String getDatepreparer() {
		return datepreparer;
	}

	public void setDatepreparer(String datepreparer) {
		this.datepreparer = datepreparer;
	}

	public String getPSIN() {
		return PSIN;
	}

	public void setPSIN(String pSIN) {
		PSIN = pSIN;
	}

	public String getFirmsname() {
		return firmsname;
	}

	public void setFirmsname(String firmsname) {
		this.firmsname = firmsname;
	}

	public String getFirmsEin() {
		return firmsEin;
	}

	public void setFirmsEin(String firmsEin) {
		this.firmsEin = firmsEin;
	}

	public String getFirmaddress() {
		return firmaddress;
	}

	public void setFirmaddress(String firmaddress) {
		this.firmaddress = firmaddress;
	}

	public String getFirmphone() {
		return firmphone;
	}

	public void setFirmphone(String firmphone) {
		this.firmphone = firmphone;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFirstName2() {
		return firstName2;
	}

	public void setFirstName2(String firstName2) {
		this.firstName2 = firstName2;
	}

	public String getLastname2() {
		return lastname2;
	}

	public void setLastname2(String lastname2) {
		this.lastname2 = lastname2;
	}

	public String getSpousessn() {
		return spousessn;
	}

	public void setSpousessn(String spousessn) {
		this.spousessn = spousessn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAptno() {
		return aptno;
	}

	public void setAptno(String aptno) {
		this.aptno = aptno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getForeigncountryname() {
		return foreigncountryname;
	}

	public void setForeigncountryname(String foreigncountryname) {
		this.foreigncountryname = foreigncountryname;
	}

	public String getForiegnprovince() {
		return foriegnprovince;
	}

	public void setForiegnprovince(String foriegnprovince) {
		this.foriegnprovince = foriegnprovince;
	}

	public String getForiegnpostalcode() {
		return foriegnpostalcode;
	}

	public void setForiegnpostalcode(String foriegnpostalcode) {
		this.foriegnpostalcode = foriegnpostalcode;
	}

	public String getWages() {
		return wages;
	}

	public void setWages(String wages) {
		this.wages = wages;
	}

	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

	
	
	
	
	
	Connection con = null; 
	public String add()
	{
		
		int i = 0;

		
			PreparedStatement ps = null;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/record1", "root", "password");
				String sql = "INSERT INTO user4(firstname, lastname,ssn,firstName2,lastname2,spousessn,address,aptno,city,foreigncountryname,foriegnprovince,foriegnpostalcode,wages,taxableinterest,unemployment,adjustedgrossincome,filingjointly,taxableincome,fedralincome,EIC,nontaxable,totalpayments,taxtable,refund,routingnumber,accountnumber,amountowe,designeesname,phoneno,pin,date,occupation,daytimephonenumber,spousesign,datenew,spouseoccupation,sentpin,preparersname,preparerssign,datepreparer,PSIN,firmsname,firmsEin,firmaddress,firmphone) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				ps= con.prepareStatement(sql); 
				ps.setString(1, firstname);
				ps.setString(2, lastname);
				ps.setString(3, ssn);
				ps.setString(4,firstName2 );
				ps.setString(5, lastname2);
				ps.setString(6, spousessn);
				ps.setString(7, address);
				ps.setString(8, aptno);
				ps.setString(9, city);
				ps.setString(10, foreigncountryname);
				ps.setString(11, foriegnprovince);
				ps.setString(12, foriegnpostalcode);
				ps.setString(13, wages);
				ps.setString(14, taxableinterest);
				ps.setString(15, unemployment);
				ps.setString(16, adjustedgrossincome);
				ps.setString(17,filingjointly );
				ps.setString(18, taxableincome);
				ps.setString(19, fedralincome);
				ps.setString(20, EIC);
				ps.setString(21, nontaxable);
				ps.setString(22, totalpayments);
				ps.setString(23, taxtable);
				ps.setString(24, refund);
				ps.setString(25, routingnumber);
				ps.setString(26, accountnumber);
				ps.setString(27, amountowe);
				ps.setString(28, designeesname);
				ps.setString(29, phoneno);
				ps.setString(30, pin);
				ps.setString(31,date);
				ps.setString(32, occupation);
				ps.setString(33, daytimephonenumber);
				ps.setString(34, spousesign);
				ps.setString(35, datenew);
				ps.setString(36, spouseoccupation);
				ps.setString(37, sentpin);
				ps.setString(38, preparersname);
				ps.setString(39, preparerssign);
				ps.setString(40,datepreparer);
				ps.setString(41, PSIN);
				ps.setString(42, firmsname);
				ps.setString(43, firmsEin);
				ps.setString(44, firmaddress);
				ps.setString(45, firmphone);
				
				
				i = ps.executeUpdate();
				ps = con.prepareStatement( "select firstname"); 
				
				System.out.println("Data Added Successfully");
				
				if(i>0){	
					return "output.xhtml";
			}else {
				return "invalid";
			}
				
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
			
			return "invalid";
		}
	
		public String retreive(){
			System.out.println("i am inside retrieve");
			PreparedStatement st = null;
		    
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/record1", "root", "password");
				System.out.println("I am in retrieve try");
				st = con.prepareStatement("select firstname,lastname,ssn,firstName2,lastname2,spousessn,address,aptno,city,foreigncountryname,foriegnprovince,foriegnpostalcode,wages,taxableinterest,unemployment,adjustedgrossincome,filingjointly,taxableincome,fedralincome,EIC,nontaxable,totalpayments,taxtable,refund,routingnumber,accountnumber,amountowe,designeesname,phoneno,pin,date,occupation,daytimephonenumber,spousesign,datenew,spouseoccupation,sentpin,preparersname,preparerssign,datepreparer,PSIN,firmsname,firmsEin,firmaddress,firmphone from user4 where firstname = '"+firstname+"'");
				System.out.println("I am in retrieve after");
				ResultSet r1 = st.executeQuery();
				System.out.println("Data ");
			     if(r1.next()) {

			
			    	 this.firstname=r1.getString("firstname");
			    	 this.lastname=r1.getString("lastname");
			    	 this.ssn=r1.getString("ssn");
			    	 this.firstName2=r1.getString("firstName2");
			    	 this.lastname2=r1.getString("lastname2");
                                 this.spousessn=r1.getString("spousessn");
			    	 this.address=r1.getString("address");
			    	/* System.out.println("Fname"+this.firstname);
			    	 System.out.println("Lname"+this.lastname);
			    	 System.out.println("ssn"+this.ssn);
			    	 System.out.println("firstName2"+this.firstName2);
			    	 System.out.println("lastname2"+this.lastname2);
			    	 System.out.println("spousessn"+this.spousessn);*/
			    	 this.aptno=r1.getString("aptno");
			    	 this.city=r1.getString("city");
			    	 this.foreigncountryname=r1.getString("foreigncountryname");
			    	 this.foriegnprovince=r1.getString("foriegnprovince");
			    	 this.foriegnpostalcode=r1.getString("foriegnpostalcode");
			    	 this.wages=r1.getString("wages");
			    	 this.taxableinterest=r1.getString("taxableinterest");
			    	 this.unemployment=r1.getString("unemployment");
			    	 this.adjustedgrossincome=r1.getString("adjustedgrossincome");
			    	 this.filingjointly=r1.getString("filingjointly");
			    	 this.taxableincome=r1.getString("taxableincome");
			    	 this.fedralincome=r1.getString("fedralincome");
			    	 this.EIC=r1.getString("EIC");
			    	 this.nontaxable=r1.getString("nontaxable");
			    	 this.totalpayments=r1.getString("totalpayments");
			    	 this.taxtable=r1.getString("taxtable");
			    	 this.refund=r1.getString("refund");
			    	 this.routingnumber=r1.getString("firstname");
			    	 this.accountnumber=r1.getString("accountnumber");
			    	 this.amountowe=r1.getString("amountowe");
			    	 this.designeesname=r1.getString("designeesname");
			    	 this.phoneno=r1.getString("phoneno");
			    	 this.pin=r1.getString("pin");
			    	 this.date=r1.getString("date");
			    	 this.occupation=r1.getString("occupation");
			    	 this.daytimephonenumber=r1.getString("daytimephonenumber");
			    	 this.spousesign=r1.getString("spousesign");
			    	 this.datenew=r1.getString("datenew");
			    	 this.spouseoccupation=r1.getString("spouseoccupation");
			    	 this.sentpin=r1.getString("sentpin");
			    	 this.preparersname=r1.getString("preparersname");
			    	 this.preparerssign=r1.getString("preparerssign");
			    	 this.datepreparer=r1.getString("datepreparer");
			    	 this.PSIN=r1.getString("PSIN");
			    	 this.firmsname=r1.getString("firmsname");
			    	 this.firmsEin=r1.getString("firmsEin");
			    	 this.firmaddress=r1.getString("firmaddress");
			    	 this.firmphone=r1.getString("firmphone");
			    	 
			    	 
			    	 
			    	 
			    	 
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
					st.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			return null;
		    
		    

		}
	
		//update username set balance='"+deposit+"' where username='"+name+"'"
		public String update(){
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
				System.out.println("i am inside update");
				String sql = "update user4 set lastname='"+lastname+"',ssn='"+ssn+"',firstName2='"+firstName2+"',lastname2='"+lastname2+"',spousessn='"+spousessn+"',address='"+address+"',aptno='"+aptno+"',city='"+city+"',foreigncountryname='"+foreigncountryname+"',foriegnprovince='"+foriegnprovince+"',foriegnpostalcode='"+foriegnpostalcode+"',wages='"+wages+"',taxableinterest='"+taxableinterest+"',unemployment='"+unemployment+"',adjustedgrossincome='"+adjustedgrossincome+"',filingjointly='"+filingjointly+"',taxableincome='"+taxableincome+"',fedralincome='"+fedralincome+"',EIC='"+EIC+"',nontaxable='"+nontaxable+"',totalpayments='"+totalpayments+"',taxtable='"+taxtable+"',refund='"+refund+"',routingnumber='"+routingnumber+"',accountnumber='"+accountnumber+"',amountowe='"+amountowe+"',designeesname='"+designeesname+"',phoneno='"+phoneno+"',pin='"+pin+"',date='"+date+"',occupation='"+occupation+"',daytimephonenumber='"+daytimephonenumber+"',spousesign='"+spousesign+"',datenew='"+datenew+"',spouseoccupation='"+spouseoccupation+"',sentpin='"+sentpin+"',preparersname='"+preparersname+"',preparerssign='"+preparerssign+"',datepreparer='"+datepreparer+"',PSIN='"+PSIN+"',firmsname='"+firmsname+"',firmsEin='"+firmsEin+"',firmaddress='"+firmaddress+"',firmphone='"+firmphone+"' where firstname = '"+firstname+"'" ;
                                
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
				if(i>0){	
					return "updatesuccess.xhtml";
			}else {
				return "invalid";
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
			return null;
			
			
		}
	
		public String add1()
		{
			System.out.println("i am inside add1");
			int ii = 0;

			
				PreparedStatement ps = null;
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/record1", "root", "password");
					String sql = "INSERT INTO register(UserName, FirstName,LastName,password,EMail,DOB,Address1,PhoneNo,City123,State,Country) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
					ps= con.prepareStatement(sql); 
					ps.setString(1, UserName);
					ps.setString(2, FirstName);
					ps.setString(3, LastName);
					ps.setString(4,password );
					ps.setString(5, EMail);
					ps.setString(6, DOB);
					ps.setString(7, Address1);
					ps.setString(8, PhoneNo);
					ps.setString(9, City123);
					ps.setString(10, State);
					ps.setString(11, Country);
					
					
					ii = ps.executeUpdate();
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
				
					return "invalid.xhtml";
				
			}

		
		
}

	
