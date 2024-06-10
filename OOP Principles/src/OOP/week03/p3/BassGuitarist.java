package OOP.week03.p3;

public class BassGuitarist extends Guitarist{
    private Guitar guitar;
    BassGuitarist(Guitar guitar){
        this.guitar = guitar;
    }
    @Override
    void playGuitar(){
        System.out.println("Bass guitarist is playing the guitar");
    }
}
