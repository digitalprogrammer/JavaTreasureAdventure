package main;

import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound {
    Clip clip;
    URL soundURL[] = new URL[30];

    public Sound()
    {
        soundURL[0] = getClass().getResource("./../src/sound/BlueBoyAdventure.wav");
        soundURL[1] = getClass().getResource("./../src/sound/coin.wav");
        soundURL[2] = getClass().getResource("./../src/sound/powerup.wav");
        soundURL[3] = getClass().getResource("./../src/sound/unlock.wav");
        soundURL[4] = getClass().getResource("./../src/sound/fanfare.wav");
    }

    public void setFile(int i) throws LineUnavailableException
    {
        try
        {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        }
        catch (UnsupportedAudioFileException | IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public void play()
    {
        clip.start();
    }

    public void loop()
    {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop()
    {
        clip.stop();
    }
}
