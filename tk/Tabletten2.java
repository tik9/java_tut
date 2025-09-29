package tk;

public class Tabletten2 {
    static String[] wochentage = { "Mo", "Di", "Mi", "Do", "Fr", "Sa", "So" };
    static int[] einnahme = { 3, 3, 2, 1, 1, 0, 0 };

    public static void main(String[] args) {

        int tabletten = 100;
        int woche = 1;
        String tag = "";
        int haette = 0;
        int verfuegbar = 0;
        while (tabletten > 7) {

            for (int i = 0; i < 7; i++) {
                if (woche % 2 == 0 && i != 0)
                    tabletten -= einnahme[i];
                else if (woche % 2 != 0)
                    tabletten -= einnahme[i];

                tag = wochentage[i];

            }
            woche++;
            System.out.println("Am Ende Woche " + woche + " verbleib " + tabletten + " Tabletten");
        
            if (tabletten < 7) {
                tag = "";
                woche++;
                for (int i = 0; i < 7; i++) {
                    tabletten -= einnahme[i];
                    if (tabletten < 0) {
                        tag = wochentage[i];
                        haette = einnahme[i];
                        verfuegbar = tabletten+einnahme[i];
                        break;
                    }
                }
            }
        }

        System.out.println("Hat am " + tag + " der Woche " + woche + " die letzte Tab genommen");
        System.out.println("hätte "+haette+" nehmen sollen, hat aber nur "+verfuegbar);
    }
}
