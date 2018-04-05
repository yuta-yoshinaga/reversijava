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

import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ResJson;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiPlay;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiSetting;
import net.arnx.jsonic.JSON;

////////////////////////////////////////////////////////////////////////////////
///	@class		FrontController
///	@brief		Servlet implementation class FrontController
///
////////////////////////////////////////////////////////////////////////////////
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			GET
	///	@fn				protected void doGet(HttpServletRequest request, HttpServletResponse response)
	///	@param[in]		HttpServletRequest request
	///	@param[in,out]	HttpServletResponse response
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	/// @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	///
	////////////////////////////////////////////////////////////////////////////////
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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

		HttpSession session = request.getSession(true);
		ReversiPlay rvPlay = null;
		if (session.isNew()) {
			// *** 初めてのアクセス *** //
			rvPlay = new ReversiPlay();
			session.setAttribute("rvPlay", rvPlay);
		} else {
			rvPlay = (ReversiPlay) session.getAttribute("rvPlay");
		}
		if(rvPlay == null) {
			rvPlay = new ReversiPlay();
			session.setAttribute("rvPlay", rvPlay);
		}

		String func = request.getParameter("func");
		System.out.println(func);
		ResJson resJson = new ResJson();
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

		String json = JSON.encode(resJson);
		System.out.println(json);
		response.getWriter().append(json);
	}

}
