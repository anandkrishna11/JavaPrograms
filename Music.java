package javalab;
interface Media{
	void play();
	void stop();
	default void pause() {
		System.out.println("Media Paused");
	}
	static void about() {
		System.out.println("This is a media interface");
	}
}

interface AdvanceMedia extends Media{
	void nextTrack();
}

class MusicPlayer implements AdvanceMedia{
	public void play(){
		System.out.println("Muscic Started!");
	}
	public void pause(){
		System.out.println("Muscic Paused!");
	}
	public void nextTrack(){
		System.out.println("Next Music Playing!");
	}
	public void stop(){
		System.out.println("Muscic Stoped!");
	}
}

public class Music {
	public static void main(String [] args) {
		MusicPlayer player=new MusicPlayer();
		player.play();
		player.pause();
		player.nextTrack();
		Media.about();
		player.stop();

	}

}
