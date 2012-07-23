// AND回路クラス
// リレー二個使ってAND出力
// イメージ的には下記
// (電源+)―[relay01のswitch]―[relay02のswitch]―(outputF)
// switchどっちもtrueでないと出力出ないよ的な感じで
public class AND{
	
	Relay reley01;
	Relay reley02;
	
	boolean outputF;
	
	public AND() {
		reley01 = new Relay();
		reley02 = new Relay();
		
		outputF = false;
	}
	
	public void setInput(boolean inputA, boolean inputB){
		reley01.electorifyToCoil(inputA);
		reley02.electorifyToCoil(inputB);
		
		if(reley01.getSwitchState() && reley02.getSwitchState()){
			outputF = true;
		}else {
			outputF = false;
		}
	}
	
	public boolean getOutput(){
		return outputF;
	}
}
