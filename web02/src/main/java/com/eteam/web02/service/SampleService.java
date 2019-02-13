package com.eteam.web02.service; 
 
 
import java.util.List; 

 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
 
 
import com.eteam.web02.mapper.SampleMapper; 
import com.eteam.web02.vo.Sample; 
 
 
@Service 
public class SampleService { 
 	@Autowired  
 	private SampleMapper sampleMapper; 
 	 
 	public List<Sample> getSampleList() { 
 		//참조변수 sampleMapper 내에 selectSampleList()메서드를 호출한뒤
 		//ArrayList<Sample>데티어타입 주소를 가저온다.
 		//List<Sample> 타입으로된 list참조변수 가저온 ArrayList<Sample>주소를 담아준다.
 		List<Sample> list = sampleMapper.selectSampleList();
 		//list참조변수를 리턴해준다.
 		return list; 
 	} 
 	 
 	public List<Sample> getSampleOne() { 
 		return null; 
 	} 
 	 
 	public int addSample(Sample sampleName) { 
 		//참조변수 sampleMapper 내에 insertSample()데서드를 호출시
 		//Sample 타입으로된 sampleName참조변수를 입력하여 실행한다.
 		sampleMapper.insertSample(sampleName);
 		return 0; 
 	} 
 	 
 	public int removeSample(Sample sample) { 
 		//참조변수 sampleMapper 내에 deleteSample매서드 호출시
 		//Sample 타입으로된 sample참조변수를 입력하여 실행한다.
 		sampleMapper.deleteSample(sample);
 		return 0; 
 	} 
 	 
 	public int modifySample(Sample sample) { 
 		return 0; 
 	} 
} 
