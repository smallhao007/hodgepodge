package entry;

import org.apache.commons.codec.binary.Base64;


/**
 * xuxiaohao
 * 2020/4/15 10:22
 */
public class BASE64Entry {

    public static String encrypt(String content){

        if(content == null){
            return content;
        }

        try {
            String result = new String (Base64.encodeBase64(content.getBytes()));
            return result;
        }catch (Exception ex){
            return content;
        }
    }

    public static String decrypt(String content){

        if(content == null){
            return content;
        }

        try {
            String result = new String(Base64.decodeBase64(content));
            return result;
        }catch (Exception ex){
            return content;
        }
    }
}
