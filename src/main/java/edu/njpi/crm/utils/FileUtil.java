package edu.njpi.crm.utils;

/**
 * @Classname FileUtil
 * @Description TODO
 * @Date 2020/11/30 10:48 上午
 * @Created by lqj(1724226325@qq.com)
 */
public class FileUtil {
    public static String getRandomFileName(String fileName){
        //1. 获取文件名
        int index = fileName.lastIndexOf(".");
        String name=fileName.substring(0,index);
        String suffix=fileName.substring(index+1);
        name=name+System.currentTimeMillis();
        return name+suffix;
    }
}
