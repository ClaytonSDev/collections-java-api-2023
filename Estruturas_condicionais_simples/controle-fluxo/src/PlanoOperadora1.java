public class PlanoOperadora1 {
    
    public static void main(String[] args) {
        String plano = "B"; // M / T

        switch(plano) {
            case "T": {
                System.out.println("5gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
