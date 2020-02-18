public class Notebook {
    int weight;
    int price;
    int year;
    String currency = "zł";
    String product = "Laptop: ";

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if(this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if(this.weight < 1000) {
            System.out.println("This notebook is light");
        } else if(this.weight > 1000 && this.weight < 2000) {
            System.out.println("This notebook is moderately heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkPriceAndYear() {
        if(this.year > 2016 && this.price > 1400) {
            System.out.println("This notebook is new and expensive");
        } else if (this.year < 2016 && this.year > 2009 && this.price < 1400 && this.price > 600) {
            System.out.println("This notebook is older and moderately expensive");
        } else {
            System.out.println("This notebook is older than dinosaurs and because of it very cheap");
        }
    }

}
