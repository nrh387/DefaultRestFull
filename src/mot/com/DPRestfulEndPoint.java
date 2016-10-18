package mot.com;

/**
 * Created by nrh387 on 10/18/2016.
 */

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/DP")
public class DPRestfulEndPoint {
    private final HelpUtility.DeviceDao deviceDao;

    public DPRestfulEndPoint() {
        deviceDao = new HelpUtility.DeviceDao();
    }

    @GET
    @Path("/MyID")
    @Produces(MediaType.APPLICATION_JSON)
    public String GetMyID() {
        return "Hello nrh387!";
    }

    @GET
    @Path("/Help")
    @Produces(MediaType.TEXT_HTML)
    public String help() {

        return HelpUtility.getHelpContext();
    }

    @GET
    @Path("/Device")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Device get(@QueryParam("ip") final String deviceIp) {
        Device device = null;
        if (deviceIp != null) {
            device = deviceDao.getDevice(deviceIp);
        }
        return device;
    }
    @PUT
    @Path("/NewDevice")
    @Produces(MediaType.APPLICATION_JSON)
    public Device put(final String deviceIp)
    {
        Device device = null;
        if (deviceIp != null) {
            device = new Device(deviceIp);
            deviceDao.updateDevice(device);
        }
        return device;
    }

}
