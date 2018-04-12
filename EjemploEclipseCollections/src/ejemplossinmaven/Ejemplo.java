package ejemplossinmaven;

import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.factory.Lists;

public class Ejemplo {
	
	public static void main(String[] args) {
		
		ImmutableList<String> pentateuco = 
				Lists.immutable.of("Génesis", "Éxodo", "Levítico", "Números", "Deuteronomio");
		
		for(String s : pentateuco) {
			System.out.println(s);
		}
				
		
	}

}
