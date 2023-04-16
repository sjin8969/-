import java.time.Period; //기간 정보 클래스
import java.time.LocalDate; //날짜 정보 클래스
import java.util.Scanner; //입력 클래스

public class age {
	public static void main(String[] args) {
		System.out.println(LocalDate.now()); //현재 날짜 출력
		System.out.println("만 나이를 계산합니다.");
		man();
	}
	public static void man(){
		Scanner scanner = new Scanner(System.in); //객체 생성
		System.out.println("Year: ");
		int year = scanner.nextInt();
		System.out.println("Month: ");
		int month = scanner.nextInt();
		System.out.println("Day: ");
		int day = scanner.nextInt();

		LocalDate bd = LocalDate.of(year, month, day);
		LocalDate cd = LocalDate.now();
		Period p = Period.between(bd, cd);
		int age = p.getYears();

		System.out.printf("만 나이는 %d세 입니다.", age);
	}
}