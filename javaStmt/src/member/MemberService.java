/**
 * 
 */
package member;

public interface MemberService {
	public String join(MemberBean member);

	public String login(String id, String password);

	public String update(MemberBean member);

	public MemberBean detail(String id);

	public String remove(String id);
}
