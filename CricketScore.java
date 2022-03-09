class CricketMatch {

	int totalBall = 30;
	int run0, run1, run2, run3, run4, run6;
	float strikeRate;
	int totalRun;
	
	public void playAndCalculate() {
		for (int ball = 1; ball <= 30; ball++) {
			int run = (int) (Math.random() * 10);
			while (run == 5) {
				run = (int) (Math.random() * 10);
			}
			switch (run) {
			case 0:
				run0++;
				break;
			case 1:
				run1++;
				break;
			case 2:
				run2++;
				break;
			case 3:
				run3++;
				break;
			case 4:
				run4++;
				break;
			case 6:
				run6++;
				break;
			}
			totalRun += run;
		}
		strikeRate = totalRun / 30.0f;
	}

	public int getTotalBall() {
		return totalBall;
	}



	public int getRun0() {
		return run0;
	}



	public int getRun1() {
		return run1;
	}



	public int getRun2() {
		return run2;
	}



	public int getRun3() {
		return run3;
	}



	public int getRun4() {
		return run4;
	}



	public int getRun6() {
		return run6;
	}



	public float getStrikeRate() {
		return strikeRate;
	}



	public int getTotalRun() {
		return totalRun;
	}



	public void setTotalBall(int totalBall) {
		this.totalBall = totalBall;
	}



	public void setRun0(int run0) {
		this.run0 = run0;
	}



	public void setRun1(int run1) {
		this.run1 = run1;
	}



	public void setRun2(int run2) {
		this.run2 = run2;
	}



	public void setRun3(int run3) {
		this.run3 = run3;
	}



	public void setRun4(int run4) {
		this.run4 = run4;
	}



	public void setRun6(int run6) {
		this.run6 = run6;
	}



	public void setStrikeRate(float strikeRate) {
		this.strikeRate = strikeRate;
	}



	public void setTotalRun(int totalRun) {
		this.totalRun = totalRun;
	}



	public void displayResult() {
		System.out.println("Total Run = " + totalRun);
		System.out.println("Number of 0s = " + run0);
		System.out.println("Number of 1s = " + run1);
		System.out.println("Number of 2s = " + run2);
		System.out.println("Number of 3s = " + run3);
		System.out.println("Number of 4s = " + run4);
		System.out.println("Number of 6s = " + run6);
		System.out.println("Strike Rate = " + strikeRate);
	}
}




class CricketMatch2 {

	public static void main(String[] args) {
		CricketMatch [] matches=new CricketMatch[5];
		for(int inn=1;inn<=5;inn++) {
			matches[inn-1]=new CricketMatch();
		}
		for(CricketMatch match:matches) {
			match.playAndCalculate();
		}
		
		Assignment3 aa=new Assignment3();
		//Assign 3
		aa.calculate5MatchAvgStats(matches); 
		
	}

	private  void calculate5MatchAvgStats(CricketMatch[] matches) {
		int run0, run1, run2, run3, run4, run6;
		run0=run1=run2=run3=run4=run6=0;
		float avgScrOfLast5Match=0.0f;
		float avgStrOfLast5Match=0.0f;
		int totalRun=0;
		for(CricketMatch match:matches) {
			run0+=match.getRun0();
			run1+=match.getRun1();
			run2+=match.getRun2();
			run3+=match.getRun3();
			run4+=match.getRun4();
			run6+=match.getRun6();
			totalRun+=match.getTotalRun();
		}
		avgScrOfLast5Match=totalRun/5f;
		avgStrOfLast5Match=totalRun/(5*30f);
		System.out.println("Total Run = " + totalRun);
		System.out.println("Number of 0s = " + run0);
		System.out.println("Number of 1s = " + run1);
		System.out.println("Number of 2s = " + run2);
		System.out.println("Number of 3s = " + run3);
		System.out.println("Number of 4s = " + run4);
		System.out.println("Number of 6s = " + run6);
		System.out.println("Total Run " + totalRun);
		System.out.println("Avg Score = "+avgScrOfLast5Match);
		System.out.println("Strike Rate = " + avgStrOfLast5Match);
	}
	

}

public class CricketScore{

	public static void main(String[] args) {
		CricketMatch match= new CricketMatch();
		match.playAndCalculate();
		match.displayResult();
	}
}