package com.mitocode;

import com.mitocode.inter.impl.FabricaDamas;
import com.mitocode.inter.impl.FabricaNinos;

public class App {

	public static void main(String[] args) {
		String url = "https://www.youtube.com/watch?v=L7EVhblsLNY";
		System.out.println(" https://www.youtube.com/watch?v=L7EVhblsLNY" + url);
		FabricaAbstrac fabricaDamas = FabricaProductor.getFactory("damas");
		Calzado formalDamas = fabricaDamas.crearCalzadoFormal();
		System.out.println(formalDamas);

		// Elige fábrica de niños
		FabricaAbstrac fabricaNinos = FabricaProductor.getFactory("ninos");
		Calzado deportivoNinos = fabricaNinos.crearCalzadoDeportivo();
		System.out.println(deportivoNinos);

	}
}
