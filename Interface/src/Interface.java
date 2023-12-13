
interface Printable {

    void print();
}

interface Showable {

    void show();
}

class Interface implements Printable, Showable {

    public void print() {
        System.out.print("Print");
    }

    public void show() {
        System.out.print("Show");
    }

    public static void main(String[] args) {
        Interface i = new Interface();
        i.print();
        System.out.println();
        i.show();
    }
}
