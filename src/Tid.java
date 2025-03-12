public class Tid {
    public static void main(String[] args) {

        //mine variable med datatype, navn og værdi
        int timeNu = 10;
        int minNu = 16;
        int sekNu = 30;
        int sekSidenMidnat = timeNu*3600 + minNu*60 + 30;
        int sekPaaEtDgn = 24*3600;
        int sekTilMidnat = sekPaaEtDgn - sekSidenMidnat;
        int nyTidNu = 11*3600;
        int opgaveVarighed = nyTidNu - sekSidenMidnat;

        //mine outputs der vises i terminalen
        System.out.println("Klokken er nu " + timeNu + ":" + minNu + ":" + sekNu);
        System.out.println("Siden midnat er der gået " + sekSidenMidnat + " sekunder");
        System.out.println("Der er " + sekTilMidnat + " sekunder til midnat");
        System.out.println("Opgaven har taget mig " + opgaveVarighed + " sekunder at lave");
    }
}
