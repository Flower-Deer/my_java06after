package 생성자;

public class 통장 {
	//멤버변수
	//class아래에 선언(class전체에 사용 가능, 전역변수)
	//글로벌 변수(global)
	String name;
	String ssn;//주민번호
	int money;
	
	//메서드 이름을 클래스 이름과 동일하게 void를 안씀
	//new 객체 생성시 입력값을 자동 초기화
	//객체 생성 시 필요한 값을 한정 시킬 수 있음.
	//생성자 메서드(메서드 생략) => 생성자(constructor)
	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}
}