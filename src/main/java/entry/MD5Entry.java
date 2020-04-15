package entry;

import org.apache.commons.codec.digest.Md5Crypt;

/**
 * xuxiaohao
 * 2020/4/15 11:17
 */
public class MD5Entry {

    public static String encrypt(String content,String salt){

        if(content == null){
            return content;
        }
        try {
            String result = Md5Crypt.md5Crypt(content.getBytes(),salt);
            return result;
        }catch (Exception ex){
            return content;
        }
    }
}
