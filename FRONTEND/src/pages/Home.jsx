import React,{useEffect, useState} from 'react'
import { Row, Col, Card, Button } from 'react-bootstrap';
import SearchRecipe from '../components/SearchRecipe'
import SearchIngredient from '../components/SearchIngredient'
import List from '../components/List'
import "bootstrap/dist/css/bootstrap.min.css";

const Home = () => {
  const [list, setList]=useState("")

  
  console.log(list)

  return (
    <div>Home
      <Card>
      <Row>
        <Col  sm={12} lg={4}>
          <SearchRecipe setList={setList} type="Recetas" />
        </Col>
        
        <Col  sm={12} lg={4}>
          <SearchIngredient setList={setList} type="Ingredientes" />
        </Col>
      </Row>
      <h6>palabra buscada:</h6>
      <List/>
      </Card>
    </div>
  )
}

export default Home