public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public static void main (String[] args) {
        User firstUser = new User("Radosław", 22);
        User secondUser = new User("Natalia", 19);
        User thirdUser = new User("Alicja", 15);
        User fourthUser = new User("Tomasz", 75);
        User fifthUser = new User("Dominika", 38);

        User[] users = {firstUser, secondUser, thirdUser, fourthUser, fifthUser};

        //  wywołanie metody do sumowania wieku w tablicy
//        double total = sumAge(users);
//        System.out.println(total);

        //  wywołanie metody do drukowania imion osób, których wiek jest poniżej średniej
        printNames(users);

    }

    //    metoda do sumowania wieku z tablicy i wyliczenia średniej
    public static double sumAge(User[] users) {
        double sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }
        return sum / users.length;
    }

    //    metoda do drukowania imion osób, których wiek jest poniżej średniej
    public static void printNames(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < sumAge(users)) {
                System.out.println(users[i].name);
            }
        }

    }


}