package ip;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
public class IPController {

    private String remoteAddr, remoteHost, remoteUser;
    private int remotePort;
    private IpModel ipModel = new IpModel();

    @RequestMapping("/getip")
    public @ResponseBody
    IpModel getIP(HttpServletRequest request) {

        remoteAddr = request.getRemoteAddr();
        remoteHost = request.getRemoteHost();
        remoteUser = request.getRemoteUser();
        remotePort = request.getRemotePort();

        ipDTO.setRemoteAddr(remoteAddr);
        ipDTO.setRemotePort(remotePort);
        ipDTO.setRemoteHost(remoteHost);
        ipDTO.setRemoteUser(remoteUser);

        return ipModel;
    }
}
