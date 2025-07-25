package com.kh.spring.common.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PageInfo {
	private int listCount;
	private int currentPage;
	private int pageLimit;
	private int boardLimit;
	
	private int maxPage;
	private int startPage;
	private int endPage;
}
