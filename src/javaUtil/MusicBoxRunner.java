package javaUtil;

public class MusicBoxRunner {

	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		MusicPlayer kang = new MusicPlayer(1, box);
		MusicPlayer kim = new MusicPlayer(2, box);
		MusicPlayer lee = new MusicPlayer(3, box);

		//thread가 가진 .start()메소드 사용.
		kang.start();
		kim.start();
		lee.start();
	}

}
