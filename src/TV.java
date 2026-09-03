public class TV {

    private int channel;
    private int volumenLevel;
    private boolean on;

    public TV() {
        channel = 0;
        volumenLevel = 0;
        on = false;
    }

    public void turnon() {
        if (on == false) {
            on = true;
            volumenLevel = 50;
            channel = 1;
            System.out.println("TV prendida");
        } else {
            System.out.println("Esta prendida la tele");
        }
    }

    public void turnoff() {
        if (on == true) {
            on = false;
            System.out.println("TV apagado");
        } else {
            System.out.println("Esta apagada la tele");
        }
    }

    public void setChannel(int channel) {
        if (on == true) {
            if (channel > 0 && channel < 27) {
                this.channel = channel;
            } else {
                System.out.println("Tiene que ser dentro 1 - 26");
            }
            System.out.println("La tele esta en canal " + this.channel);
        } else {
            System.out.println("Esta apagada la tele");
        }
    }

    public void channelUp() {
        if (on == true) {
            if (channel == 26) {
                channel = 1;
            }else {
                channel++;
            }
            System.out.println("La tele esta en canal " + channel);
        } else {
            System.out.println("Esta apagada la tele");
        }
    }

    public void channelDown() {
        if (on == true) {
            if (channel == 1){
                channel = 26;
            } else {
                channel--;
            }
            System.out.println("La tele esta en canal " + channel);
        } else {
            System.out.println("Esta apagada la tele");
        }
    }

    public void volumenUp() {
        if (on == true) {
            if (volumenLevel < 100) {
                volumenLevel++;
            }
            System.out.println("La tele esta a " + volumenLevel + " de volumen");
        } else {
            System.out.println("Esta apagada la tele");
        }
    }

    public void volumenDown() {
        if (on == true) {
            if (volumenLevel > 0) {
                volumenLevel--;
            }
            System.out.println("La tele esta a " + volumenLevel + " de volumen");
        } else {
            System.out.println("Esta apagada la tele");
        }
    }

}
