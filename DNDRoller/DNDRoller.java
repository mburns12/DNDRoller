import java.util.*;
//DNDRoller us used to roll any amount of any face dice, to ensure equal and rondom rolling.
public class DNDRoller{
	public static void main (String[] args){
		//DiceNum is the amount of dice you roll
		int DiceNum = 0;
		//FaceNum is the number of faces of a dice
		int FaceNum = 0;
		//RollVal is going to be the resulting randomly generated number of the roll
		int RollVal = 0;
		int i = 0;
		//RollScan takes your input for dice and face numbers
		Scanner RollScan = new Scanner(System.in);
		//SideNumber is the random generator that creates your roll value
		Random SideNumber = new Random();

		System.out.println("How many Dice (of one face) do you want to roll?");
		DiceNum = RollScan.nextInt();

		System.out.println("How many faces do these dice have?");
		FaceNum = RollScan.nextInt();

		System.out.println("____________");
		for(i = 0; i < DiceNum; i++){
			RollVal = SideNumber.nextInt(FaceNum)+1;
			//The rolls are numbered to make reading easy.
			System.out.println((i+1)+")"+RollVal);
		}
	}
}
