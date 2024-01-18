package javaUtil;

//공유객체 MusicBox (=그네), Thread는 MusicPlayer(=아이들).
public class MusicBox { //하나의 객체 MusicBox를 여러개의 MusicPlayer가 사용한다.
	
	public synchronized void playMusicA() {
		for(int i = 0; i < 10; i++) {
			System.out.println("happy tunes!");
			
			try {
				Thread.sleep((int)(Math.random()*1000)); //1초 이하의 시간동안 10번 반복.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
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
			synchronized (this) {
				//메소드 전체에 sync붙이지 말고 특정 블록에만 추가시킴.
				System.out.println("cafe tunes!");
			}
					
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
synchronized: 조금이라도 빨리실행돼면 사용권을 얻게됌. (Monitoring lock)
 */
