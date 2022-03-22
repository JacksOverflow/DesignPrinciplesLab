package ie.gmit.open;

import java.util.List;

public class ISPSubscriber extends Subscriber{

    private long freeUsage;

    public ISPSubscriber() {

    }

    /**
     * @return the freeUsage
     */
    public long getFreeUsage() {
        return freeUsage;
    }

    /**
     * @param freeUsage the freeUsage to set
     */
    public void setFreeUsage(long freeUsage) {
        this.freeUsage = freeUsage;
    }

    
}