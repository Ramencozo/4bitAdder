public class HalfAdder{
		
	EXOR exOrGate;
	AND andGate;
	
	boolean sum;
	boolean carry;
	
	public HalfAdder() {
		exOrGate = new EXOR();
		andGate = new AND();
		
		sum = false;
		carry = false;
	}
	
	public void setInput(boolean inputA, boolean inputB){
		exOrGate.setInput(inputA, inputB);
		andGate.setInput(inputA, inputB);
		
		sum = exOrGate.getOutput();
		carry = andGate.getOutput();
	}
	
	public boolean getSum(){
		return sum;
	}
	
	public boolean getCarry(){
		return carry;
	}
}
