package test.jaxb;
import java.io.*;
public class StringToInputStreamTest {
   public static void main(String []args) throws Exception {
      String str = "<result>CAPTURED</result><auth>B24047</auth><ref>024110000636</ref><postdate>0829</postdate><tranid>202024178509663</tranid><trackid>159852685300063348</trackid><payid>100202024086546767</payid><udf2></udf2><udf5>TrackID</udf5><amt>1.144</amt><authRespCode>00</authRespCode>";
      InputStream input = getInputStream(str, null);
      int i;
      while ((i = input.read()) > -1) {
         System.out.print((char) i);
      }
      System.out.println();
      PushbackInputStream pushbackInputStream = new PushbackInputStream(input);
		int b = pushbackInputStream.read();
		if (b == -1) {
			System.out.println("true");
		}
   }
   public static InputStream getInputStream(String str, String encoding) throws          UnsupportedEncodingException {
      return new ByteArrayInputStream(str.getBytes(encoding));
   }
}