package InterfaceQuestion2;

public class Demo {
	static void perform(Game game) {//Interface reference
		game.play();
	}

	public static void main(String[] args) {
		Cricket cricket=new Cricket();//Instantiating class
		perform(cricket);
		Tennis tennis=new Tennis();//Instantiating class
		perform(tennis);
		FootBall football=new FootBall();//Instantiating class
		perform(football);
	}
}
