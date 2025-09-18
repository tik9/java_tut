package tk;

public class Mails3 {

    public static void main(String[] args) {
        int mails = 0;
        int woche = 0;
        boolean mails_complete=false;
        while (mails_complete==false) {
            for (int i = 0; i < 7; i++) {
                mails++;
                if (mails == 500) {
                    mails_complete = true;
                }
            }
            woche++;

            System.out.println(mails + " Mails nach Woche " + woche);
        }

        System.out.println(mails + " Mails nach Woche " + woche);

    }
}
