/**
 * 
 */
package whileloop;

public class NumGolfBean {
	// player : 게임 참여자가 맞히려고 입력한 값
	// com : 컴퓨터가 랜덤생성한 값
	// count : 플레이어가 입력한 횟수
	// count가 작을수록 승리
	int player, com, count = 0;
	boolean flag; // com의 숫자와 일치하는지 체크하는 값

	/**
	 * @return the player
	 */
	public int getPlayer() {
		return player;
	}

	/**
	 * @param player
	 *            the player to set
	 */
	public void setPlayer(int player) {
		this.player = player;
		setCount();
		if (getCom() == this.player) {
			setFlag(true);

		} else {
			setFlag(false);

		}
	}

	/**
	 * @return the com
	 */
	public int getCom() {
		return com;
	}

	/**
	 * @param com
	 *            the com to set
	 */
	public void setCom() {
		// 1부터 10까지의 랜덤 수 발생
		this.com = (int) (Math.random() * 10) + 1;

	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount() {
		this.count = count + 1;
	}

	/**
	 * @return the flag
	 */
	public boolean isFlag() {
		return flag;
	}

	/**
	 * @param flag
	 *            the flag to set
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
		toString();

	}

	@Override
	public String toString() {
		return "결과 [플레이어값=" + player + ", 컴퓨터값=" + com + ", 시도횟수=" + count + ", 일치여부=" + flag + "]";
	}

}
