public class Fish extends Pet {

    Fish(){
        pawsCount = 0;
    }

    @Override
    void getVoice() {
        System.out.println("буль-буль");
    }
}
