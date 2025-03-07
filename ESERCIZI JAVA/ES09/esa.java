abstract class Animale {
    abstract void Verso();
    
    void dorme() {
        System.out.println("zzzzzz");
    }
}

class Cane extends Animale {
    @Override
    void Verso() {
        System.out.println("bau bau");
    }
}

class Gatto extends Animale {
    @Override
    void Verso() {
        System.out.println("miao miao");
    }
}

public class esa {
    public static void main(String[] args) {
        Animale[] animali = {new Cane(), new Gatto()};

        for (Animale animale : animali) {
            animale.Verso();
        }
    }
}
