public abstract class Pet {

    int pawsCount = 4;

    abstract void getVoice();
    public void sleep(){
        System.out.println("Сплю");
    }
    public void play(){
        System.out.println("Играю");
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public int getPawsCount() {
        return pawsCount;
    }
}
