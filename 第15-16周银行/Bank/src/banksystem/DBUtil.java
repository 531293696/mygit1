package banksystem;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Set;
public class DBUtil {
	private static DBUtil instance = null;
	private HashMap<String,User> users = new HashMap<String,User>();
	
	private DBUtil() {
		User u1 = new User();
		u1.setCardId("1001");
		u1.setCardPwd("123456");
		u1.setUserName("张三");
		u1.setCall("110");
		u1.setAccount(1000);
		users.put(u1.getCardId(),u1);
		
		User u2 = new User();
		u2.setCardId("1002");
		u2.setCardPwd("123456");
		u2.setUserName("李四");
		u2.setCall("120");
		u2.setAccount(1000);
		users.put(u2.getCardId(),u2);
		
		User u3 = new User();
		u3.setCardId("1003");
		u3.setCardPwd("123456");
		u3.setUserName("王五");
		u3.setCall("119");
		u3.setAccount(1000);
		users.put(u3.getCardId(),u3);
	}
	
	private void getUsersFromInputStream(String isName){
		try{
			FileInputStream fs=new FileInputStream(isName);
			byte[] content=new byte[1204];
			int i=0;
			int conInteger=0;
			while(true){//此处仅仅是打印读出来的行
				try{
					conInteger=fs.read();
				} catch (IOException e){
					e.printStackTrace();
				}
				if(-1==conInteger){
					break;
				}else if('\r'==(char)conInteger||'\n'==(char)conInteger){
					try{
						this.processUserString(new String(content,"GBK").trim());
						i=0;
					} catch(UnsupportedEncodingException e){
						e.printStackTrace();
					}
					continue;
				}
				else{
					content[i]=(byte)conInteger;
					i++;
				}
			}
			fs.close();
	}
		catch(Exception e){
			}
		}
	public void processUserString(String userString){
		String [] userFields=userString.split(",");
		User u=new User();
		u.setCardId(userFields[0]);
		u.setCardPwd(userFields[1]);
		u.setUserName(userFields[2]);
		u.setCall(userFields[3]);
		u.setAccount(Integer.parseInt(userFields[4]));
		users.put(u.getCardId(), u);
	}
	
	public static DBUtil getInstance() {
		if(instance ==null) {
			synchronized(DBUtil.class) {
				if(instance==null) {
					instance = new DBUtil();
					
				}
			}
		}
		return instance;
	}
	public User getUser(String cardId) {
		User user = (User) users.get(cardId);
		return user;
	}
	public HashMap<String,User>getUsers(){
		return users;
	}

	
	//增加一个用户
	public void addUer(User u){
		users.put(u.getCardId(),u);
	}
	//存盘操作
		public void update() {
			Set<String> userSet=users.keySet();
			StringBuffer uStringBuffer=new StringBuffer();
			for(String cardId:userSet) {
				User u=(User)users.get(cardId);
				String uString=u.getCardId()+","
						+u.getCardPwd()+","
						+u.getUserName()+","
						+u.getCall()+","
						+u.getAccount()+"\r\n";
				uStringBuffer.append(uString);
			}
			putUsersToFile(uStringBuffer.toString(),"D:\\user.dat");
		}
		//写入文件的函数
		private void putUsersToFile(String uString,String osName) {
			try {
				FileOutputStream fos = new FileOutputStream(osName);
				try {
					fos.write(uString.getBytes("GBK"));
				//	System.out.println(uString);
				}catch(UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				fos.close();
			}catch(Exception e) {
				
			}
			
		}
	
		
		
}
