package com.careerit.jfs.oop.abstractexample;

abstract class MusicInstrument {
    abstract void play();
}
class Guitar extends MusicInstrument{
    @Override
    public void play(){
        System.out.println("Playing Guitar");
    }
}
public class AbstractClassExample {

    public static void main(String[] args) {

            MusicInstrument musicInstrument = new Guitar();
            musicInstrument.play();
    }
}
