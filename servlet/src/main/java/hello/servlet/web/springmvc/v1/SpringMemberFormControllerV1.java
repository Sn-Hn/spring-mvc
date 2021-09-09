package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// RequestMappingHandlerMapping 은 스프링 빈 중에서 @RequestMapping 또는 @Controller가 클래스 레벨에 붙어 있는 경우에 매핑 정보로 인식한다.
// 핸들러 조회를 위해 @Controller나 @RequestMapping이 클래스 레벨에 선언 되어야 한다. (isHandler)
// 또 스프링 빈으로 등록되어 있어야 한다.
// 즉, @Controller에는 @Component가 선언되어 있으므로 @Controller만 선언하면 핸들러 조회를 할 수 있다. (@ComponentScan 으로 빈 등록)
// @RequestMapping으로 선언하려면 @Component를 이용해 빈으로 등록해주어야 한다.
// @Component가 아니어도 빈으로 등록만 하면 되므로 ServletApplication에서 빈으로 따로 등록해줘도 된다.

@Controller
//@Component
//@RequestMapping
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
