package entry;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * sha-1
 * xuxiaohao
 * 2020/4/15 11:33
 */
public class SHAEntry {

    public static String encrypt(String content){

        if(content == null){
            return content;
        }

        try {
            String result = new String(DigestUtils.sha1Hex(content.getBytes()));
            return result;
        }catch (Exception ex){
            return content;
        }
    }

}
