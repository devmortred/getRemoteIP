package ip;

public class IpDTO {

    private String remoteAddr;
    private String remoteHost;
    private int remotePort;
    private String remoteUser;

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public void setRemotePort(int remotePort) {
        this.remotePort = remotePort;
    }

    public void setRemoteUser(String remoteUser) {
        this.remoteUser = remoteUser;
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }
}
