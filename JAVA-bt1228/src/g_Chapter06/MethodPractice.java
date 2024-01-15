package g_Chapter06;

// BaseballPlayer 클래스
class BaseballPlayer {

	// : 선수 이름(name), 타율(battingAverage), 홈런 수(homeRuns);
	// : 이름 - 문자열 , 타율 - 실수, 홈런 수 - 정수
	String name;
	double battingAverage;
	int homeRuns;
	// : 생성된 선수의 총 수(playerCount) - 모든 인스턴스에서 공유
	static int playerCount = 0;

	// 생성자
	// : 생성 시 선수의 이름, 타율, 홈런 수를 받아서 인스턴스 변수 초기화
	// : 생성 시 정적 변수를 후휘 증가(변수명 ++)
	public BaseballPlayer(String name, double battingAverage, int homeRuns) {
		this.name = name;
		this.battingAverage = battingAverage;
		this.homeRuns = homeRuns;
		playerCount++;
	}

	// 메서드
	// : updateStats: 선수의 타율과 홈런 수를 업데이트하는 메서드
	// : 매개변수로 newBattingAverage, newHomeRuns를 입력
	// : 타율 업데이트, 홈런 수 업데이트 (기존의 인스턴스 변수에 재할당)
	void updateStatu(double newBattingAverage, int newHomRuns) {
		battingAverage = newBattingAverage;
		homeRuns = newHomRuns;
	}
}

public class MethodPractice {

	public static void main(String[] args) {

		// BaseballPlayer 클래스로 야구선수 3명의 객체 생성
		// 총 생성된 선수의 수를 출력
		BaseballPlayer bp1 = new BaseballPlayer("이대호", 1.1, 2);
		BaseballPlayer bp2 = new BaseballPlayer("류현진", 12, 4);
		BaseballPlayer bp3 = new BaseballPlayer("강민", 1.3, 3);

		System.out.println(BaseballPlayer.playerCount);

	}

}
