package entities.Task;

import java.sql.Date;
import java.util.ArrayList;

import entities.sms.SMS;

public class Task {
SMS sms;
Date taskDate;
Date endTimeDate;
TaskType taskType;
String taskText;
ArrayList<PopUp> popUpMsgs;
}
