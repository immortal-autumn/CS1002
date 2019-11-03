public class general_copies extends Applications {
    private int genre;

    public general_copies(double price,String productCode,String latestVersionNum){
        this.setPrice(price);
        this.setProductCode(productCode);
        this.setLatestVersionNum(latestVersionNum);
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public int getGenre() {
        return genre;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getProductCode() {
        return super.getProductCode();
    }

    @Override
    public String getLatestVersionNum() {
        return super.getLatestVersionNum();
    }
}
