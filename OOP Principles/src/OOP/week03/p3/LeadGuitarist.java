package OOP.week03.p3;

class LeadGuitarist extends Guitarist{
    private Guitar guitar;
    LeadGuitarist(Guitar guitar){
        this.guitar = guitar;
    }
    @Override
    void playGuitar(){
        System.out.println("Lead guitarist is playing the guitar");
    }
}
