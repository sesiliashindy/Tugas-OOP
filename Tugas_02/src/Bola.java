public class Bola extends Lingkaran {
    
    public void getVolume(){
        System.out.println("Volume Bola: ");
        if (r%7==0) {
            System.out.println(4*22*(Math.pow(r, 3)/7)/3);
        } else {
            System.out.println(4*Math.PI*(Math.pow(r, 3))/3);
        }
    }
}
