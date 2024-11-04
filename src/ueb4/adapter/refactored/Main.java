package ueb4.adapter.refactored;

public class Main {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        LightningLadegeraet lightningLadegeraet = new LightningLadegeraet();
        iPhone.aufladen(lightningLadegeraet);

        UsbLadegeraet usbLadegeraet = new UsbLadegeraet();
        UsbToLightningAdapter adapter = new UsbToLightningAdapter(usbLadegeraet);
        iPhone.aufladen(adapter);
    }
}
