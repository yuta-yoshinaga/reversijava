////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiHistory.java
///	@brief			リバーシ履歴クラス実装ファイル
///	@author			Yuta Yoshinaga
///	@date			2018.04.01
///	$Version:		$
///	$Revision:		$
///
/// (c) 2018 Yuta Yoshinaga.
///
/// - 本ソフトウェアの一部又は全てを無断で複写複製（コピー）することは、
///   著作権侵害にあたりますので、これを禁止します。
/// - 本製品の使用に起因する侵害または特許権その他権利の侵害に関しては
///   当方は一切その責任を負いません。
///
////////////////////////////////////////////////////////////////////////////////

package jp.gr.java_conf.yuta_yoshinaga.reversi.model;

////////////////////////////////////////////////////////////////////////////////
///	@class		ReversiHistory
///	@brief		リバーシ履歴クラス
///
////////////////////////////////////////////////////////////////////////////////
public class ReversiHistory
{
	private ReversiPoint point;
	private int color;

	public ReversiPoint getPoint() {
		return point;
	}

	public void setPoint(ReversiPoint point) {
		this.point = point;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			コンストラクタ
	///	@fn				public ReversiHistory()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2014.07.23
	///
	////////////////////////////////////////////////////////////////////////////////
	public ReversiHistory(){
		this.point = new ReversiPoint();
		this.reset();
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			リセット
	///	@fn				public void reset()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2014.07.23
	///
	////////////////////////////////////////////////////////////////////////////////
	public void reset(){
		this.point.setX(-1);
		this.point.setY(-1);
		this.color = -1;
	}
}

