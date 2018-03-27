package com.ruique.guava;

import com.google.common.base.Optional;

public class OptionalTest{
	   public static void main(String[] args) {
	       Integer value1=null;
	       Integer value2=10;
	       /*����ָ�����õ�Optionalʵ����������Ϊnull�����ʧ�ܷ���absent()
	         absent()��������ȱʧ��Optionalʵ��
	        */
	       Optional<Integer> a=Optional.fromNullable(value1);
//	       Optional<Integer> b=Optional.of(value2); //���ذ��������ķǿ�����Optionalʵ��
	       Optional<Integer> b=Optional.fromNullable(value2); //���ذ��������ķǿ�����Optionalʵ��
	       System.out.println(sum(a,b));
	   }

	   private static Integer sum(Optional<Integer> a,Optional<Integer> b){
	       //isPresent():���Optional������null�����ã����ô��ڣ�������true
	       System.out.println("First param is present: "+a.isPresent()); 
	       System.out.println("Second param is present: "+b.isPresent());
	       Integer value1=a.or(0);  //����Optional������������,������ȱʧ,����ָ����ֵ
	       Integer value2=b.get(); //������������ʵ��,���������,ͨ���ڵ��ø÷���ʱ�����isPresent()�ж��Ƿ�Ϊnull
	       return value1+value2;
	   }
	}