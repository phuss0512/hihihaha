package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import entity.TruyenTranhDAO;
import entity.Truyentranh;

@WebServlet({"/truyenmoi" ,"/truyen-Tranh1"})
public class TruyenTranhServlet extends HttpServlet {

	private TruyenTranhDAO ttDAO;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uri = req.getRequestURI();

//		if (uri.contains("truyenmoi")) {
//			this.index(req, resp);
//		} 
//		else 
			if (uri.contains("index1")) {
			this.truyenmoi(req, resp);
		}
		else {
			//404
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		try {
			Truyentranh entity = new Truyentranh();
			BeanUtils.populate(entity,
				req.getParameterMap());
			
			this.ttDAO.create(entity);
			
			session.setAttribute("message","Them moi thanh cong" );
			
			resp.sendRedirect("/Ph18216_L3"
				+ "index");
		} catch (Exception e) {
			e.printStackTrace();
			session.setAttribute("error","Them moi that bai" );
			resp.sendRedirect("/Ph18216_L3"
				+ "truyenmoi");
		}
	}
	
	

	
	public void truyenmoi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/truyenmoi.jsp").forward(req, resp);
	}
}
