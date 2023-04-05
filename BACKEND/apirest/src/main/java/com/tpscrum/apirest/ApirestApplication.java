package com.tpscrum.apirest;

import com.tpscrum.apirest.entities.CategoriaIngrediente;
import com.tpscrum.apirest.entities.CategoriaReceta;
import com.tpscrum.apirest.entities.Ingrediente;
import com.tpscrum.apirest.entities.Receta;
import com.tpscrum.apirest.repositories.CategoriaIngredienteRepository;
import com.tpscrum.apirest.repositories.CategoriaRecetaRepository;
import com.tpscrum.apirest.repositories.IngredienteRepository;
import com.tpscrum.apirest.repositories.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApirestApplication {

	@Autowired private RecetaRepository recetaRepository;
	@Autowired private CategoriaRecetaRepository categoriaRecetaRepository;
	@Autowired private CategoriaIngredienteRepository categoriaIngredienteRepository;
	@Autowired private IngredienteRepository ingredienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}

	@Bean
	public CommandLineRunner init() {
		return (args) -> {


			// Guardo algunas categorias de recetas en la base de datos
			CategoriaReceta CategoriaReceta1 = new CategoriaReceta("Comidas", "Comidas");
			categoriaRecetaRepository.save(CategoriaReceta1);

			CategoriaReceta CategoriaReceta2 = new CategoriaReceta("Postres", "Postres");
			categoriaRecetaRepository.save(CategoriaReceta2);

			CategoriaReceta CategoriaReceta3 = new CategoriaReceta("Merienda", "Merienda");
			categoriaRecetaRepository.save(CategoriaReceta3);

			CategoriaReceta CategoriaReceta4 = new CategoriaReceta("Bebidas", "Bebidas");
			categoriaRecetaRepository.save(CategoriaReceta4);

			CategoriaReceta CategoriaReceta5 = new CategoriaReceta("Ensaladas", "Ensaladas");
			categoriaRecetaRepository.save(CategoriaReceta5);


			// Guardo algunas categorias de ingredientes en la base de datos
			CategoriaIngrediente categoriaIngrediente1 = new CategoriaIngrediente("Carne", "Carne");
			categoriaIngredienteRepository.save(categoriaIngrediente1);

			CategoriaIngrediente categoriaIngrediente2 = new CategoriaIngrediente("Verdura", "Verdura");
			categoriaIngredienteRepository.save(categoriaIngrediente2);

			CategoriaIngrediente categoriaIngrediente3 = new CategoriaIngrediente("Fruta", "Fruta");
			categoriaIngredienteRepository.save(categoriaIngrediente3);

			CategoriaIngrediente categoriaIngrediente4 = new CategoriaIngrediente("Legumbre", "Legumbre");
			categoriaIngredienteRepository.save(categoriaIngrediente4);

			CategoriaIngrediente categoriaIngrediente5 = new CategoriaIngrediente("Panaderia", "Alimentos de panaderia");
			categoriaIngredienteRepository.save(categoriaIngrediente5);

			CategoriaIngrediente categoriaIngrediente6 = new CategoriaIngrediente("Lácteos", "Productos lácteos");
			categoriaIngredienteRepository.save(categoriaIngrediente6);

			CategoriaIngrediente categoriaIngrediente7 = new CategoriaIngrediente("Frutos secos", "Frutos secos");
			categoriaIngredienteRepository.save(categoriaIngrediente7);

			// Guardo algunos ingredientes en la base de datos
			Ingrediente ingrediente1 = new Ingrediente("Bola de lomo", "Feteada fina", 1);
			ingrediente1.setCategoria(categoriaIngrediente1);
			ingredienteRepository.save(ingrediente1);

			Ingrediente ingrediente2 = new Ingrediente("Salmon", "Salmon rosado", 1);
			ingrediente2.setCategoria(categoriaIngrediente1);
			ingredienteRepository.save(ingrediente2);

			Ingrediente ingrediente3 = new Ingrediente("Cebolla de verdeo", "Verdura", 1);
			ingrediente3.setCategoria(categoriaIngrediente2);
			ingredienteRepository.save(ingrediente3);

			Ingrediente ingrediente4 = new Ingrediente("Limon", "Jugo de limon", 1);
			ingrediente4.setCategoria(categoriaIngrediente3);
			ingredienteRepository.save(ingrediente4);

			Ingrediente ingrediente5 = new Ingrediente("Champignon", "champignon", 6);
			ingrediente5.setCategoria(categoriaIngrediente2);
			ingredienteRepository.save(ingrediente5);

			Ingrediente ingrediente6 = new Ingrediente("Papa", "Papa frita", 2);
			ingrediente6.setCategoria(categoriaIngrediente2);
			ingredienteRepository.save(ingrediente6);

			Ingrediente ingrediente7 = new Ingrediente("Pan rallado", "Pan rallado fino",1);
			ingrediente6.setCategoria(categoriaIngrediente5);
			ingredienteRepository.save(ingrediente7);

			Ingrediente ingrediente8 = new Ingrediente("Pollo", "Deshuesado", 3);
			ingrediente1.setCategoria(categoriaIngrediente1);
			ingredienteRepository.save(ingrediente8);

			Ingrediente ingrediente9 = new Ingrediente("Leche", "Leche descremada", 1);
			ingrediente9.setCategoria(categoriaIngrediente6);
			ingredienteRepository.save(ingrediente9);

			Ingrediente ingrediente10 = new Ingrediente("Café", "Café molido", 1);
			ingrediente10.setCategoria(categoriaIngrediente3);
			ingredienteRepository.save(ingrediente10);

			Ingrediente ingrediente11 = new Ingrediente("Queso", "Queso rallado", 2);
			ingrediente11.setCategoria(categoriaIngrediente6);
			ingredienteRepository.save(ingrediente11);

			Ingrediente ingrediente12 = new Ingrediente("Nuez", "Nuez picada", 1);
			ingrediente12.setCategoria(categoriaIngrediente7);
			ingredienteRepository.save(ingrediente12);

			Ingrediente ingrediente13 = new Ingrediente("Arroz", "Arroz", 1);
			ingrediente13.setCategoria(categoriaIngrediente7);
			ingredienteRepository.save(ingrediente13);

			Ingrediente ingrediente14 = new Ingrediente("ajo", "ajo", 1);
			ingrediente14.setCategoria(categoriaIngrediente2);
			ingredienteRepository.save(ingrediente14);

			// Guardo algunas recetas en la base de datos
			Receta receta1 = new Receta("Milanesa con papas fritas", "Milanesa de lomo con papas fritas","https://astelus.com/wp-content/viajes/Plato-de-milanesa-con-papas-ti%CC%81pico-de-Argentina.jpg");
			receta1.agregarIngrediente(ingrediente1);
			receta1.agregarIngrediente(ingrediente6);
			receta1.agregarIngrediente(ingrediente7);
			recetaRepository.save(receta1);

			Receta receta2 = new Receta("Pollo con papas fritas", "Pollo con papas fritas", "https://elorigendelsabor.com.ar/wp-content/uploads/2022/06/pollo1.jpg");
			receta2.agregarIngrediente(ingrediente8);
			receta2.agregarIngrediente(ingrediente6);
			recetaRepository.save(receta2);

			Receta receta3 = new Receta("Pollo al champignon", "Pollo al champignon", "https://assets.unileversolutions.com/recipes-v2/210719.jpg");
			receta3.agregarIngrediente(ingrediente8);
			receta3.agregarIngrediente(ingrediente5);
			recetaRepository.save(receta3);

			Receta receta4 = new Receta("Café con leche", "Café con leche", "https://ichef.bbci.co.uk/news/976/cpsprodpb/154B9/production/_116484932_coffeewithmilk.jpg");
			receta4.agregarIngrediente(ingrediente9);
			receta4.agregarIngrediente(ingrediente10);
			recetaRepository.save(receta4);

			Receta receta5 = new Receta("Ensalada César", "Ensalada César", "https://www.thecookierookie.com/wp-content/uploads/2019/07/Classic-Caesar-Salad-Recipe-6.jpg");
			receta5.agregarIngrediente(ingrediente2);
			receta5.agregarIngrediente(ingrediente3);
			receta5.agregarIngrediente(ingrediente11);
			recetaRepository.save(receta5);

			Receta receta6 = new Receta("Tarta de nueces", "Tarta de nueces", "https://www.hola.com/imagenes/cocina/recetas/20220331198612/tarta-nueces-queso-batido/0-101-958/tarta-nueces-queso-batido-t.jpg");
			receta6.agregarIngrediente(ingrediente12);
			receta6.agregarIngrediente(ingrediente5);
			receta6.agregarIngrediente(ingrediente7);
			recetaRepository.save(receta6);

			Receta receta7 = new Receta("Tarta de cebolla y queso", "Tarta de cebolla y queso", "https://www.lacocinadelila.com/wp-content/uploads/2019/04/Tarta-de-cebolla-y-queso.jpg");
			receta7.agregarIngrediente(ingrediente9);
			receta7.agregarIngrediente(ingrediente10);
			receta7.agregarIngrediente(ingrediente11);
			receta7.agregarIngrediente(ingrediente3);
			recetaRepository.save(receta7);

			Receta receta8 = new Receta("Sopa de cebolla gratinada", "Sopa de cebolla gratinada", "https://www.recetasderechupete.com/wp-content/uploads/2017/02/Sopa-de-cebolla-gratinada-receta.jpg");
			receta8.agregarIngrediente(ingrediente9);
			receta8.agregarIngrediente(ingrediente2);
			receta8.agregarIngrediente(ingrediente4);
			receta8.agregarIngrediente(ingrediente8);
			recetaRepository.save(receta8);

			Receta receta9 = new Receta("Pollo con cebolla y pimiento", "Pollo con cebolla y pimiento", "https://www.cocinacaserayfacil.net/wp-content/uploads/2019/08/Pollo-con-cebolla-y-pimiento.jpg");
			receta9.agregarIngrediente(ingrediente1);
			receta9.agregarIngrediente(ingrediente3);
			receta9.agregarIngrediente(ingrediente6);
			receta9.agregarIngrediente(ingrediente9);
			recetaRepository.save(receta9);

			Receta receta10 = new Receta("Arroz con cebolla y ajo", "Arroz con cebolla y ajo", "https://cocina-casera.com/multimedia/recetas/tm/Arroz-con-cebolla-y-ajo.jpg");
			receta10.agregarIngrediente(ingrediente13);
			receta10.agregarIngrediente(ingrediente3);
			receta10.agregarIngrediente(ingrediente14);
			recetaRepository.save(receta10);

			Receta receta11 = new Receta("Sopa de cebolla", "Sopa de cebolla", "https://www.comedera.com/wp-content/uploads/2017/10/Sopa-de-cebolla.jpg");
			receta11.agregarIngrediente(ingrediente3);
			recetaRepository.save(receta11);

			Receta receta13 = new Receta("Pollo a la parrilla", "Pollo a la parrilla", "https://www.ecestaticos.com/image/clipping/b1429d45f0598c6e45c04b67f37c787f/pollo-a-la-parrilla-trucos-para-que-quede-ternero-y-sabroso.jpg");
			receta13.agregarIngrediente(ingrediente8);
			recetaRepository.save(receta13);

			Receta receta16 = new Receta("Salteado de champiñones y pollo", "Salteado de champiñones y pollo", "https://www.recetasgratis.net/images/2/7/1/img_salteado_de_champinones_y_pollo_41712_orig.jpg");
			receta16.agregarIngrediente(ingrediente5);
			receta16.agregarIngrediente(ingrediente8);
			receta16.agregarIngrediente(ingrediente3);
			recetaRepository.save(receta16);

			Receta receta17 = new Receta("Salmón a la plancha con ensalada", "Salmón a la plancha con ensalada", "https://www.recetasgratis.net/images/3/3/3/img_salon_a_la_plancha_con_ensalada_23333_orig.jpg");
			receta17.agregarIngrediente(ingrediente2);
			receta17.agregarIngrediente(ingrediente4);
			receta17.agregarIngrediente(ingrediente6);
			recetaRepository.save(receta17);

			Receta receta18 = new Receta("Milanesas de pollo con puré de papas", "Milanesas de pollo con puré de papas", "https://www.recetasgratis.net/images/1/7/8/img_milanesas_de_pollo_con_pure_de_papas_85871_orig.jpg");
			receta18.agregarIngrediente(ingrediente6);
			receta18.agregarIngrediente(ingrediente7);
			receta18.agregarIngrediente(ingrediente8);
			recetaRepository.save(receta18);
		};
	}
}