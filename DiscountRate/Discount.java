package DiscountRate;

class Discount {
    private double serviceDiscountRate;
    private double productDiscountRate;
    public Discount(double serviceDiscountRate,double productDiscountRate){
        this.productDiscountRate = productDiscountRate;
        this.serviceDiscountRate = serviceDiscountRate;
    }

    public double getProductDiscountRate() {
        return productDiscountRate;
    }

    public double getServiceDiscountRate() {
        return serviceDiscountRate;
    }
}
