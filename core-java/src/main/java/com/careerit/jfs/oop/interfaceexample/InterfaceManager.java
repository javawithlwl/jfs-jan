package com.careerit.jfs.oop.interfaceexample;

interface MusicInstrument {
    int NO_OF_KEYS = 88;
    void play();
}
class Guitar implements MusicInstrument{
    @Override
    public void play(){
        System.out.println("Playing Guitar");
    }
}
class Piano implements MusicInstrument{
    @Override
    public void play(){
        System.out.println("Playing Piano");
    }
}
class Flute implements MusicInstrument{
    @Override
    public void play(){
        System.out.println("Playing Flute");
    }
}
public class InterfaceManager {

    public static void main(String[] args) {

                MusicInstrument musicInstrument = new Flute();
                musicInstrument.play();
    }
}
