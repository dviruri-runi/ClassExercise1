public class PlatinumCustomer extends Customer{

    public PlatinumCustomer(int id, String name) {
        super(id, name);
    }

    @Override
    public double getPriceForProduct(double fullPrice) {
        return fullPrice*0.5;
    }
}
