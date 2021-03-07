package Learning;

class Overload {
    int a, b;

    Overload(int i, int j) {
        a = i / 2;
        b = j;
        System.out.println("Tarun 1 " + a);
        System.out.println("Tarun 2 " + b);
    }

    boolean equals(Overload o) {
        if (o.a == a && o.b == b)
            return true;
        else
            return false;
    }

    int mult(Overload x) {
        return x.a * x.b;

    }

    Overload test() {
        Overload ovld = new Overload(1000, 22);
        a = 78;
      System.out.println("Assiging a before return" + a );
        return ovld;
    }
}
