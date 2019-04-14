import java.io.*;
import sun.audio.*;

public class spam {

    static AudioStream audioStream;
    static InputStream in;
	public static void main(String[] args) {
		// open the sound file as a Java input stream
	    String opn = "src/DoorOpn.wav";
		try {
			in = new FileInputStream(opn);
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}
	    // create an audiostream from the inputstream
		try {
			audioStream = new AudioStream(in);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Doors Opening!");
		}
	    // play the audio clip with the audioplayer class
	    AudioPlayer.player.start(audioStream);
	    try {
			Thread.sleep(9000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			System.out.println("ENJOY!");
		}
		for(int i = 0; i< Integer.MAX_VALUE; i++) {
			try {
				System.out.println("Created file #" + i + " at " + File.createTempFile("pneumonoultramicroscopicsilicovolcanoconiosis-omgitsfile" + i + "-pseudopseudohypoparathyroidism-fortniteisdead-whee-aminoheptafluorocyclotetraphosphonitrile", ".beepbeepimasheep"));
				// open the sound file as a Java input stream
			    String cls = "src/DoorCls.wav";
				try {
					in = new FileInputStream(cls);
				} catch (FileNotFoundException e2) {
					e2.printStackTrace();
				}
			    // create an audiostream from the inputstream
				try {
					audioStream = new AudioStream(in);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("Doors Opening!");
				}
			    // play the audio clip with the audioplayer class
			    AudioPlayer.player.start(audioStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("You can't spam me ha ha ha!!!");
			}   
				}
		}

	}