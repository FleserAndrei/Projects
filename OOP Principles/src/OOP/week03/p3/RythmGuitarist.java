package OOP.week03.p3;

public class RythmGuitarist extends Guitarist{
    private Guitar guitar;
    RythmGuitarist(Guitar guitar){
        this.guitar = guitar;
    }
    @Override
    void playGuitar(){
        System.out.println("Rythm guitarist is playing the guitar");
    }

}
