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
 		return null; 
 	} 
 	 
 	public List<Sample> getSampleOne() { 
 		return null; 
 	} 
 	 
 	public int addSample(Sample sampleName) { 
 		sampleMapper.insertSample(sampleName);
 		return 0; 
 	} 
 	 
 	public int removeSample(Sample sample) { 
 		return 0; 
 	} 
 	 
 	public int modifySample(Sample sample) { 
 		return 0; 
 	} 
} 
