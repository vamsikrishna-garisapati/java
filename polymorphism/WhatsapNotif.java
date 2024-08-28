package com.polymorphism;
class Notification{
	public void sendNotification() {
		System.out.println("its a nrml message notification");
	}
}
class EmailNotification extends Notification{
	@Override
	public void sendNotification(){
		
	}
}
public class WhatsapNotif {

}
