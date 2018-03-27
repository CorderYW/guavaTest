package com.ruique.guava.eventbus;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;


//���EventBus���͵���Ϣ�����Ƕ����߹��ĵĳ�֮ΪDead Event��
public class DeadEventListener {
	   boolean isDelivered=true;

	   @Subscribe
	   public void listen(DeadEvent event){
	       isDelivered=false;
	       System.out.println(event.getSource().getClass()+"  "+event.getEvent()); //sourceͨ����EventBus
	   }

	   public boolean isDelivered() {
	       return isDelivered;
	   }
	}