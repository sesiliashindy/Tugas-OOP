public class Prisma extends Segitiga{
    double tinggiPrisma;
    double hasil;

    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    public void getVolume(){
        System.out.println("Volume Prisma: ");
        System.out.println((luas()*tinggiPrisma));
    }

    // @Override
    // public void getLuas() {
    //     super.getLuas();
    // }

    
    
}
