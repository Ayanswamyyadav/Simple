package Products;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;

public class TvTest {

	public static void main(String[] args) throws SerializeException {
		// POJO TO XML and also how will you serialize
		//there is xmlserizer/jsonserializers is avalable
		
		XmlSerializer xmlSerializer = XmlSerializer.DEFAULT_NS_SQ_READABLE;
		//defult readle we have use one referance serializer
		String types[] = {"sumsung","redmi","nokia","dell"};
		String distributers[] = {"amazon","flipkart","meeshow","delivery"};
		Tv tv =new Tv("sumsung", "black", "2000", types, distributers);
		//im going to create object of the tv 
		//types is the array so going to create string types and define the types tvs 
		String xml = xmlSerializer.serialize(tv);//there is a method is called is serialize method and insert the pojo object    
		System.out.println(xml);
		//then try to print that XML
		
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		String json = jsonSerializer.serialize(tv);
		System.out.println(json);
		
		

	}

}
