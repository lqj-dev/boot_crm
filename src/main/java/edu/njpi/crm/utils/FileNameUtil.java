package edu.njpi.crm.utils;

/**
 * @Classname FileNameUtil
 * @Description TODO
 * @Date 2020/11/4 10:48 上午
 * @Created by lqj(1724226325@qq.com)
 */
public class FileNameUtil {
    public static String getRandomFileName(String filename){
        long l = System.currentTimeMillis();
        int index = filename.lastIndexOf(".");
        if(index!=-1) {
            String fileName = filename.substring(0, index);
            String fileType = filename.substring(index + 1);
            return fileName + l + "." + fileType;
        }else{
            return filename;
        }
    }
}
