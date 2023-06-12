package relationships;

public class Example6 {
    public static void main(String[] args) {
        Cinema c1 = new Cinema() {
            @Override
            public String buyTicket() {
                return super.buyTicket() + " Film: avatar (c1)";
            }

            @Override
            public String seeMovie() {
                return super.seeMovie() + " Film: avatar (c1)";
            }
        };

        System.out.println(c1.buyTicket());
        System.out.println(c1.seeMovie());

        Cinema c2 = new Cinema() {
            @Override
            public String buyTicket() {
                return super.buyTicket() + "Film: avatar (c2)";
            }

            @Override
            public String seeMovie() {
                return super.seeMovie() + "Film: avatar (c2)";
            }
        };

        System.out.println(c2.buyTicket());
        System.out.println(c2.seeMovie());

        Cinema c3 = new Cinema() {
            @Override
            public String buyTicket() {
                return super.buyTicket() + " c3";
            }
        };

        System.out.println(c3.buyTicket());
        System.out.println(c3.seeMovie());
    }
}

class Cinema {

    public String buyTicket() {
        return "We bought a ticket";
    }

    public String seeMovie() {
        return "We've seen a movie";
    }
}