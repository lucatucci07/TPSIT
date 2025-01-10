class rettangolo{
    private int altezza;
    private int larghezza;
    private int Area;
 
    public int Area () {
        return altezza*larghezza;
    }

}

public class esa {
    public static void main (String[]args)  {

        public getaltezza() {
            return altezza;
        }
        public void setaltezza(int altezza) {
        this.altezza = altezza;
        }



         public getlarghezza() {
            return larghezza;
        }
        public void setlarghezza(int larghezza) {
        this.larghezza = larghezza;
        }

        public int getArea() {
        return Area;

         public void setArea(int Area) {
        if (Area > 0) { 
            this.Area = Area;
        } else {
            System.out.println("Errore: l'area non può essere negativa!");
        }
    }
    }
}