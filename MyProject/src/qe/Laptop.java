package qe;

public class Laptop implements ISoundable {
	public void play() {
		
	}
	public void pause() {
		
	}
	public void stop() {
		
	}

}

abstract class MusicSystem implements ISoundable {  // if we cannot make abstruct class then it will show compilation error
	
}
 class SonyMusicPlayer extends MusicSystem { // here we have to override the methods if we extend.

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	 
 }