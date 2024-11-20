package hello.springmvc.basic.request;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class RequestHeaderController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/headers")
    public String headers(
            HttpServletRequest request,
            HttpServletResponse response,
            HttpMethod method,
            Locale locale,
            @RequestHeader MultiValueMap<String, String> headers,
            @RequestHeader("host") String host,
            @CookieValue(value = "myCookie", required = false) String cookie
    ) {
        return "";
    }
}
