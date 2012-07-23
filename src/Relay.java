// 継電器(リレー)クラス
// コイルが一個、接点が一個の想定
// 励磁状態または接点の接続/切断はbooleanで定義
// solenoidState: コイルが励磁状態か否か(励磁状態ならtrue)
// switchState: 接点が接続されているか否か(接続されていたらtrue)
// electorifyToCoil(boolean)でコイルに電流を流す。電流流したらswitchStateがtrueに。
// ソフトウェア的に見ると無駄の無駄ですが、一応リレー意識してるソレってことで勘弁
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
