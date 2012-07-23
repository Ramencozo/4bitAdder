public class Relay{
	
	boolean solenoidState;
	boolean switchState;
	
	public Relay() {
		solenoidState = false;
		switchState = false;
	}
	
	public void electorifyToCoil(boolean state) {
		solenoidState = state;
		switchState = solenoidState;
	}
	
	public boolean getSolenoidState(){
		return solenoidState;
	}

	public boolean getSwitchState(){
		return switchState;
	}
}
