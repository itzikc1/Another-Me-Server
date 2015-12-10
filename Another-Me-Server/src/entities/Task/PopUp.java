package entities.Task;

import java.sql.Date;

import entities.person.Person;
import entities.sms.SMS;

public class PopUp {
	
	PopUpTemplates template;
	String text;
	boolean triggerSms;
	Date DateTimeSend;
	SMS sms;
}
