package vertex;

public class MainGame {


	public static void main(String[] args) {
		CdProjektRed cd = new CdProjektRed();
		Ubisoft ubic = new Ubisoft();
		Valve volovo = new Valve();


		cd.setCategory("AAA");
		ubic.setCategory("AA");
		volovo.setCategory("A");

		cd.willBeReleased();
		ubic.willBeReleased();
		volovo.willBeReleased();


	}
}
