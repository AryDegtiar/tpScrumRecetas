import { useState } from "react"

const recipes3 = [
  {
    name: "pollo al horno con papas",
    description: "receta vegana para comer en 2hs",
    ingredients: ["papas", "pollo", "cebolla", "aji"],
  },
  {
    name: "pollo al horno con papas",
    description: "receta vegana para comer en 2hs",
    ingredients: ["papas", "pollo", "cebolla", "aji"],
  },
  {
    name: "pollo al horno con papas",
    description: "receta vegana para comer en 2hs",
    ingredients: ["papas", "pollo", "cebolla", "aji"],
  },
  {
    name: "pollo al horno con papas",
    description: "receta vegana para comer en 2hs",
    ingredients: ["papas", "pollo", "cebolla", "aji"],
  },
]

export function Recipes() {
  const [recipes, setRecipes] = useState(recipes3)

  return (
    <div className="flex flex-col items-center gap-2 m-10 p-4 rounded-lg bg-gray-100">
      <h1 className="font-primaryT font-black uppercase text-4xl text-black mb-4">Recetas populares</h1>
      <div className="flex flex-wrap gap-3 justify-center">
        {recipes.map(({name, ingredients, description}) => (
          <Recipe name={name} ingredients={ingredients} description={description}/>
        ))}
      </div>
    </div>
  )
}

export function Recipe({name, description, ingredients}) {
  return (
    <div className="flex flex-col cursor-pointer min-w-[260px] min-h-[130px] p-3 rounded-md bg-gradient-to-r from-primaryT from-90% to-transparent hover:shadow-md hover:scale-105 ease-in duration-100">
      <h4 className="font-primaryT capitalize text-md font-bold text-white mb-3">{name}</h4>
      <p className="font-primaryT capitalize font-semibold text-xs text-black">
        {description}
      </p>
      <div className="flex gap-1 font-primaryT text-xs text-black">
        <span className="capitalize font-black">
          Ingredientes:
        </span>
        <p className="capitalize font-normal">
          {ingredients.map((i) => (
            i + "-"
          ))}
        </p>
      </div>
    </div>
  )
}