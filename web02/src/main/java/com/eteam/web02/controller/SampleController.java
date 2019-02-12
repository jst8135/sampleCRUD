package com.eteam.web02.controller; 
 
 
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
 		System.out.println("Request : /addSample : 입력 액숀 ");//경로확인해보자
 		sample.setSampleName(sampleName);//sample객체내에 setSampleName메서드에 sampleName셋팅
 		sampleService.addSample(sample);
 		return "redirect:/sampleList";	//리다이렉트 
 	} 
 	// 3. 목록 
 	@GetMapping("sampleList") 
 	public String sampleList(Model model) { 
 		return "sampleList"; 
 	} 
 	// 4. 삭제 액션 
 	 
 	// 5. 수정 폼 
 	 
 	// 6. 수정 액션 
} 
