package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");

        return mav;
    }

    /*
    String을 반환하는 경우 response/hello로 뷰 리졸버가 실행되어서 뷰를 찾고, 렌더링한다.
    @ResponseBody가 있다면 뷰 리졸버를 실행하지 않고, HTTP 메시지 바디에 직접 입력한다.
     */
    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hello!");

        return "response/hello";
    }

    /*
    @Controller를 사용하고 HttpServletResponse, OutputStream(Writer) 같은 HTTP 메시지 바디를 처리하는 파라미터가 없으면
    요청 URL을 참고해서 논리 뷰 이름으로 사용한다.
    - 요청 URL : /response/hello
    - 실행 templates/response/hello.html
     */
    @RequestMapping("/response/hello")
    public void responseViewV3(Model model) {
        model.addAttribute("data", "hello!");
    }
}
