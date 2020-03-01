public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1500, 2017);
        System.out.println(notebook.product + notebook.weight + "g " + notebook.price + notebook.currency);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceAndYear();

        Notebook heavyNotebook = new Notebook(2000, 700, 2010);
        System.out.println(heavyNotebook.product + heavyNotebook.weight + "g " + heavyNotebook.price + heavyNotebook.currency);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkPriceAndYear();

        Notebook oldNotebook = new Notebook(1200, 500, 2000);
        System.out.println(oldNotebook.product + oldNotebook.weight + "g " + oldNotebook.price + oldNotebook.currency);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkPriceAndYear();


        LeapYear someYear = new LeapYear(1900);
        boolean isLeapYear = someYear.isLeapYear();
        System.out.println("Czy to rok przestępny?: " + isLeapYear);

    }
}