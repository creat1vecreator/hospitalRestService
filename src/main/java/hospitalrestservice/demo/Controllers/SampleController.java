package hospitalrestservice.demo.Controllers;

import hospitalrestservice.demo.Entities.Sample;
import hospitalrestservice.demo.Services.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/sample")
@RequiredArgsConstructor
public class SampleController {
    private final SampleService sampleService;

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String returnSample(
            Model model,
            @RequestParam(name = "consultation", required = false) String consultation
    ) {
        if (consultation != null) {
            List<String> consultationList = new ArrayList<>(Arrays.asList(consultation.split(",")));
            System.out.println("form:" + consultation);
            System.out.println();
            consultationList.forEach(System.out::println);
            List<Sample> samples = sampleService.find(consultationList);
            List<Sample> allSamples = sampleService.findAll();
            model.addAttribute("samples", allSamples);
        }
        return "sample_page";
    }
}
