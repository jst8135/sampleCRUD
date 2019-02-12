package com.eteam.web02.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.eteam.web02.vo.Sample;

@Mapper
public interface SampleMapper {
	int insertSample(Sample sampleName);
}
