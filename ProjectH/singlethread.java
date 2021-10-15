package project1;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class singlethread extends Thread {
	@Override
	public void run() 
	{
		
		System.out.print("Loading:(");
		for(int i = 1; i < 15; i++)
		{	
			File sound = new File("Soundfiles/Binary2.wav");
			try {
				AudioInputStream audioStream = AudioSystem.getAudioInputStream(sound);
				Clip soundclip = AudioSystem.getClip();
				soundclip.open(audioStream);
			soundclip.start();
			
			
			
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			try {
				Thread.sleep(50);
				
				System.out.println("Hacking: " +i +"%");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Done!");
		mainz main = new mainz();
		
	}

}
