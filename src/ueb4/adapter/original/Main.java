package ueb4.adapter.original;

public class Main {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        LightningLadegeraet lightningLadegeraet = new LightningLadegeraet();
        iPhone.aufladen(lightningLadegeraet);

        UsbLadegeraet usbLadegeraet = new UsbLadegeraet();
        // iPhone.aufladen(usbLadegeraet);  // Was tun???
    }
}
