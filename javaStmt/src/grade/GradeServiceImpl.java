//미리언니 자리
package grade;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	// 멤버필드
	Vector<GradeBean> gradeList;

	public GradeServiceImpl() {
		gradeList = new Vector<GradeBean>();
	}

	// 멤버 메소드 에어리어
	public void input(GradeBean grade) {
		// C 성적표 등록
		gradeList.add(grade);
	}

	public Vector<GradeBean> getList() {
		// R 성적표 리스트 출력	
		return gradeList;
	}

	public void getGradeByHak() {
		// R 성적표 조회(학번)

	}

	@Override
	public void getGradesByName() {
		// R 성적표 조회(이름)

	}

	public void getCount() {
		// R 카운트 조회

	}

	public void getCountByName() {
		// R 이름조회시 카운트조회

	}

	public void update() {
		// U 성적표 수정

	}

	public void delete() {
		// D 성적표 삭제

	}

}
