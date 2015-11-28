package action;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.util.List;  
  
import org.apache.struts2.ServletActionContext;  
  
import com.opensymphony.xwork2.ActionSupport;  
  
public class UploadAction extends ActionSupport {   
      
		private String username;
	 	private File file;
	    
	    //提交过来的file的名字
	    private String fileFileName;
	    
	    //提交过来的file的MIME类型
	    private String fileContentType;

	    public String getUsername()
	    {
	        return username;
	    }

	    public void setUsername(String username)
	    {
	        this.username = username;
	    }

	    public File getFile()
	    {
	        return file;
	    }

	    public void setFile(File file)
	    {
	        this.file = file;
	    }

	    public String getFileFileName()
	    {
	        return fileFileName;
	    }

	    public void setFileFileName(String fileFileName)
	    {
	        this.fileFileName = fileFileName;
	    }

	    public String getFileContentType()
	    {
	        return fileContentType;
	    }

	    public void setFileContentType(String fileContentType)
	    {
	        this.fileContentType = fileContentType;
	    }
	    
	    @Override
	    public String execute() throws Exception
	    { 
	    	String temp = ServletActionContext.getRequest().getRealPath("/uploadImg");
	    	System.out.println("temp:"+temp);
	    	System.out.println("file: " + file.getName());
	        String root = ServletActionContext.getServletContext().getRealPath("/uploadImg");
	        System.out.println("root: " + root);
	        InputStream is = new FileInputStream(file);
	        
	        OutputStream os = new FileOutputStream(new File(root, fileFileName));
	        
	        System.out.println("fileFileName: " + fileFileName);
	        
	       
	        System.out.println("file: " + file.getPath());
	        
	        byte[] buffer = new byte[500];
	        int length = 0;
	        
	        while(-1 != (length = is.read(buffer, 0, buffer.length)))
	        {
	            os.write(buffer);
	        }
	        
	        os.close();
	        is.close();
	        
	        return SUCCESS;
	    }
     
} 