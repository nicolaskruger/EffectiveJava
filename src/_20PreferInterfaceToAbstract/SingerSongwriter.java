package _20PreferInterfaceToAbstract;

import java.applet.AudioClip;

public interface SingerSongwriter extends Singer,Songwriter{
    AudioClip strum();
    void actSensiive();
}
