package com.eteam.web02.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.eteam.web02.vo.Sample;

@Mapper
public interface SampleMapper {
	//입력처리
	int insertSample(Sample sampleName);
	//리스트
	ArrayList<Sample> selectSampleList();
	//리스트 삭제
	void deleteSample(Sample sample);
	
}
