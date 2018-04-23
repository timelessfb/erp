package edu.uestc.ssmdemo.Tool;

import java.io.*;

/**
 * Created by hu on 2018-04-23.
 */
public class SerializeObjectTool {
    /**
     * �������л�Ϊ�ַ���
     * @param obj
     * @return
     */
    public static byte[] SerializeObject(Object obj) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(os);
        out.writeObject(obj);
        byte[] bytes = os.toByteArray();
        return bytes;
    }

       /**
      * �ַ������л�Ϊ����
      * @param objectByte
      * @return
      * @throws Exception
      */
    public static Object ReSerializeObject(byte[] objectByte)throws Exception{
        ByteArrayInputStream is = new ByteArrayInputStream(objectByte);
        ObjectInputStream in = new ObjectInputStream(is);
        return in.readObject();
    }
}
