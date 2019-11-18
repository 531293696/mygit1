package factory;


import user.UserYD;
import user.User;

public class FactoryA implements Factory{
public User produceRecord() {
	return new UserYD();
}
}