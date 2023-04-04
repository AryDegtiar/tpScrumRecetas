import { useEffect, useState } from "react"
import { getRecipes } from "../services/recipes.service"
import { Recipe } from "../components/Recipe"

export function Recipes({recipes, setRecipes}) {
  //const [recipes, setRecipes] = useState([])

  useEffect(() => {
    async function effect() {
      const response = await getRecipes()
      setRecipes(response)
    }

    effect()
  }, [])

  return (
    <div className="flex flex-col items-center gap-2 m-10 p-4 rounded-lg bg-gray-100">
      <h1 className="font-primaryT font-black uppercase text-4xl text-black mb-4">Recetas populares</h1>
      <div className="flex flex-wrap gap-3 justify-center">
        {recipes.map(({nombre, descripcion, imagen, ingredientes}) => (
          <Recipe name={nombre} description={descripcion} image={imagen} ingredients={ingredientes}/>
        ))}
      </div>
    </div>
  )
}