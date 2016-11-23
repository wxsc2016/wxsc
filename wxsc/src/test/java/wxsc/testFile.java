package wxsc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class testFile {
	@Test
	public  void writeFile() {  
        String str = "this  is a program"; // 要写入的内容  
        try {  
        	String myfileroot="d:/ALLJSON/goodsinfo.json";
        	File f=new File(myfileroot);
        	if(f.exists())
        		f.delete();
        	else{
        	try {
        		
        		f.createNewFile();
        		}catch(IOException e){
        			System.out.println("-----创建json文件错误-----");
        			e.printStackTrace();
        		}
        	}
        	
            FileOutputStream out = new FileOutputStream(myfileroot); // 输出文件路径
            
            out.write(str.getBytes());  
            out.close();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
