public class Pen {
    public enum Color {
        RED, BLUE, GREEN
    }

    private boolean capOff;
    private Color color;

    public Pen() {
        this.capOff = false;
        this.color = Color.RED;
    }

    public Pen(Color color) {
        this.capOff = false;
        this.color = color;
    }

    public void capOff() {
        this.capOff = true;
    }

    public void capOn() {
        this.capOff = false;
    }

    public void changeColor(Color color) {
        this.color = color;
    }

    public String draw() {
        if (capOff) {
            return "Drawing " + color.toString().toLowerCase();
        } else {
            return "";
        }
    }

    public Color getColor() {
        return color;
    }
}
