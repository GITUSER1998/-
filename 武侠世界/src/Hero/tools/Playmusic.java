package Hero.tools;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.swing.JFrame;
@SuppressWarnings("serial")
public class Playmusic extends JFrame{ 
static URI uri;
static URL url;
static AudioClip aau;
public static void PlayMusic(File s1){  
    try {      
    	uri = s1.toURI();
    	url = uri.toURL();  
    	aau = Applet.newAudioClip(url);
    	aau.play();
    }
    	catch (MalformedURLException e) 
    	{ e.printStackTrace();
    	}
	}
public static void RepeatMusic(File s1){
	try{
		uri = s1.toURI();
    	url = uri.toURL();  
    	aau = Applet.newAudioClip(url);
    	aau.loop();
	}
	catch(MalformedURLException e){
		e.printStackTrace();
	}
}
}
