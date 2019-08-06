package com.qy.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply; 
   
public class FileUtils { 
   
	private static final String FTP_USER_NAME="ftpuser";
	private static final String FTP_PASSWORD="ftpuser";
	private static final String FTP_HOST="192.168.80.143";
	private static final int FTP_PORT=21;
	
	
    /**
     * Description: 向FTP服务器上传文件
     * @Version      1.0
     * @param path  FTP服务器保存目录
     * @param filename  上传到FTP服务器上的文件名
     * @param input   输入流
     * @return 成功返回true，否则返回false *
     */ 
    public static boolean uploadFile( 
            String path, // FTP服务器保存目录 
            String filename, // 上传到FTP服务器上的文件名 
            InputStream input // 输入流 
    ){ 
        boolean success = false; 
        FTPClient ftp = new FTPClient(); 
        ftp.setControlEncoding("UTF-8"); 
        try { 
            int reply; 
            ftp.connect(FTP_HOST, FTP_PORT);// 连接FTP服务器 
            // 如果采用默认端口，可以使用ftp.connect(url)的方式直接连接FTP服务器 
            ftp.login(FTP_USER_NAME, FTP_PASSWORD);// 登录 
            reply = ftp.getReplyCode(); 
            if (!FTPReply.isPositiveCompletion(reply)) { 
                ftp.disconnect(); 
                return success; 
            } 
            ftp.setBufferSize(1024*1024);
            ftp.enterLocalPassiveMode();
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE); 
            ftp.makeDirectory(path); 
            ftp.changeWorkingDirectory(path); 
//            ftp.storeFile(filename, input); 
            OutputStream out = ftp.storeFileStream(filename);
            byte[] byteArray = new byte[12040];
            int read = 0;
            while ((read = input.read(byteArray)) != -1) {
            	out.write(byteArray, 0, read);
            }
            out.close();
            input.close(); 
            ftp.logout(); 
            success = true; 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } finally { 
            if (ftp.isConnected()) { 
                try { 
                    ftp.disconnect(); 
                } catch (IOException ioe) { 
                } 
            } 
        } 
        return success; 
    } 
   
    /**
     * 将本地文件上传到FTP服务器上 *
     */ 
    public static void upLoadFromProduction( 
            String path, // FTP服务器保存目录 
            String filename, // 上传到FTP服务器上的文件名 
            String orginfilename // 输入流文件名 
       ) { 
        try { 
            FileInputStream in = new FileInputStream(new File(orginfilename)); 
            boolean flag = uploadFile(path,filename, in); 
            System.out.println(flag); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
}  