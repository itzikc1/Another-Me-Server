package entities.Task;

import java.sql.Date;
import java.util.ArrayList;

import entities.person.DefaultSettings;
import entities.sms.SMS;

public class Task {
	public final  static int CALENDARTASK=1;
	public final  static int APPTASK=2;

	int fromPlatform;// which platform the task camming
	Date taskDate;
	Date endTimeDate;
	TaskType taskType;// type of what the app need to do
	String taskText;
	ArrayList<PopUp> popUp;

}
