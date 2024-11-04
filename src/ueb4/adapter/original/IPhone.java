package ueb4.adapter.original;


public class IPhone {

    public void aufladen(LightningLadegeraet lightningLadegeraet) {
        int strom = lightningLadegeraet.liefereStromViaLightning();

        System.out.println("Apple Phone wird mit " + strom + " mA aufgeladen.");
    }
}




