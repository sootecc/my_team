package first.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO{

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) {
		return (List<Map<String,Object>>)selectList("sample.selectBoardList",map);
	}
	//sample이 쿼리문이 저장된 XML에서 설정한 namespace의 이름이다.
	
	
	public void insertBoard(Map<String, Object> map) throws Exception{
		insert("sample.insertBoard", map);
	}
	
	
	
	//게시글 상세를 조회하기 위해서는 다음의 두 가지 동작이 필요
	//해당 게시글의 조회수를 1 증가시킨다.
	public void  updateHitCnt(Map<String, Object> map) throws Exception{
		update("sample.updateHitCnt",map);
	}
	//게시글의 상세 내용을 조회한다.
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception{
		return (Map<String, Object>)selectOne("sample.selectBoardDetail",map);
	}
	
	public void updateBoard(Map<String, Object> map) throws Exception{
		update("sample.updateBoard", map);
	}
	
	public void deleteBoard(Map<String, Object> map) throws Exception{
		update("sample.deleteBoard", map);
	}
}


