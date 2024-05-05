package MultilevelInheritance;

public class AA {
    int x;
    public AA (int x) {
        this.x = x;
    }

    public void print() {
        System.out.println("AA: " + x);
    }
}

class BB extends  AA {
    int x = 99;
    public BB (int x) {
        super(x);
    }
}

class CC extends BB {
    public CC (int x) {
        super(x);
    }
}

class Main {
    public static void main(String[] args) {
        CC obj = new CC(10);
        System.out.println(obj.x);
        obj.print();
    }
}
