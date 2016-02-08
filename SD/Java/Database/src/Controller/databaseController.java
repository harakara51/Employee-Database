package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;

import Data.DatabaseDAO;
import Data.employeeBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class databaseController
{
	
	private static String toEmail;
	private static String emailBody;
	public static String fields;
	private DatabaseDAO database;
	private ArrayList<ArrayList<String>> table = new ArrayList<>();
	private ArrayList<String> tableHead = new ArrayList<>();



	
	

	@RequestMapping(path = "database.do", params = "fields_Choice", method = RequestMethod.GET)
	public ModelAndView searchByUserQuery(@RequestParam("fields_Choice") String Fields2, @RequestParam("table") String tables) throws ClassNotFoundException, SQLException
	{
		
		fields= "SELECT " + Fields2 + " FROM " + tables;
		System.out.println(fields);
		ModelAndView mv = new ModelAndView();
		
		database = new DatabaseDAO(Fields2, tables);
		table =database.openDatabaseConnection();
		tableHead = table.get(0);
		System.out.println(tableHead.toString());
	table.remove(0);
		mv.setViewName("results.jsp");
		mv.addObject("fields", Fields2);
		mv.addObject("TABLE", table);
		mv.addObject("tableHeader", tableHead);
		return mv;
		
	}
	
	@RequestMapping(path = "Advdatabase.do", params = "fieldsChoice", method = RequestMethod.POST)
	public ModelAndView searchADVQuery(@RequestParam("fieldsChoice") String Fields2) throws ClassNotFoundException, SQLException
	{
		System.out.println(Fields2);
		System.out.println("in adv search method");
		
		ModelAndView mv = new ModelAndView();
		
		database = new DatabaseDAO();
		table =database.advSearch(Fields2);
		tableHead = table.get(0);
		table.remove(0);
		mv.setViewName("results.jsp");
		mv.addObject("fields", Fields2);
		mv.addObject("TABLE", table);
		mv.addObject("tableHeader", tableHead);
		return mv;
		
	}
	
	
	
	
	
	@RequestMapping(path = "updateDatabase.do", method = RequestMethod.GET)
	public ModelAndView updateDatabase(employeeBean employee, @RequestParam("database") String database) throws ClassNotFoundException, SQLException
	{
		fields= "INSERT INTO " + database + employee.toquery() ;
		System.out.println(fields);
		System.out.println("inside method to create new employees");
		DatabaseDAO database2 = new DatabaseDAO();	
		
		database2.insertToDatabase(fields);
	
		ModelAndView mv = new ModelAndView();
	
		mv.setViewName("update.jsp");
		
		return mv;
		
	}
	
	@RequestMapping(path = "updateDatabase.do", method = RequestMethod.POST)
	public ModelAndView updateDatabaseADV(@RequestParam("fieldsChoice") String query) throws ClassNotFoundException, SQLException
	{
		System.out.println("in adv search method");
		DatabaseDAO database2 = new DatabaseDAO();	
		
		database2.insertToDatabase(query);
	
		ModelAndView mv = new ModelAndView();
	
		mv.setViewName("update.jsp");
		
		return mv;
		
	}

	
	
	public static void SendEmail ()
	{
		
	      String to = toEmail;

	     
	      String from = "TranslatedNovels.com";//change accordingly
	      final String username = "hafu52@gmail.com";//change accordingly
	      final String password = "51Keralagon53#";//change accordingly

	  
	      String host = "smtp.gmail.com";

	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "587");

	      // Get the Session object.
	      Session session = Session.getInstance(props,
	      new javax.mail.Authenticator() {
	         protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(username, password);
	         }
	      });

	      try {
	         // Create a default MimeMessage object.
	         Message message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.setRecipients(Message.RecipientType.TO,
	         InternetAddress.parse(to));

	         // Set Subject: header field
	         message.setSubject("Your reading list");

	         // Now set the actual message
	         message.setText("Hello, below is your reading list from translated Novels.com \n "
	        		 
	            + emailBody + "\n Thank you and have a good day");

	         // Send message
	         Transport.send(message);

	         System.out.println("Sent message successfully....");

	      } catch (MessagingException e) {
	            throw new RuntimeException(e);
	      }
	   }
	}
	

