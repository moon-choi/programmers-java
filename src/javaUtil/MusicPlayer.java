package javaUtil;

//사용자(아이들) MusicPlayer (=Thread)
public class MusicPlayer extends Thread {
	int type;
	MusicBox musicBox;
	
	//생성자 정의.
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}

	@Override
	public void run() {
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
