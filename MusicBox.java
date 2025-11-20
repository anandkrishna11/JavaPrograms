package exam;

interface Media{
	void play();
	void stop();
	
	default void pause(){
		System.out.println("Media Paused!");
	}
	
	static void about() {
		System.out.println("This is a media interface.");
	}
}
interface AdvancedMedia extends Media{
	void nextTrack();
}

class MusicPlayer implements AdvancedMedia{
	public void play() {
		System.out.println("Started playing music.");
	}
	public void stop() {
		System.out.println("Music Stopped.");
	}
	public void nextTrack() {
		System.out.println("Moved to next track.");
	}
}

public class MusicBox {
	public static void main(String [] args) {
		MusicPlayer music1=new MusicPlayer();
		music1.play();
		music1.pause();
		music1.nextTrack();
		music1.stop();
		Media.about();
	}
}
