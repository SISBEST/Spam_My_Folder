import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class spam {

	public static void main(String[] args) {
		for(int i = 0; i< Integer.MAX_VALUE; i++) {
			try {
				System.out.println("Created file #" + i + " at " + File.createTempFile("pneumonoultramicroscopicsilicovolcanoconiosis" + i, ".beepbeepimasheep"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("You can't spam me ha ha ha!!!");
			}   
				}
		}

	}
