package javaUtil;

//공유객체 MusicBox (=그네), 아이들 (=Thread)
public class MusicBox {
	
	public void playMusicA() {
		for(int i = 0; i < 10; i++) {
			System.out.println("happy tunes!");
			
			try {
				Thread.sleep((int)(Math.random()*1000)); //1초 이하의 시간동안 10번 반복.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void playMusicB() {
		for(int i = 0; i < 10; i++) {
			System.out.println("sad tunes!");
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void playMusicC() {
		for(int i = 0; i < 10; i++) {
			System.out.println("cafe tunes!");
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
