public class Dog extends Animal {
    private int breed;

    public void eat(){

        System.out.println("brr brr");
    }
    public void eat(int numberOfTimes) {
        for( int i = 0; i <numberOfTimes; i++)

        System.out.println("brr brr");
    }


        public int getBreed(){
        return breed;
    }

    public void setBreed(int breed){
        this.breed = breed;
    }
}
