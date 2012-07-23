// NOT回路クラス
// リレー一個使ってNOT出力
// イメージ的には下記
// (電源+)―[！relay01のswitch]―(outputF)
// 反転出力的な感じで。あとぶっちゃけ加算器の中でこのクラス使ってない件
public class NOT{
	
	Relay reley01;
	
	boolean outputF;
	
	public NOT() {
		reley01 = new Relay();
		
		outputF = false;
	}
	
	public void setInput(boolean inputA){
		reley01.electorifyToCoil(inputA);
		
		if(!reley01.getSwitchState()){
			outputF = true;
		}else {
			outputF = false;
		}
	}
	
	public boolean getOutput(){
		return outputF;
	}
}
