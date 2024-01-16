package javaUtil;

public class MusicBox {
	
	public void playMusicA() {
		for(int i = 0; i < 10; i++) {
			System.out.println("drop the beat!");
			
			try {
				Thread.sleep((int)(Math.random()*1000));
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
