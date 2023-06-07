package HomeWork12Class;

public class homeWork12class {
    public static void main(String[] args) {

        Country a = new Country();
        a.title();

        State1 b = new State1();
        b.title();

        State2 c = new State2();
        c.title();

        City1 d = new City1();
        d.title();

        City2 i = new City2();
        i.title();
    }
}

class Country {

    public void title() {
        System.out.println("Germany");
    }

}

class State1 extends Country {

    @Override
    public void title() {
        System.out.println("Bavaria, Germany");
    }
}

class State2 extends Country {
    @Override
    public void title() {
        System.out.println("Berlin, Germany");
    }

    }

class City1 extends State1 {
    @Override
    public void title() {
        System.out.println("Munich, Bavaria, Germany");
    }

   }

    class City2 extends State2 {
        @Override
        public void title() {
            System.out.println("Potsdam, Berlin, Germany");
        }
    }
