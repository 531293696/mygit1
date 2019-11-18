import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.*;

import user.User;
import utility.*;
import factory.*;
public class TelcomUser {
	private String phoneNumber;
	private String callTo;
	private StringBuffer communicationRecords;
                User ZUser;
	public TelcomUser(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.communicationRecords = new StringBuffer();
	
	Factory factory=(Factory)XMLUtil.getBean();
	ZUser=factory.produceRecord();
	}
	
	//模拟通话记录的生成
	void generateCommunicateRecord() {
		//随机生成通话记录数目
		int recordNum = new Random().nextInt(10);
		for(int i = 0; i <= recordNum; i++) {
                                                callTo=getcallToPhoneNumber();
			long timeStart = System.currentTimeMillis() - new Random().nextInt(36000000);
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			this.communicationRecords.append(this.phoneNumber + "," + timeStart +"," + timeEnd + "," + this.callTo+";");
				
		}
	}
	

	
	//计费方法
	private String accountFee(long timeStart, long timeEnd) {
		
		double feePerMinute = ZUser.feePerMinute();
	
		int minutes = Math.round((timeEnd - timeStart)/60000);
		double feeTotal = feePerMinute * minutes;
		return String.format("%.4f", feeTotal);
	}
	private String getcallToPhoneNumber() {
		return "1380372" + String.valueOf(new Random().nextInt(10))
			 + String.valueOf(new Random().nextInt(10))
			 + String.valueOf(new Random().nextInt(10))
			 + String.valueOf(new Random().nextInt(10));
	}
	
	//打印通话记录
	void printDetails() {
	
		String allRecords = this.communicationRecords.toString();
		String [] recordArray = allRecords.split(";");
		for(int i = 0; i < recordArray.length; i++) {
			System.out.println("---------通话记录分割线---------");
			String [] recordField = recordArray[i].split(",");
			System.out.println("主叫：" + recordField[0]);
			System.out.println("被叫：" + recordField[3]);
			Date timeStart = new Date(Long.parseLong(recordField[1]));
			Date timeEnd = new Date(Long.parseLong(recordField[2]));
			DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
			//DateFormat
			/*
			System.out.println("通话开始时间：" + mediumFormat.format(timeStart));
			System.out.println("通话结束时间：" + mediumFormat.format(timeEnd));
			*/
			
			//SimpleDateFormat			
			System.out.println("通话开始时间：" + simpleDateFormat.format(timeStart));
			System.out.println("通话结束时间：" + simpleDateFormat.format(timeEnd));
			
			System.out.println("计费：" 
					+ accountFee(Long.parseLong(recordField[1]), Long.parseLong(recordField[2]))
					+ " 元。");
		}
	}
}
