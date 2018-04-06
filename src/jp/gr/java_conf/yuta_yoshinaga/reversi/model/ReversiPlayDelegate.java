////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiPlayDelegate.java
///	@brief			リバーシデリゲートファイル
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

import java.io.Serializable;

////////////////////////////////////////////////////////////////////////////////
///	@interface	ReversiPlayDelegate
///	@brief		リバーシプレイデリゲート
///
////////////////////////////////////////////////////////////////////////////////
public class ReversiPlayDelegate implements Serializable
{
	private final ReversiPlayInterface impl;

	public ReversiPlayDelegate(ReversiPlayInterface i)
	{
		this.impl = i;
	}

	public void ViewMsgDlg(String title , String msg)
	{
		impl.ViewMsgDlg(title , msg);
	}

	public void DrawSingle(int y, int x, int sts, int bk, String text)
	{
		impl.DrawSingle(y, x, sts, bk, text);
	}

	public void CurColMsg(String text)
	{
		impl.CurColMsg(text);
	}

	public void CurStsMsg(String text)
	{
		impl.CurStsMsg(text);
	}

	public void Wait(int time)
	{
		impl.Wait(time);
	}
}
