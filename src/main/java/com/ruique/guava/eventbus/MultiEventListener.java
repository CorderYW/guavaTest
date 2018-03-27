package com.ruique.guava.eventbus;

import com.google.common.eventbus.Subscribe;

public class MultiEventListener {

	   @Subscribe
	   public void listen(OrderEvent event){
	       System.out.println("MultiEventListener OrderEvent receive msg: "+event.getMessage());
	   }

	   @Subscribe
	   public void listen(String message){
	       System.out.println("MultiEventListener String receive msg: "+message);
	   }
	}