package study.C20230319;

import java.util.*;

public class ForIfObjectListMap {

	public static void main(String[] args) {
		int a = 0;
		System.out.println(++a); //바로 연산됨(1이 바로 출력)
		int b = 0;
		System.out.println(b++);//바로 연산 안되고 연산뒤 호출해야 올라감(부끄럼쟁이 뒤에 숨기고있음)
		System.out.println(b);
		
		//-------------------for-----------------------
		String[] arr = {"java", "css","html"};
		// 1. 변수초기화 2.조건       3.증감자
		for(int i = 0; i < arr.length; i++) //해당은 반복하게 만드는게 중요 조건문은 블록에다가 설정!!
			//for 문인대 완전 자동이여야겠지 내가 수동으로 <=5 이런식으로 쓰면 의미가 없겠지?
		{//해당 조건은 여기다가 쓰고 for문은 반복할수 있게만 신경!
			System.out.println(arr[i]);
		}
		
		//하나하나 작은거부터 시작해서 큰것으로 만들수 있게
		
		//-----------------if------------------------------
		//조건에 따라 달라진다 (추가 됨에 따라 nested를 사용할건지 추가할건지 선택이 필요)
		
		//예1)
		// 다음 문자열 2개가 있다 "멍멍멍" , "야옹"
		//문자열이 3이면 멍멍멍이 출력되고 2이면 야옹이 출력되게 (add 장난이 하도 많아서 5자이상은 입력 안되게
		//변수에 담아서 출력되게 해라
		
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		if(text.length() < 5) {//add조건
			
		if(text.length() >2) {
			String str1 = "멍멍멍";
			System.out.println(str1);
		}else{
			String str2 = "야옹";
			System.out.println(str2);
		}
		}
		//예2)
		//다음중 12이상이면 12이상이네 12미만이면 12가 안되네출력하시오 (add 15글자 이상이면 15글자 넘었네? 출력
		//변수를 하나만 사용하여 출력하시오
		String str3;
		if(text.length() > 15) {//add 부분
			str3 = "15글자 넘었네";
			System.out.println(str3);
		}else if(text.length() >= 12) {
			str3 = "12 이상이네";
			System.out.println(str3);
		}else {
			str3 = "12 가 안되네";
			System.out.println(str3);
		}
	
		//이런식으로 상황에 따라 nested를 할것인지 추가로 if문을 추가해줄것인지
		//상황에 따라 선택해 주어야 한다 부분으로 딱 끊어줄것이면 nested로 끊어주는게 답일수도 있고
		//추가로 출력해야 하는 부분이면 if문을 추가해야 할수 있다

//---------------------object-------------------------------
		//Objcet는 클래스의 최상위 클래스다 클래스를 상속받고 
		//있는 메소드등은 다 사용 가능

//------------------------List----------------------------		
		//List 는 Array를 더 쉽게 넣어서 사용 가능
		//가장 많이 사용 하는 메소드는 ArrayList
		List<String> list = new ArrayList<>();
		list.add("soccer");//0번
		list.add("baseball");//1번
		list.add("basketball");//2번
		
		//가져오는건 get으로 쉽게
		System.out.println(list.get(0));
		//array보다 쉽게 넣어서 사용 가능
		
		//이거보다 더쉽게 넣어서 사용 가능한 Map이라는 미친기능
		
		//------------------Map--------------------------
		//Map은 파라미터에 key 와 value로 이루어져 있음
		//key값으로 value값 불러오기 가능
		//value값으로 Object를 넣으면 다넣을수 있다 why?
		//object는 최상위 클래스니까 모두 대입 가능
		//Map의 대표적인 메소드는 HashMap
		Map<String,Object>map = new HashMap<>();
		map.put("javaval", "java");
		map.put("javaval", "spring");//같은키에 대입하면 마지막 대입한 값이 출력됨
		System.out.println(map.get("javaval"));
		//key는 말그대로 문따고 들어 갈 수있는 키 javaval이라는 문을 열수 있는키다
		//해당 키워드("javaval")를 사용하면 해당 값을 출력할수있다
		map.put("doubled", 3.14);//value를 object로 넣으니 실수도 가능 물론 int long 다 가능하다!
		
	}

}
