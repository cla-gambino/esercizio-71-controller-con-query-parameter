package develhope.esercizio71controllerconqueryparameter;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class LocationWeatherController {

    @RequestMapping(method = RequestMethod.GET, path = "/ciao")
    public String ciao(@RequestParam(required = true) String nome, @RequestParam(required = false, defaultValue = "") String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }

}
