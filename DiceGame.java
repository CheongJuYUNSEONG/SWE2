package DiceGameProgram;
import java.util.Scanner;
public class DiceGame {
	int fv1=0;
	int fv2=0;
	int fv3=0;
	int fv4=0;
	Player p1 = new Player();
	Player p2 = new Player();
	Dice d1 = new Dice();
    Dice d2 = new Dice();
	DiceGame(){
		String name;
		Scanner in = new Scanner(System.in);
		System.out.println("사용자1 이름 입력");
		name = in.next();
		p1.setName(name);
		System.out.println("사용자2 이름 입력");
		name = in.next();
		p2.setName(name);
		while(true) {
			System.out.println("1.경기시작 2.프로그램종료");
			int a = in.nextInt();
			switch(a) {
				case 1:
					Replay();
					Play();
					Scoreboard();
					break;
				case 2:
					System.exit(1);
				default:
					System.out.println("다시 입력");
			}
		}
	}
	void Play() {
	    d1.roll();
	    d2.roll();
	    fv1 = d1.getFaceValue();
	    fv2 = d2.getFaceValue();

	    d1.roll();
	    d2.roll();
	    fv3 = d1.getFaceValue();
	    fv4 = d2.getFaceValue();

	    System.out.println("Player 1의 주사위 값: " + fv1 + ", " + fv2);
	    System.out.println("Player 2의 주사위 값: " + fv3 + ", " + fv4);

	    int sum1 = fv1 + fv2;
	    int sum2 = fv3 + fv4;

	    if (sum1 == sum2) {
	        int higherValue1 = Math.max(fv1, fv2);
	        int higherValue2 = Math.max(fv3, fv4);
	        if (higherValue1 > higherValue2) {
	            p1.setWin(p1.getWin() + 1);
	            System.out.println(p1.getName() + "가 승리!");
	        } else if (higherValue1 < higherValue2) {
	            p2.setWin(p2.getWin() + 1);
	            System.out.println(p2.getName() + "가 승리!");
	        } else {
	            System.out.println("무승부!");
	        }
	    } else if (sum1 > sum2) {
	        p1.setWin(p1.getWin() + 1);
	        System.out.println(p1.getName() + "가 승리!");
	    } else {
	        p2.setWin(p2.getWin() + 1);
	        System.out.println(p2.getName() + "가 승리!");
	    }
	}
	void Replay() {
		fv1=0;
		fv2=0;
		fv3=0;
		fv4=0;
	}
	void Scoreboard() {
	    int p1Wins = p1.getWin();
	    int p2Wins = p2.getWin();
	    System.out.println(p1.getName() + "의 승리 횟수: " + p1Wins);
	    System.out.println(p2.getName() + "의 승리 횟수: " + p2Wins);
	}
}
