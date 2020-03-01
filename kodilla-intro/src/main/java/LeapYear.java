public class LeapYear {
    int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear(){
        if (this.year%4 != 0) {
            return false;
        } else if (this.year%100 != 0) {
            return true;
        } else if (this.year%400 != 0) {
            return false;
        } else {
            return true;
        }
    }



//    public boolean isLeapYear(){
//        if (this.year%4 != 0) {
//            System.out.println("Rok nie jest przestępny");
//            return false;
//        } else if (this.year%100 != 0) {
//            System.out.println("Rok przestępny");
//            return true;
//        } else if (this.year%400 != 0) {
//            System.out.println("Rok nie jest przestępny");
//            return false;
//        } else {
//            System.out.println("Rok przestępny");
//            return true;
//        }
//    }



}
