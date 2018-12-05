package model;

public class Stand {
    String StandId;
    boolean bikeConnected;
    Terminal terminal;


    public Stand(String standId, boolean bikeConnected, Terminal terminal) {
        StandId = standId;
        this.bikeConnected = bikeConnected;
        this.terminal = terminal;
    }
}
