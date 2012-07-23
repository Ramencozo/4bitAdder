// 全加算器クラス
// 半加算器二個、OR回路一個
// 詳しくはググってくだされ
public class FullAdder{

	HalfAdder ha01;
	HalfAdder ha02;
	
	OR orGate;
	
	boolean sum;
	boolean carryOut;
	
	public FullAdder() {
		ha01 = new HalfAdder();
		ha02 = new HalfAdder();
		
		orGate = new OR();

		sum = false;
		carryOut = false;
	}
	
	public void setInput(boolean inputA, boolean inputB, boolean carry){
		ha01.setInput(inputA, inputB);
		
		ha02.setInput(ha01.getSum(), carry);
		
		orGate.setInput(ha01.getCarry(), ha02.getCarry());
		
		carryOut = orGate.getOutput();
		sum = ha02.getSum();
	}
	
	public boolean getSum(){
		return sum;
	}
	
	public boolean getCarryOut(){
		return carryOut;
	}
}
