package com.javalec.ex;

public class Pencil6BWithEraser extends Pencil6B implements Pencil{

	@Override
	public void use(){
		//super.use(); 이거는 사용할떄 extends 
		System.out.println("6B 굵기로 쓰이고, 지우개가 있습니다.");
	}
}
