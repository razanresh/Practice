public interface Instrument {
    void play();
}
    class Guitar implements Instrument{
    private int amountOfString;

        public Guitar(int amountOfString) {
            this.amountOfString = amountOfString;
        }
        public int getAmountOfString(){
            return amountOfString;
        }
        @Override
        public void play(){
            System.out.println("Играет гитара с количеством струн = " + getAmountOfString());
        }
    }
    class Drums implements Instrument{
    private float size;

        public Drums(Float size) {
            this.size = size;
        }
        public float getSize(){
            return size;
        }
        @Override
        public void play(){
            System.out.println("Играют барабаны с размером = " + getSize());
        }
    }
    class Trampet implements Instrument{
    private float diameter;

        public Trampet(float diameter) {
            this.diameter = diameter;
        }

        public float getDiameter() {
            return diameter;
        }

        @Override
        public void play(){
            System.out.println("Играет труба с диаметром     " + getDiameter());
        }
    }
    class NA {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(5);
        Drums drums = new Drums(5f);
        Trampet trampet = new Trampet(5);
        Instrument[] instrument = new Instrument[3];
        instrument[0] = guitar;
        instrument[1] = drums;
        instrument[2] = trampet;

        for (Instrument i: instrument) {
          i.play();
        }
    }
}

