package factory;


import user.User;

import user.UserLT;
public class FactoryB implements Factory{
public User produceRecord() {
	return new UserLT();
}
}