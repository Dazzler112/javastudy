package study.C20230305;

class Test {
	private String test = "1"; //<- 초기화 (초기화 한다는 뜻)
	private String test2; //이건 선언
	final static String test3 = "asipdjiasadwjd"; //<- 상수 보통 현업에서 final static은 암호 걸어 놓을때 사용
												//저런식으로 암호 해제 하기 힘들게 만듬
	
	//getter setter -private를 아무나 접근할 수 없게 하기 위해 캡슐화한것
	public String getTest() {//private를 아무나 접근할 수 없게 하기 위해
		return test;		//캡슐화한것 public get set으로 메소드 생성하여
	}						//접근 가능하게 한다
	public void setTest(String test) {
		this.test = test;
	}
	
	Test(){//<-생성자 생성법
			// 생성자 생성 안해줘도 메인필드에 인스턴스 생성시 기본으로 
			//만들어준다 (default creator) 참조 1-1
	}
	
}
public class ClassicStudy {
	public static void main(String[] args) {
//순서대로 타입 변수명 new는 인스턴스화 한다는 코드 ()는생성자	
			Test t1 = new Test(); //<- 이과정은 인스턴스 한것 //참조 1-1
			
			t1.setTest("3");
			for (int i = 0; i <= 10; i++) { /*for문을잘 모르겠다 다음주에 다시 공부할것*/
				System.out.println(t1.getTest[i]);
			}
			
			System.out.println(t1.getTest());
	}
}
