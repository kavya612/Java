package com.quinnox.basics.model;

public class CubeBean {
   private int num=0;
   public CubeBean(){
	   
   }
   public void setNum(int num){
	   this.num=num;
   }
   public int getNum(){
	   return (num*num*num);
   }
}
