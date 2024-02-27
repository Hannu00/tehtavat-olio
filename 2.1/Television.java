public class Television {
    private int channel;
    private boolean on;

    public Television() {
        this.channel = 1;
        this.on = false;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (on) {
            this.channel = channel;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void pressOnOff() {
        on = !on;
    }
}
