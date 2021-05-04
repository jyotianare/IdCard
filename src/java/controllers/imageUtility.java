
package controllers;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class imageUtility {
    
    public static String uploadImage(HttpServletRequest request ,ServletConfig config,String imgFolder)
    {
        String pic = null;
        
        try{
             String ImgFile = "";
             String imgName = "";
           
             boolean isMultipart = ServletFileUpload.isMultipartContent(request);
             if (!isMultipart) {
                System.out.println(" data is not in multipart");
            } else {
                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                List items = null;
                try {
                    items = upload.parseRequest(request);
                } catch (FileUploadException e) {
                    System.out.println("file upload error : "+ e.getMessage());
                }

                Iterator itr = items.iterator();
                while (itr.hasNext()) {
                    FileItem item = (FileItem) itr.next();
                     if(!item.isFormField()) {
                        try {
                            imgName = item.getName();
                            System.out.println(imgName);
                            File savedFile = new File(config.getServletContext().getRealPath("/") + imgFolder + "/" + imgName);
                            item.write(savedFile);
                            pic = "uploads/"+imgName;
                           } catch (Exception e) {
                            System.out.println("Error  " + e.getMessage());
                            System.out.println(e.getMessage());
                        }
                    }
                }
                
                 
                }
                 
            }catch(Exception e){
                System.out.println("Error "+e.getMessage());
            }
        
        System.out.println(" img ka nam :" + pic);
        
        return pic;
    }
    
}
