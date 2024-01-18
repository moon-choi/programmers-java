package javaUtil;

//Thread MusicPlayer (=아이들/사용자)
public class MusicPlayer extends Thread {
	int type;
	MusicBox musicBox; //타입이 MusicBox인 musicBox 필드.
	
	//생성자 정의.
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}

	@Override
	public void run() { //다른 흐름의 main 메소드 (MusicBoxRunner 안에서). 
		switch (type) {
		case 1:
			musicBox.playMusicA();
			break;

		case 2:
			musicBox.playMusicB();
			break;
			
		case 3:
			musicBox.playMusicC();
			break;
		}
	}
	
}
