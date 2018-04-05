////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiPlayInterface.java
///	@brief			リバーシインターフェースファイル
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
///	@interface	ReversiPlayInterface
///	@brief		リバーシプレイインターフェース
///
////////////////////////////////////////////////////////////////////////////////
public interface ReversiPlayInterface
{
	void ViewMsgDlg(String title , String msg);
	void DrawSingle(int y, int x, int sts, int bk, String text);
	void CurColMsg(String text);
	void CurStsMsg(String text);
	void Wait(int time);
}
