// OR回路クラス
// リレー二個使ってAND出力
// イメージ的には下記
//　　　　 ┏[relay01のswitch]┓
// (電源+)┫　　　　　　　　　┣(outputF)
//　　　　┗[relay02のswitch]┛
// switchどっちかがtrueなら出力出る的な感じで
public class OR{
	
	Relay reley01;
	Relay reley02;
	
	boolean outputF;
	
	public OR() {
		reley01 = new Relay();
		reley02 = new Relay();
		
		outputF = false;
	}
	
	public void setInput(boolean inputA, boolean inputB){
		reley01.electorifyToCoil(inputA);
		reley02.electorifyToCoil(inputB);
		
		if(reley01.getSwitchState() || reley02.getSwitchState()){
			outputF = true;
		}else {
			outputF = false;
		}
	}
	
	public boolean getOutput(){
		return outputF;
	}
}
