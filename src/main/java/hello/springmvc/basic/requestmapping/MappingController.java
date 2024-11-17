package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = {"/hello-basic", "/hello-go"}, method = RequestMethod.GET)
    public String helloBasic() {
        log.info("hello basic request");
        return "ok";
    }

    @GetMapping(value = "mapping-get-v2")
    public String hello() {
        log.info("mapping-get-v2 request");
        return "ok";
    }

    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable("userId") String userId) {
        log.info("userId = {}", userId);
        return "ok";
    }

    @GetMapping("/mapping/user/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable("userId") String userId, @PathVariable("orderId") String orderId) {
        log.info("userId = {}, orderId = {}", userId, orderId);
        return "ok";
    }

    // header의 값을 기준
    @GetMapping(value = "mapping-header", headers = "mode=debug")
    public String mappingHeader() {
        log.info("mapping-header");
        return "ok";
    }

    @PostMapping(value = "/mapping-consume", consumes = "application/json")
    public String mappingConsume() {
        log.info("mapping-consume");
        return "ok";
    }

    @PostMapping(value = "/mapping-produce", produces = "text/html")
    public String mappingProduce() {
        log.info("mapping-produce");
        return "ok";
    }
}
