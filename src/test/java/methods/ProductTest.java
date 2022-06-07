package methods;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;

public class ProductTest {

	public static void main(String[] args) throws SerializeException {
		// TODO Auto-generated method stub
		
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		String sellerNames[] = {"sony","amazon","friction","samsung"};
	
		Product product =new Product("redmi", "colour", 5000, sellerNames);
		String json = jsonSerializer.serialize(product);
		System.out.print(json);
		
		
		//for XML
		XmlSerializer xmlSerializer = XmlSerializer.DEFAULT_NS_SQ_READABLE;
	   String xml=  xmlSerializer.serialize(product);
	   System.out.println(xml);

	}

}
