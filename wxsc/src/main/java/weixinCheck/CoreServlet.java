package weixinCheck;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import weixinCheck.SignUtil;

/**
 * ����: CoreServlet </br> 
 * ����: ������΢�ŷ�����������Ϣ </br> 
 * ������Ա�� souvc</br> 
 * ����ʱ�䣺2015-9-29 </br> 
 * �����汾��V1.0 </br>
 */
public class CoreServlet extends HttpServlet {

    private static final long serialVersionUID = 4323197796926899691L;

    /**
     * ȷ����������΢�ŷ�����
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // ΢�ż���ǩ��
        String signature = request.getParameter("signature");
        // ʱ���
        String timestamp = request.getParameter("timestamp");
        // �����
        String nonce = request.getParameter("nonce");
        // ����ַ���
        String echostr = request.getParameter("echostr");

        PrintWriter out = response.getWriter();
        
        // ͨ������signature���������У�飬��У��ɹ���ԭ������echostr����ʾ����ɹ����������ʧ��
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {
            out.print(echostr);
        }
        
        out.close();
        out = null;
    }

    /**
     * ����΢�ŷ�������������Ϣ
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO ��Ϣ�Ľ��ա���������Ӧ
    	
    	
    }

}