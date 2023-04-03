import React,{useEffect, useState} from 'react'
import makeAnimated from 'react-select/animated';
import axios from 'axios'
import Select from 'react-select';
const animatedComponents = makeAnimated();

const SearchIngredient = (props) => {
    const [optionsChosen, setOptionsChosen] = useState([])
    const [ingredient, setIngredient]= useState([])
    useEffect( ()=> {
        var list = []
        axios.get('http://localhost:8081/api/v1/ingredientes')
        .then(function (response) {
            // handle success
            response.data.map((data)=>{
                list.push({value:data.nombre, label:data.nombre})
            })
            setIngredient(list)
        })
        
    },[])
    const complete=(event)=>{ 
        
        setOptionsChosen( event.map((e)=>{
                return e.value
            }))
    }
    const post=(event)=>{ 
        axios.get('http://localhost:8081/api/v1/recetas/search?filtrar='+optionsChosen.join(","))
        .then(function (response) {
            // handle success
            console.log(response.data)
            props.setList(response.data.content)
        })
    }
  return (
    <div className="input-group">
        <Select
        closeMenuOnSelect={false}
        components={animatedComponents}
        isMulti
        onChange={(e)=>complete(e)}
        options={ingredient}/>
        <span className="search-btn btn btn-primary" onClick={()=>post()}>
        <i className="feather icon-search "> Buscar </i>
        </span>
    </div>
  )
}

export default SearchIngredient