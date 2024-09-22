package com.mitocode;

public class FabricaProductor {
	public static FabricaAbstrac getFactory(String tipo) {
		switch (tipo.toLowerCase()) {
			case "damas":
				return new FabricaDamas();
			case "caballeros":
				return new FabricaCaballeros();
			case "ninos":
				return new FabricaNinos();
			default:
				return null;
		}
	}
}
