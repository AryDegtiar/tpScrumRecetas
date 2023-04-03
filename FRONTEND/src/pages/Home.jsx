import React,{useEffect, useState} from 'react'
import { Row, Col, Card, Button } from 'react-bootstrap';
import Search from '../components/Search'
import List from '../components/List'
import "bootstrap/dist/css/bootstrap.min.css";
import { Recipes } from '../components/Recipes';

const Home = () => {
  const [word, setWord]=useState("")

  const wordSearch = (search) =>{
    fetch('https://jsonplaceholder.typicode.com/users/'+search)
      .then(response => response.json())
      .then(json => console.log(json), setWord(search))
    
  }

  return (
    <div>Home
      <Card>
      <Row>
        <Col  sm={12} lg={4}>
          <Search wordSearch={wordSearch} type="Ingredientes" />
        </Col>
        
        <Col  sm={12} lg={4}>
          <Search wordSearch={wordSearch} type="Recetas" />
        </Col>
        
      </Row>
      <h6>palabra buscada:{word}</h6>
      <List/>
      <Recipes />
      </Card>
    </div>
  )
}

export default Home