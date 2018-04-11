package main;

import java.util.function.Consumer;

import dao.DaoProducto;
import dao.impl.DaoProductoImplMemory;
import modelo.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DaoProducto dao = new DaoProductoImplMemory();
		
		dao.create(new Producto(1, "Cerveza Cruzcampo", "Botellín de 25cl",0.5f));
		dao.create(new Producto(2, "Jamón Ibérico de Bellota", "Pieza de 7kg aprox.", 300.0f));
		

//		dao.findAll().forEach(new Consumer<Producto>() {
//
//			@Override
//			public void accept(Producto x) {
//				System.out.println(x);
//			}
//		});
//		dao.findAll().forEach(x -> System.out.println(x));
		dao.findAll().forEach(System.out::println);
		System.out.println(dao.findOne(1L));
		
		
	}

}
