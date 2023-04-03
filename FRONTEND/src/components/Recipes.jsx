import { useEffect, useState } from "react"
import { getRecipes } from "../services/recipes.service"

export function Recipes() {
  const [recipes, setRecipes] = useState([])

  useEffect(() => {
    async function effect() {
      const response = await getRecipes()
      setRecipes(response)
    }

    effect()
  }, [])

  console.log(recipes)

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

export function Recipe({name, description, image, ingredients}) {
  return (
    <div className={`relative flex flex-col cursor-pointer min-w-[260px] min-h-[130px] p-3 py-4 rounded-md bg-gradient-to-r from-primaryT from-90% to-transparent hover:shadow-md hover:scale-105 ease-in duration-100 overflow-hidden`}>
      <div className="z-10">
        <h4 className="font-primaryT capitalize text-md font-bold text-white leading-4 drop-shadow-md shadow-[blue]">{name}</h4>
        <p className="font-primaryT italic font-semibold text-xs text-gray-600">
          {description}
        </p>
        <div className="flex gap-1 font-primaryT text-xs text-gray-100">
          <span className="font-black capitalize">Ingredientes:</span>
          <p className="font-bold text-gray-100">
            {
              ingredients.map(i => (
                i.nombre + "-"
              ))
            }
          </p>
        </div>
      </div>
      <div className="z-0 justify-end absolute top-0 left-0 flex w-full h-full overflow-hidden">
        <img src={image} alt={name} className="w-52 h-full object-cover rounded-full translate-x-14" />
      </div>
    </div>
  )
}