package first.sample.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import first.sample.service.SampleService;

@Controller
public class SampleController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="sampleService")
	private SampleService sampleService;
	
	
	@RequestMapping(value="/sample/openSampleBoardList.do")
	public ModelAndView openSampleBoardList(Map<String, Object> commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("/sample/boardList");
		
		List<Map<String,Object>> list = sampleService.selectBoardList(commandMap);
		mv.addObject("list",list);
		
		return mv;
	}  
	
	
	/*
	 * Controller는 단순히 어떤 주소와 화면을 연결하고, 비지니스 로직을 호출하는 역할을 한다. 실제로 여러가지 비지니스 로직은 Service에서 작성한다.
	 *  
	 */
	
}
