package com.example.offlinefrontpagedemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Map;

@Controller
public class OfflineFrontpageController {

    private static final String EVAN_YOU_IMAGE = "https://pbs.twimg.com/profile_images/541811449845137408/ebWKKWxx_400x400.jpeg";
    private static final String EVAN_YOU_BIO = "Evan is a developer, designer and creative coder. "
            + "He is the author of Vue.js, a JavaScript framework for building modern web "
            + "interfaces with reactive components. In the past Evan worked at Meteor Development "
            + "Group on the most starred full-stack JavaScript framework on GitHub, and before "
            + "that spent two years at Google Creative Lab hacking on experimental UI prototypes "
            + "for various Google products.";

    private static final String STEPHANE_NICOLL_IMAGE = "https://pbs.twimg.com/profile_images/534667730956189696/yAhMzi5__400x400.png";
    private static final String STEPHANE_NICOLL_BIO = "Stéphane has a thing for code quality and "
            + "robustness. He has been spreading the word for more than ten years while developing large "
            + "scale Java enterprise applications in the geospatial, financial, or logistics sectors. "
            + "An Apache Maven PMC member since 2006, he joined the core Spring Framework development "
            + "team early 2014, being one of the main contributors to both Spring Framework and Spring "
            + "Boot since. During his free time, he loves traveling around the world.";

    private static final String JUERGEN_HOELLER_IMAGE = "https://pbs.twimg.com/profile_images/2399762699/nsz6jlu4wrgwm5yvtqlw_400x400.jpeg";
    private static final String JUERGEN_HOELLER_BIO = "Juergen Hoeller is co-founder of the Spring Framework "
            + "open source project and has been serving as the project lead and release manager for the core "
            + "framework since 2003. Juergen is an experienced software architect and consultant with outstanding "
            + "expertise in code organization, transaction management and enterprise messaging.";

    @RequestMapping("/")
    public String frontpage(Map<String, Object> model) {
        model.put("speakers",
                Arrays.asList(new Speaker("Evan You", EVAN_YOU_IMAGE, EVAN_YOU_BIO),
                        new Speaker("Juergen Hoeller", JUERGEN_HOELLER_IMAGE, JUERGEN_HOELLER_BIO),
                        new Speaker("Stéphane Nicoll", STEPHANE_NICOLL_IMAGE, STEPHANE_NICOLL_BIO)));
        return "frontpage";
    }

}
