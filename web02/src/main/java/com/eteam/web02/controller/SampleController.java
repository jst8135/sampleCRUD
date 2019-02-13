package com.eteam.web02.controller; 
 
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestParam; 

 
import com.eteam.web02.service.SampleService;
import com.eteam.web02.vo.Sample; 
 
 
@Controller 
public class SampleController { 
	@Autowired  
	private SampleService sampleService; 
	@Autowired 
	private Sample sample;
	// 1. 입력폼 
	@GetMapping("/addSample") 
 	public String addSample() { 
		System.out.println("Request : /addSample : 입력 폼 으로이동");//경로확인해보자
 		return "addSample";	//포워드와비슷? 포워드인가..
 	} 
 	// 2. 입력 액션 
 	@PostMapping("/addSample")
 	public String addSample(@RequestParam(value="sampleName") String sampleName) { 
 		//경로확인해보자
 		System.out.println("Request : /addSample : 입력 액숀 ");
 		//sample객체내에 setSampleName메서드호출시 sampleName입력 실행한다.
 		sample.setSampleName(sampleName);
 		//sampleService객체내에 addSample()메서드로출시 참조변수 sample 입력 실행한다.
 		sampleService.addSample(sample);
 		//리다이렉트 
 		return "redirect:/sampleList";	
 	} 
 	// 3. 목록 
 	@GetMapping("sampleList") 
 	public String sampleList(Model model) { 
 		System.out.println("Request : /sampleList : 리스트 액숀 ");
 		//참조변수 sampleMapper 내에 selectSampleList()메서드를 호출한뒤
 		//ArrayList<Sample>데티어타입 주소를 가저온다.
 		//List<Sample> 타입으로된 list참조변수 가저온 ArrayList<Sample>주소를 담아준다.
 		List<Sample> listSample = sampleService.getSampleList();
 		//model참조변수 내에 addAttribute 메서드에 "listSample" <--listSample를 담아준다.
 		model.addAttribute("listSample", listSample);
 		
 		return "sampleList"; 
 	} 
 	// 4. 삭제 액션 
 	@GetMapping("sampleDelete")
 	public String deleteSample(@RequestParam(value="sampleId") int sampleId) {
 		System.out.println("Request : /deleteSample : 삭제 액숀 ");
 		//sample객체내에 setSampleId매서드호출시 변수 sampleId입력 실행한다.
 		sample.setSampleId(sampleId);
 		//sampleService객체내에 removeSample매서드 실행시 참조변수 sample
 		sampleService.removeSample(sample);
 		
 		return "redirect:/sampleList";
 	}
 	// 5. 수정 폼 
 	 
 	// 6. 수정 액션 
} 
