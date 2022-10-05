package 정적static;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("잠자기", 8, "집 침대");
		System.out.println(day1);
		System.out.println(Day.count);
		System.out.println("전체 시간>> " + Day.total_time + "시간");
		
		Day day2 = new Day("수업", 9, "집 책상");
		System.out.println(day2);
		System.out.println(Day.count);
		System.out.println("전체 시간>> " + Day.total_time + "시간");
		
		Day day3 = new Day("취미활동", 7, "바깥");
		System.out.println(day3);
		System.out.println(Day.count);
		System.out.println("전체 시간>> " + Day.total_time + "시간");
		System.out.println("평균 시간>> " + Day.getAvg() + "시간");
	}
}
