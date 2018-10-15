package com.tiger.behavior.templateMethod;

public class TestPaper {
	public void question1(){
		System.out.println("以下动漫请选择你喜欢？A 海贼王 B 妖精的尾巴 C 死神 D 火影忍者");
		System.out.println("答案是：" + answer1());;
	}
	public void question2(){
		System.out.println("以下海贼王人物你喜欢谁？ A 路飞 B 乔巴 C 索罗 D 娜美");
		System.out.println("答案是：" + answer2());;
	}
	public void question3(){
		System.out.println("以下选择题请选择？A B C D");
		System.out.println("答案是：" + answer3());;
	}
	
	public String answer1(){
		return "";
	};
	public String answer2(){
		return "";
	};
	public String answer3(){
		return "";
	};
}
