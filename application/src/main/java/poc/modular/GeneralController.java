package poc.modular;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GeneralController {

    @GetMapping("/overview")
    String getOverviewData() {
        return "( ( ( OVERVIEW DATA ) ) )";
    }
}
