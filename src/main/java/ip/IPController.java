package ip;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
public class IPController {

    @RequestMapping("/getip")
    public @ResponseBody
    IpDTO getIpJSON(HttpServletRequest request) {

        String remoteAddr = request.getRemoteAddr();
        String remoteHost = request.getRemoteHost();
        String remoteUser = request.getRemoteUser();
        int remotePort = request.getRemotePort();

        IpDTO ipDTO = new IpDTO();
        ipDTO.setRemoteAddr(remoteAddr);
        ipDTO.setRemotePort(remotePort);
        ipDTO.setRemoteHost(remoteHost);
        ipDTO.setRemoteUser(remoteUser);
        return ipDTO;
    }
}
