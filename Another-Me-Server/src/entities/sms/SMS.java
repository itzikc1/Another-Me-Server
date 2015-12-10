package entities.sms;

import java.sql.Date;
import java.util.ArrayList;
import entities.Task.Task;

public class SMS {
	SmsTemplates SmsTamplates;
	String reciver;
	StringBuilder msg;
	int senderId;// personId
	Date DateTimeSend;
}
