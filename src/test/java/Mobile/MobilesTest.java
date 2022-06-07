package Mobile;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;

public class MobilesTest {

	public static void main(String[] args) throws SerializeException {
		// TODO Auto-generated method stub
		
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		String sellerNames[] = {"sumsung","amazon","flipkart","meeshow"};
		Mobiles mobile = new Mobiles("sony","white",10000,sellerNames);
		String json = jsonSerializer.serialize(mobile);
		System.out.println(json);

	}

}

