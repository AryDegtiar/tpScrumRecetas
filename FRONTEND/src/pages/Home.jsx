import React,{useEffect, useState} from 'react'
import { Row, Col, Card, Button } from 'react-bootstrap';
import SearchRecipe from '../components/SearchRecipe'
import SearchIngredient from '../components/SearchIngredient'
import List from '../components/List'
import "bootstrap/dist/css/bootstrap.min.css";
import { Recipe, Recipes } from '../components/Recipes';

const Home = () => {
  const [list, setList]=useState([])

  
  console.log(list)

  return (
    <div>Home
      <Card>
      <Row>
        
        <Col  sm={12} lg={8}>
          <SearchIngredient setList={setList} type="Ingredientes" />
        </Col>
      </Row>
      {/*{list.length > 0 ? list.map((data)=>(

                  <Recipe  name={data.nombre} description={data.descripcion} image={data.imagen} ingredients={data.ingredientes} />
            )): " no hay productos"}
      <List/>*/}
      <Recipes recipes={list} setRecipes={setList}/>
      </Card>
    </div>
  )
}

export default Home