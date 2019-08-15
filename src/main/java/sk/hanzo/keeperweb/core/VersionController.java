package sk.hanzo.keeperweb.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Autowired
    private BuildProperties buildProperties;

    @RequestMapping("version")
    public String getVersion(){
        return buildProperties.getVersion();
    }
}
