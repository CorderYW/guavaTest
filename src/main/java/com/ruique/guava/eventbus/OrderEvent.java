package com.ruique.guava.eventbus;

//Guava ����-����ģʽ�д��ݵ��¼�,��һ����ͨ��POJO��
public class OrderEvent {  //�¼�
   private String message;

   public OrderEvent(String message) {
       this.message = message;
   }

   public String getMessage() {
       return message;
   }
   
    //branch yeweiss
   
   
}