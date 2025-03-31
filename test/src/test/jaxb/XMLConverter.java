package test.jaxb;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XMLConverter {
	
	public static void main(String[] args) {
		//LMGKnetPaymentStatusCheckRequest createRequest = createRequest();
		xmlConversion(unmarshal()); 
	}

	private static void xmlConversion(LMGKnetPaymentStatusCheckRequest createRequest) {
		try {
			JAXBContext contextObj = JAXBContext.newInstance(LMGKnetPaymentStatusCheckRequest.class);
			Marshaller marshallerObj = contextObj.createMarshaller();  
			//marshallerObj.setProperty(Marshaller.JAXB_FRAGMENT, true);
			StringWriter sw = new StringWriter();
			marshallerObj.marshal(createRequest, sw);
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static LMGKnetPaymentStatusCheckRequest createRequest() {
		LMGKnetPaymentStatusCheckRequest request = new LMGKnetPaymentStatusCheckRequest();
		request.setAction("2");
		request.setAmt(3.3333);
		request.setId("184501");
		request.setPassword("184501pg");
		request.setTrackid("202022520289427");
		request.setTransid("202022520289427");
		request.setUdf5("TransID");
		return request;
	}
	private static LMGKnetPaymentStatusCheckRequest unmarshal()
	{
		LMGKnetPaymentStatusCheckRequest request = null;
		try {
			String xmlString = "<root>\n" + 
					"<id>184501</id>\n" + 
					"<password>184501pg</password>\n" + 
					"<action>2</action>\n" + 
					"<amt>3.3333</amt>\n" + 
					"<transid>202022520289427</transid>\n" + 
					"<trackid>202022520289427</trackid>\n" + 
					"<udf5>TransID</udf5>\n" + 
					"</root>";
			JAXBContext jaxbContext     = JAXBContext.newInstance( LMGKnetPaymentStatusCheckRequest.class );
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			request = (LMGKnetPaymentStatusCheckRequest) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return request;
	}
	
	

}
