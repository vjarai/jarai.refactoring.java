package ueb4.adapter.refactored;

public class UsbToLightningAdapter extends LightningLadegeraet {
    private final UsbLadegeraet usbLadegeraet;

    public UsbToLightningAdapter(UsbLadegeraet usbLadegeraet) {
        this.usbLadegeraet = usbLadegeraet;
    }

    @Override
    public int liefereStromViaLightning() {
        int strom = usbLadegeraet.liefereStromViaUsb();
        return strom;
    }
}
