package mot.com;

/**
 * Created by nrh387 on 10/18/2016.
 */
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="device")
public class Device {
    private String deviceIp;
    private int deviceStatus;
    public  Device()
    {

    }
    public Device(String Ip)
    {
        super();
        this.deviceIp=Ip;
    }
    @XmlAttribute
    public String getIp() {
        return deviceIp;
    }
    public void setIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }
    @XmlAttribute
    public int getStatus() {
        return deviceStatus;
    }
    public void setStatus(int deviceStatus) {
        this.deviceStatus = deviceStatus;
    }
}

