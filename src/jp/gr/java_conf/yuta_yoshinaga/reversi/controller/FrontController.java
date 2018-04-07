////////////////////////////////////////////////////////////////////////////////
///	@file			FrontController.java
///	@brief			フロントコントローラークラス実装ファイル
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

package jp.gr.java_conf.yuta_yoshinaga.reversi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.gr.java_conf.yuta_yoshinaga.reversi.model.CallbacksJson;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.FuncsJson;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ResJson;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiPlay;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiPlayDelegate;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiPlayInterface;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiSetting;
import net.arnx.jsonic.JSON;

////////////////////////////////////////////////////////////////////////////////
///	@class		FrontController
///	@brief		Servlet implementation class FrontController
///
////////////////////////////////////////////////////////////////////////////////
@WebServlet("/FrontController")
public class FrontController extends HttpServlet implements ReversiPlayInterface{
	private static final long serialVersionUID = 1L;			//!< シリアルバージョン
	private CallbacksJson callbacks = null;						//!< コールバックス
	private ReversiPlayDelegate rvDele = null;					//!< リバーシデリゲート

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			コンストラクタ
	///	@fn				public FrontController()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	/// @see HttpServlet#HttpServlet()
	///
	////////////////////////////////////////////////////////////////////////////////
	public FrontController() {
		super();
		// TODO Auto-generated constructor stub
		rvDele = new ReversiPlayDelegate((ReversiPlayInterface)this);
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			POST
	///	@fn				protected void doPost(HttpServletRequest request, HttpServletResponse response)
	///	@param[in]		HttpServletRequest request
	///	@param[in,out]	HttpServletResponse response
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	/// @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	///
	////////////////////////////////////////////////////////////////////////////////
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ResJson resJson = new ResJson();
		this.callbacks = new CallbacksJson();

		HttpSession session = request.getSession(true);
		ReversiPlay rvPlay = null;
		if (session.isNew()) {
			// *** 初めてのアクセス *** //
			rvPlay = new ReversiPlay();
			rvPlay.setmDelegate(rvDele);
			session.setAttribute("rvPlay", rvPlay);
		} else {
			rvPlay = (ReversiPlay) session.getAttribute("rvPlay");
		}
		if(rvPlay == null) {
			rvPlay = new ReversiPlay();
			rvPlay.setmDelegate(rvDele);
			session.setAttribute("rvPlay", rvPlay);
		}

		String func = request.getParameter("func");
		System.out.println(func);
		if (func.equals("setSetting")) {
			String para = request.getParameter("para");
			ReversiSetting setting = JSON.decode(para, ReversiSetting.class);
			System.out.println(para);
			rvPlay.setmSetting(setting);
			rvPlay.reset();
			session.setAttribute("rvPlay", rvPlay);
			resJson.setAuth("[SUCCESS]");
		} else if (func.equals("reset")) {
			rvPlay.reset();
			session.setAttribute("rvPlay", rvPlay);
			resJson.setAuth("[SUCCESS]");
		} else if (func.equals("reversiPlay")) {
			String y = request.getParameter("y");
			String x = request.getParameter("x");
			System.out.println(y);
			System.out.println(x);
			rvPlay.reversiPlay(Integer.parseInt(y), Integer.parseInt(x));
			session.setAttribute("rvPlay", rvPlay);
			resJson.setAuth("[SUCCESS]");
		}
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");

		resJson.setCallbacks(this.callbacks);
		String json = JSON.encode(resJson);
		System.out.println(json);
		response.getWriter().append(json);
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			メッセージダイアログ
	///	@fn				void ViewMsgDlg(String title , String msg)
	///	@param[in]		String title	タイトル
	///	@param[in]		String msg		メッセージ
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void ViewMsgDlg(String title , String msg)
	{
		FuncsJson funcs = new FuncsJson();
		funcs.setFunc("ViewMsgDlg");
		funcs.setParam1(title);
		funcs.setParam2(msg);
		this.callbacks.getFuncs().add(funcs);
		System.out.println("ViewMsgDlg title = " + title + " msg = " + msg);
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			1マス描画
	///	@fn				void DrawSingle(int y, int x, int sts, int bk, String text)
	///	@param[in]		int y		Y座標
	///	@param[in]		int x		X座標
	///	@param[in]		int sts		ステータス
	///	@param[in]		int bk		背景
	///	@param[in]		String text	テキスト
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void DrawSingle(int y, int x, int sts, int bk, String text)
	{
		FuncsJson funcs = new FuncsJson();
		funcs.setFunc("DrawSingle");
		funcs.setParam1(String.valueOf(y));
		funcs.setParam2(String.valueOf(x));
		funcs.setParam3(String.valueOf(sts));
		funcs.setParam4(String.valueOf(bk));
		funcs.setParam5(text);
		this.callbacks.getFuncs().add(funcs);
		System.out.println("DrawSingle y = " + y + " x = " + x + " sts = " + sts + " bk = " + bk + " text = " + text);
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			現在の色メッセージ
	///	@fn				void CurColMsg(String text)
	///	@param[in]		String text	テキスト
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void CurColMsg(String text)
	{
		FuncsJson funcs = new FuncsJson();
		funcs.setFunc("CurColMsg");
		funcs.setParam1(text);
		this.callbacks.getFuncs().add(funcs);
		System.out.println("CurColMsg text = " + text);
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			現在のステータスメッセージ
	///	@fn				void CurStsMsg(String text)
	///	@param[in]		String text	テキスト
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void CurStsMsg(String text)
	{
		FuncsJson funcs = new FuncsJson();
		funcs.setFunc("CurStsMsg");
		funcs.setParam1(text);
		this.callbacks.getFuncs().add(funcs);
		System.out.println("CurStsMsg text = " + text);
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ウェイト
	///	@fn				void Wait(int time)
	///	@param[in]		int time	ウェイト時間(msec)
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void Wait(int time)
	{
		FuncsJson funcs = new FuncsJson();
		funcs.setFunc("Wait");
		funcs.setParam1(String.valueOf(time));
		this.callbacks.getFuncs().add(funcs);
		System.out.println("Wait time = " + time);
	}

}
