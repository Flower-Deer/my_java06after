package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 com = new 컴퓨터(30000, "S사", 500);
		System.out.println(com.가격);
		System.out.println(com.모니터크기);
		System.out.println(com.제조회사);
		
		System.out.println(com);
		//com에는 주소가들어감
		//컴퓨터 class에 toString() 메서드 생성
		// ->주소 프린트 시 toString 메서드가 자동 호출
		// ->return한 스트링을 주소대신 프린트 해준다.
		
		컴퓨터 com2 = new 컴퓨터(50000, "A사", 460);
		System.out.println(com2.가격);
		System.out.println(com2.모니터크기);
		System.out.println(com2.제조회사);
	}

}
