package cn.edu.xmu.artwork.service.imp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.struts2.ServletActionContext;

import cn.edu.xmu.artwork.service.CommonService;


public class CommonServiceImp implements CommonService
{
	@Override
	public boolean upLoadFile(String fileName,File file) throws IOException
	{
		String directoryName = ServletActionContext.getServletContext().getRealPath("/jsp/uploadImg");
		
		FileInputStream in = null;
        FileOutputStream out = null;
        
        File dir = new File ( directoryName);
        if ( !dir.exists() )
           dir.mkdir();
        
        String targetPath =  dir.getPath() + dir.separator + fileName;
        
        File fileDestination = new File ( targetPath);
        try 
        {
            in = new FileInputStream( file );
            out = new FileOutputStream( fileDestination );
            int c;

            while ((c = in.read()) != -1) 
            {
                out.write(c);
            }

        }
        finally 
        {
            if (in != null) 
                in.close();
            
            if (out != null) 
                out.close();
        }
        
        return true;
	}

}
