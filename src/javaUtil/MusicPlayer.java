package javaUtil;

public class MusicPlayer extends Thread {
	int type;
	MusicBox musicBox;
	
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
}
