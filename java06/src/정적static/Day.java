package 정적static;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int total_time;
	
	public Day(String doing, int time, String location) {
		count++;
		total_time += time; //total_time = total_time + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	
	public static double getAvg() {
		return total_time / (double)count;
	}
	
	@Override
	public String toString() {
		return "나의 하루 [하는 일=" + doing + ", 한 시간=" + time + ", 위치=" + location + "]";
	}
	
}