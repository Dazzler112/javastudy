package study.C20230325;

public class JSPEnhancedForThreadIODataSocket {
	static int a;//보통 이렇게 밖에서 static으로 빼주면 전역변수로 선언하겠다
	public static void main(String[] args) {
		//enhanced for - 하나씩 올릴때 사용 (- 연산등은 불가)
		//그리고 어디에 담아져있는값(배열) 등을 사용할때 사용
		String[] arr = {"1","2","3","4","5"};
		for(String s :arr) {//<--enhanced for문 조건은 변수처럼 사용하면 된다
			//arr 변수를 하나씩 출력하려면 타입이 String이니까 String으로 해야겠지?
			System.out.println(s);
		}
		
		//제너릭 타입은 처음 타입을 뭘로 줄지 애매할때 사용 나중에 정해지면 해당타입으로 교체해 줘야 한다
		//wildcard 같은경우는 현업에서 굉장히 비효율적이고 대다수 안쓸 경우가 많음
		//(해석도 뭣같고 제너릭파라미터 주는것도 그런데 거기에 ? super XX ->이건 꿀밤 맞을 행동 <?> 이것도 사용시 꿀밤맞는다 )
			
		//Exception
		try {
			int[] arra  = {};
			for(int i = 0; i < arra.length;i++) {
				System.out.println(arra[i]);
			}
		}
		catch(NullPointerException e){
			System.out.println("프로그램종료 or nullpint블라블라");
			//이렇게 오류를 적는게 아니라 말그대로 exception발생했으면 오류내용과 후속조치 내용등을 적어줘야함
			
			//이렇게 오류뜨면 서버가 작동을 안하고 있을건대 사용자들은 404오류 같은거 밖에 안보일건대 계속 두고 있을거냐?
			//후속조치를 적어줘야 한다 arra라는 변수가 null값이니까 
			int[] arra = {1,2,3,4,5};
			
			for(int i = 0; i < arra.length;i++) {
				System.out.println(arra[i]);
			}
			//이런식으로 후속조치를 취해줘야 catch지 그냥 서버가
			//뒤진채로 놔둘거냐?
		}
		//쓰레드 멀티쓰레드시 서로 다른 작업할때 용이
		//ex)메신저 보낼때 한작업은 보내는 작업하고 한작업은 저장하는작업
		
		
		//data in out의 기준? 그냥 키보드 인풋역할 그럴 받아서 보여주는 모니터 출력 콘센트 꽃은 플러그? 인풋역할 거기에 꽃혀진 콘센트 출력역할 
		//더 쉽게 표현할 수 있는 방법은 없는듯
		
		//소켓도 일방적으로 데이터를 주려고 하는 경우에 사용
		//무슨말이냐? ex) 예를들어 메신저 나는 받을 생각이 없는대
		//상대방이 나한태 메신저 보내면 내허락 없이 보내져지잖아 그런경우임
		//회사마다 쓸수도 있고 안쓸수도 있음 일방적으로 데이터를 주는경우에 사용해서 
	}
}

//JSP에 대한 역사 (알면 후에 후임이나 다른사람들한태 지식을 뽑낼수 있다)

//JSP/PHP/ASP => 태생이 짬뽕 (P3형제)
//웹+백엔드 다 때려박으니 속도는빠름 //문제가 발생하니 업무를나눴다  //mvc패턴 jsp2가 spring아니냐? 엄연히 틀린말!!!
//JSP MODEL1(유지보수↓, 개발속도↑) => FRONT / BACKEND => JSP MODEL2(MVC) => SPRING FRAMEWORK MVC패턴
//
//JSP(FRONT), SPRING(BACKEND -> JAVA)
//
//WEB SERVER => 정적이냐?  //웹만 띄워주냐? (html css javascript 내용 정도만 보여주고 아무런 동작이 없다)
//
//AWS SERVER => 동적이냐?  //앱서버 - 개인정보등 적어서 서버에서 무언가 주고 받고 필요할때 앱서버 작동함

//웹만 보여준다 고객 웹사이트 접속 - 웹서버의 웹부분만 띄워서 보여줌 
//추후에 개인정보등 데이터베이스에 주고 받는 동작이 필요할거 같다 웹서버 뒤편의 앱서버가 작동함 현제 앱서버 만으로 다 동작하는 기능도 사용중이다