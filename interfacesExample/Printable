interface Printable {
    void print();
}

class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }

    public String getTitle() {
        return title;
    }
}

class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + title);
    }

    public String getTitle() {
        return title;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                Magazine magazine = (Magazine) p;
                System.out.println(magazine.getTitle());
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Printable[] printable = new Printable[4];
        printable[0] = new Book("The Lord of the Rings");
        printable[1] = new Magazine("New Zealand Stories");
        printable[2] = new Book("Harry Potter");
        printable[3] = new Magazine("Time of Magic");

        for (Printable p : printable) {
            p.print();
        }

        System.out.println("Magazines:");
        Magazine.printMagazines(printable);
    }
}
