package ejemplossinmaven;

import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.factory.Lists;

public class Ejemplo {
	
	public static void main(String[] args) {
		
		ImmutableList<String> pentateuco = 
				Lists.immutable.of("G�nesis", "�xodo", "Lev�tico", "N�meros", "Deuteronomio");
		
		for(String s : pentateuco) {
			System.out.println(s);
		}
				
		
	}

}
