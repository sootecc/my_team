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
	
}
