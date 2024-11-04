package ueb4.adapter.refactored;


public class IPhone {

    public void aufladen(LightningLadegeraet lightningLadegeraet) {
        int strom = lightningLadegeraet.liefereStromViaLightning();

        System.out.println("Apple Phone wird mit " + strom + " mA aufgeladen.");
    }
}




