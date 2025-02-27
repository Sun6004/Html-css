package kr.or.ddit.buyer.service;

import java.util.List;

import kr.or.ddit.buyer.vo.BuyerVO;

public interface BuyerService {
	
	//전체 아이디와 이름조회
	public List<BuyerVO> selectIdName();
	
	//아이디를 기준으로 상세보기
	public BuyerVO selectById(String id);
}
