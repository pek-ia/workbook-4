public class DonutFactory {
    double pricePerDonut;

    public double getPricePerDonut() {
        return pricePerDonut;
    }

    public void setPricePerDonut(double pricePerDonut) {
        this.pricePerDonut = pricePerDonut;
    }

    public DonutFactory(double pricePerDonut) {
        this.pricePerDonut = pricePerDonut;
    }

    double getPriceOfDonuts(int numberOfDonuts){
        double totalPrice =  numberOfDonuts * pricePerDonut;

        if (numberOfDonuts % 12 == 0 ){
            totalPrice = totalPrice - totalPrice*.2;
        }
        else if (numberOfDonuts >= 6){
            totalPrice -= totalPrice * .1;
        }
        return totalPrice;
    }
}
