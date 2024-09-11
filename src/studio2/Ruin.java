package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startAmount = 2;
		int myGain = startAmount;
		double winChance = 0.7;
		int winLimit = 10;
		int success = 0;
		int ruin = 1;
		int simDay = 0;
		
		for (int totalSim = 1; totalSim <= 365; totalSim++) {
			boolean breakLoop = true;
			simDay++;
			int gameCount = 0;
			while(breakLoop == true) {
				gameCount++;
				double game = Math.random();
				if (game < winChance) {
					myGain++;
					if (myGain == winLimit) {
						System.out.println("Day " + simDay + ": " + gameCount + " success");
						success++;
						breakLoop = false;
					}
				}
				else {
					myGain--;
					if (myGain==0) {
						System.out.println("Day " + simDay + ": " + gameCount + " ruin");
						ruin++;
						breakLoop = false;
					}
				}
			}
			myGain = startAmount;
		}
		
		System.out.println("success: " + success);
		System.out.println("ruin: " + ruin);
		double successPer = success*100/365.0;
		double ruinPer = ruin*100/365.0;
		System.out.println("succes percentage: " + successPer + "%");
		System.out.println("ruin percentage: " + ruinPer + "%");
		System.out.println(success*20 - ruin*30); //Gain/Loss over year
	}

}
